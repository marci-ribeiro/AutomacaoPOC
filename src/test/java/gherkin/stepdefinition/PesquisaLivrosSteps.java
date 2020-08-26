package gherkin.stepdefinition;

import br.com.pom.pageObject.PesquisaLivros;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.WebDriver;

public class PesquisaLivrosSteps {

    private PesquisaLivros pesquisaLivros = new PesquisaLivros();

    @Dado("que eu acesse a url {string}")
    public void queEuAcesseAUrl(String url) {
        pesquisaLivros.acessaTelaPesquisa(url);
    }

    @Quando("buscar o livro")
    public void buscarOLivro(WebDriver driver) {
        pesquisaLivros.buscarLivro();
    }

    @Entao("eu encontro a opcao de baixar ou ler online para selecionar")
    public void euEncontroAOpcaoDeBaixarOuLerOnlineParaSelecionar(WebDriver driver) {
        pesquisaLivros.baixarOuLerOnline(driver);
    }

}
