package gherkin.stepdefinition;

import br.com.pom.pageObject.CadastroVivara;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebDriver;

public class CadastroVivaraSteps {

    private CadastroVivara cadastroVivara = new CadastroVivara();

    @Dado("que eu acesse a url vivara {string}")
    public void queEuAcesseAUrlVivara(String urlVivara) {
        cadastroVivara.acessarSiteVivara(urlVivara);
    }

    @Quando("selecionar Novo Cadastro")
    public void selecionarNovoCadastro() {
        cadastroVivara.selecionarNaoTenhoCadastro();
    }

    @E("realizar cadastro")
    public void realizarCadastro() {
        cadastroVivara.realizarCadastroVivara();
    }

    @E("preencher dados")
    public void preencherDados(DataTable dataTable) {
        cadastroVivara.preencherDados(dataTable);
        cadastroVivara.selecionarGenero();
    }

    @E("seleciono Proximo")
    public void selecionoProximo() {
        cadastroVivara.selecionarProximo();
    }

    @E("preencho dados de endereço")
    public void preenchoDadosDeEndereço(DataTable dataTable) {
        cadastroVivara.preencherDadosEndereco(dataTable);
    }

    @E("preencho dados de contato")
    public void preenchoDadosDeContato(DataTable dataTable) {
        cadastroVivara.preencherDadosContato(dataTable);
    }

    @Entao("Conclui cadastro com sucesso")
    public void concluiCadastroComSucesso() {
        cadastroVivara.concluirCadastro();
    }
}
