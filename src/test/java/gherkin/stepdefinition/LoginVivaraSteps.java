package gherkin.stepdefinition;

import br.com.pom.pageObject.LoginVivara;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebDriver;

public class LoginVivaraSteps {

    LoginVivara loginVivara = new LoginVivara();

    @Quando("preencher login")
    public void preencherLoginVivara(DataTable dataTable, WebDriver driver) {
        loginVivara.preencherLoginVivara(dataTable, driver);
    }

    @Quando("seleciono entrar")
    public void selecionoEntrar(WebDriver driver) {
        loginVivara.selecionarEntrarVivara(driver);
    }

    @Entao("realizo login com sucesso")
    public void validarLogin() {
        loginVivara.validarLogin();
    }
}
