package com.everis.ct.web.glue;

import com.everis.ct.web.WebAutomationApplication;
import com.everis.ct.web.lib.WebDriverManager;
import com.everis.ct.web.step.ExitoStep;
import com.everis.ct.web.step.GoogleSearchStep;
import com.everis.ct.web.step.GoogleSettingsStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.annotation.Target;

@CucumberContextConfiguration
@SpringBootTest(classes = WebAutomationApplication.class)
public class GoogleStepDefinition {

    @Value("${url.google}")
    private String urlGoogle;
    @Value("https://www.exito.com/?gclid=CjwKCAjwzuqgBhAcEiwAdj5dRnnArtpouydCGxlsoaalV4nD2ze5BiuTdAEkVsEvYw7QWsMb8N3-BBoCv8gQAvD_BwE&gclsrc=aw.ds")
    private String urlGoogleSettings;

    //@Autowired
    private WebDriverManager manager;

    //@Autowired
    private GoogleSearchStep searchStep;

    //@Autowired
    private GoogleSettingsStep settingsStep; //demo shadowRoot




    @Given("que abro la pagina de google")
    public void queAbroLaPaginaDeGoogle() {
        manager.navigateTo(urlGoogle);
    }

    @Given("que abro la pagina de configuracio de google")
    public void queAbroLaPaginaDeConfiguracioDeGoogle() {
        manager.navigateTo(urlGoogleSettings);
    }

    @When("escribo la busqueda de: {string}")
    public void escriboLaBusquedaDe(String busqueda) {
        searchStep.searchData(busqueda);
    }

    @Then("valido que los resultados sean mayores a {int}")
    public void validoQueLosResultadosSeanMayoresA(int count) {
        searchStep.validateResults(count);
    }

    @When("busco la opcion {string}")
    public void buscoLaOpcion(String option) {
        settingsStep.searchSettings(option);
    }

    @Then("valido que el resultado sea {string}")
    public void validoQueElResultadoSea(String result) {
        settingsStep.validateValueResult(result);
    }

    @Dado("que abro la pagina del exito")
    public void queAbroLaPaginaDelExito() {manager.navigateTo(urlGoogleSettings);
    }

    //@Cuando("selecciono la caja de busqueda")
    //public void seleccionoLaCajaDeBusqueda() {MenuPrincipal.MenuInicial();
    }
