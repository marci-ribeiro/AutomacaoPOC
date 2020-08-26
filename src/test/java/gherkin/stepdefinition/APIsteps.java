package gherkin.stepdefinition;

import br.com.core.report.ExtentReports;
import br.com.core.setup.DriverManager;
import cucumber.api.java.pt.Entao;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;
import static io.restassured.config.EncoderConfig.encoderConfig;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.beans.SamePropertyValuesAs.samePropertyValuesAs;
import static org.testng.AssertJUnit.assertEquals;
import br.com.pom.pageObject.BookApiCorreio;
import cucumber.api.java.pt.Quando;

public class APIsteps {

    private BookApiCorreio bookApiCorreio;
    private BookApiCorreio expectedBookApiCorreio;
    private Response response;

    @Quando("envio uma requisicao de Get request para API {string}")
    public void envioUmaRequisicaoDeGetRequestParaAPI(String urlApiCorreio) {
        RequestSpecification httpRequest = given();
        String completeUrl = urlApiCorreio;
        ExtentReports.appendToReport("Request: " + completeUrl);
        response = httpRequest.get(completeUrl);
        bookApiCorreio = response.as(BookApiCorreio.class, ObjectMapperType.GSON);
        expectedBookApiCorreio = new BookApiCorreio(200,true, "05847-620", "SP", "São Paulo", "Jardim Brasília", "Rua Yoshimara Minamoto", "ok");
    }

    @Entao("o HTTP status {int} sera retornado com alguma descricao do book")
    public void oHTTPStatusSeraRetornadoComAlgumaDescricaoDoBook(int responseHttp) {
        ExtentReports.appendToReport("Status Http: " + response.getStatusCode());
        ExtentReports.appendToReport(response.asString());
        assertThat(bookApiCorreio, samePropertyValuesAs(expectedBookApiCorreio));


        System.out.println("########################## responseHttp: " + responseHttp);
        System.out.println("########################## response.getStatusCode(): " + response.getStatusCode());
        assertEquals(responseHttp, response.getStatusCode());
    }

}
