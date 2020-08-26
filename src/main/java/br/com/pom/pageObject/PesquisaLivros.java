package br.com.pom.pageObject;

import br.com.core.driver.DriverHandler;
import br.com.core.setup.DriverManager;
import br.com.pom.constantes.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class PesquisaLivros extends DriverManager implements Util {


    WebDriver driver = DriverHandler.getDriver();
    private By txtBuscarLivro = By.id("s");
    private By btnBaixarOuLerOnline = By.xpath("//*[text()='Baixar ou Ler Online']");

    /**Método referente o acesso à tela de pesquisa
     * @author Marcilene Ribeiro
     */
    public void acessaTelaPesquisa(String url) {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get(url);
    }

    public void buscarLivro() {
        driver.findElement(txtBuscarLivro).sendKeys();
    }

    public void baixarOuLerOnline(WebDriver driver) {
        driver.findElement(btnBaixarOuLerOnline).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
    }
}
