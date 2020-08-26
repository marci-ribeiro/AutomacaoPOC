package br.com.pom.pageObject;

import br.com.core.driver.DriverHandler;
import br.com.pom.constantes.Util;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class CadastroVivara implements Util {

    private WebDriver driver = DriverHandler.getDriver();

    private By btnCriarMinhaConta = By.xpath("//*[text()='CRIAR MINHA CONTA']");
    private By btnPessoaFisica = By.id("radio_2");
    private By txtCpf = By.id("input_4");
    private By txtNome = By.id("input_5");
    private By txtSobreNome = By.id("input_6");
    private By txtCelular = By.id("input_7");
    private By txtDataDeNasc = By.id("input_8");
    private By ckbGenero = By.id("genderSelect");
    private By ckbGeneroM = By.id("select_option_10");
    private By btnProximo = By.xpath("//*[text()= 'Próximo']");
    private By txtCep = By.id("input_13");
    private By txtEndereco = By.id("input_14");
    private By txtNumero = By.id("input_15");
    private By txtComplemento = By.id("input_16");
    private By txtBairro = By.id("input_17");
    private By cbkEstado = By.id("select_value_label_12");
    private By txtCidade = By.id("input_20");
    private By txtEmail = By.name("inputEmail");
    private By txtSenha = By.name("inputPassword");
    private By txtConfirmarSenha = By.name("inputPasswordConfirmation");
    private By btnConcluirCadastro = By.xpath("//*[text()='Concluir Cadastro']");

    public void acessarSiteVivara(String urlVivara) {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(urlVivara);
    }

    public void selecionarNaoTenhoCadastro() {
        driver.findElement(btnCriarMinhaConta).click();
    }

    public void realizarCadastroVivara () {
        driver.findElement(btnPessoaFisica).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

    }

    public void preencherDados(DataTable dataTable) {
        List<Map<String,String>> table = dataTable.asMaps();

        for (Map<String,String> row : table){
            for(String campo : row.keySet()){
                String resposta = row.get(campo);
                switch (campo.toUpperCase()){
                    case "CPF":
                        driver.findElement(txtCpf).sendKeys(resposta);
                        break;
                    case "NOME":
                        driver.findElement(txtNome).sendKeys(resposta);
                        break;
                    case "SOBRENOME":
                        driver.findElement(txtSobreNome).sendKeys(resposta);
                        break;
                    case "CELULAR":
                        driver.findElement(txtCelular).sendKeys(resposta);
                        break;
                    case "DATADENASC":
                        driver.findElement(txtDataDeNasc).sendKeys(resposta);
                        break;
                    default:
                        Assert.fail("Coluna não encontrada!");
                }
            }
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void selecionarGenero() {
        driver.findElement(ckbGenero).click();
        driver.findElement(ckbGeneroM).click();
    }

    public void selecionarProximo() {
        driver.findElement(btnProximo).click();
    }

    public void preencherDadosEndereco(DataTable dataTable) {
        List<Map<String,String>> table = dataTable.asMaps();

        for (Map<String,String> row : table){
            for(String campo : row.keySet()){
                String resposta = row.get(campo);
                switch (campo.toUpperCase()){
                    case "CEP":
                        driver.findElement(txtCep).sendKeys(resposta);
                        driver.findElement(txtEndereco).click();
                        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                        break;
                    case "NUMERO":
                        driver.findElement(txtNumero).sendKeys(resposta);
                        break;
                    case "COMPLEMENTO":
                        driver.findElement(txtComplemento).sendKeys(resposta);
                        break;
                    default:
                        Assert.fail("Coluna não encontrada!");
                }
            }
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("radio_21")).click();
        //seleciona proximo chamando o metodo no BDD
    }

    public void preencherDadosContato(DataTable dataTable) {
        List<Map<String,String>> table = dataTable.asMaps();

        for (Map<String,String> row : table){
            for(String campo : row.keySet()){
                String resposta = row.get(campo);
                switch (campo.toUpperCase()){
                    case "EMAIL":
                        driver.findElement(txtEmail).sendKeys(resposta);
                        break;
                    case "SENHA":
                        driver.findElement(txtSenha).sendKeys(resposta);
                        break;
                    case "CONFIRMARSENHA":
                        driver.findElement(txtConfirmarSenha).sendKeys(resposta);
                    default:
                        Assert.fail("Coluna não encontrada!");
                }
            }
        }

        driver.findElement(By.xpath("/main/section/span/div/div/div/form/div[1]/div/ul/li[3]/md-input-container/md-checkbox/div[1]")).click();
    }

    public void concluirCadastro() {
        driver.findElement(btnConcluirCadastro).click();
    }
}
