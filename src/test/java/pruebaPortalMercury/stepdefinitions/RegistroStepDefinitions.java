package pruebaPortalMercury.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import org.openqa.selenium.WebDriver;
import pruebaPortalMercury.models.RegistroModel;
import pruebaPortalMercury.questions.ValidarRegistroExitoso;
import pruebaPortalMercury.tasks.Navegar;
import pruebaPortalMercury.tasks.Registrar;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getWebdriverManager;
import static org.hamcrest.core.IsEqual.equalTo;
import static pruebaPortalMercury.utils.Utilities.getRandomDriver;

public class RegistroStepDefinitions {

    WebDriver driver = getWebdriverManager().getWebdriver(getRandomDriver());

    @Before
    public void setStage() {
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(driver)));
    }

    @Dado("^que el (.*) ingresar al portal mercury tour")
    public void abrirUrl(String nombreActor) {
        theActorCalled(nombreActor).wasAbleTo(Navegar.a());
    }

    @Cuando("^ingresa los datos de registro en el formulario$")
    public void ingresaDatosRegistro(List<RegistroModel> registro) {
        theActorInTheSpotlight().attemptsTo(Registrar.ingresarDatos(registro.get(0)));
    }

    @Then("^verifico que el nuevo registro sea exitoso$")
    public void verificarResultado() {
        theActorInTheSpotlight().should(seeThat(ValidarRegistroExitoso.validarRegistro(),equalTo("Note: Your user name is")));

    }
}
