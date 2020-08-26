package br.com.pom.pageObject;

import br.com.core.report.ExtentReports;
import br.com.core.setup.DriverManager;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;

public class LoginVivara {

    private By txtUser = By.name("inputUsername");
    private By txtSenhaEntrar = By.name("inputPassword");
    private By btnEntrar = By.name("submitLoginButton");

    public void preencherLoginVivara(DataTable dataTable, WebDriver driver) {
        List<Map<String,String>> table = dataTable.asMaps();

        for (Map<String,String> row : table){
            for(String campo : row.keySet()){
                String resposta = row.get(campo);
                switch (campo.toUpperCase()){
                    case "USER":
                        driver.findElement(txtUser).sendKeys(resposta);
                        break;
                    case "SENHAENTRAR":
                        driver.findElement(txtSenhaEntrar).sendKeys(resposta);
                        break;
                    default:
                        Assert.fail("Coluna não encontrada!");
                }
            }
        }
    }

    public void selecionarEntrarVivara(WebDriver driver) {
        driver.findElement(btnEntrar).click();
        try {
            driver.wait(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void validarLogin() {
        Assert.assertEquals(txtUser, txtUser);
    }

}
