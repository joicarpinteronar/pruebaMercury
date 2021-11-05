package pruebaPortalMercury.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.selectactions.SelectByVisibleTextFromTarget;
import net.serenitybdd.screenplay.questions.SelectedVisibleTextValue;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.Select;
import pruebaPortalMercury.interactions.Wait;
import pruebaPortalMercury.models.RegistroModel;
import pruebaPortalMercury.userinterfaces.RegistroPage;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class Registrar implements Task {

    RegistroModel registro;

    public Registrar(RegistroModel registro) {
        this.registro = registro;
    }

    @Override
    @Step("{0} ingresa los Datos")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Wait.forAbout(1),
                WaitUntil.the(RegistroPage.BTN_REGISTER, isEnabled()).forNoMoreThan(10).seconds(),
                Click.on(RegistroPage.BTN_REGISTER),
                WaitUntil.the(RegistroPage.TXT_NOMBRE, isEnabled()).forNoMoreThan(10).seconds(),
                Enter.theValue(registro.getNombre()).into(RegistroPage.TXT_NOMBRE),
                WaitUntil.the(RegistroPage.TXT_APELLIDO, isEnabled()).forNoMoreThan(10).seconds(),
                Enter.theValue(registro.getApellido()).into(RegistroPage.TXT_APELLIDO),
                WaitUntil.the(RegistroPage.TXT_TELEFONO, isEnabled()).forNoMoreThan(10).seconds(),
                Enter.theValue(registro.getTelefono()).into(RegistroPage.TXT_TELEFONO),
                WaitUntil.the(RegistroPage.TXT_EMAIL, isEnabled()).forNoMoreThan(10).seconds(),
                Enter.theValue(registro.getCorreo()).into(RegistroPage.TXT_EMAIL),
                WaitUntil.the(RegistroPage.TXT_DIRECCION, isEnabled()).forNoMoreThan(10).seconds(),
                Enter.theValue(registro.getDireccion()).into(RegistroPage.TXT_DIRECCION),
                WaitUntil.the(RegistroPage.TXT_CIUDAD, isEnabled()).forNoMoreThan(10).seconds(),
                Enter.theValue(registro.getCiudad()).into(RegistroPage.TXT_CIUDAD),
                WaitUntil.the(RegistroPage.TXT_PROVINCIA, isEnabled()).forNoMoreThan(10).seconds(),
                Enter.theValue(registro.getProvincia()).into(RegistroPage.TXT_PROVINCIA),
                WaitUntil.the(RegistroPage.TXT_CODIGO_POSTAL, isEnabled()).forNoMoreThan(10).seconds(),
                Enter.theValue(registro.getPostal()).into(RegistroPage.TXT_CODIGO_POSTAL),
                Scroll.to(RegistroPage.BTN_ENVIAR),
                WaitUntil.the(RegistroPage.TXT_PAIS, isEnabled()).forNoMoreThan(10).seconds(),
                SelectFromOptions.byVisibleText(registro.getPais()).from(RegistroPage.TXT_PAIS),
                WaitUntil.the(RegistroPage.TXT_NOMBRE_USUARIO, isEnabled()).forNoMoreThan(10).seconds(),
                Enter.theValue(registro.getUsuario()).into(RegistroPage.TXT_NOMBRE_USUARIO),
                WaitUntil.the(RegistroPage.TXT_PASSWORD, isEnabled()).forNoMoreThan(10).seconds(),
                Enter.theValue(registro.getPassword()).into(RegistroPage.TXT_PASSWORD),
                WaitUntil.the(RegistroPage.TXT_CONFIRMAR_PASSWORD, isEnabled()).forNoMoreThan(10).seconds(),
                Enter.theValue(registro.getPasswordConfirmacion()).into(RegistroPage.TXT_CONFIRMAR_PASSWORD),
                WaitUntil.the(RegistroPage.BTN_ENVIAR, isEnabled()).forNoMoreThan(10).seconds(),
                Click.on(RegistroPage.BTN_ENVIAR),
                Wait.forAbout(3)
        );
    }

    public static Registrar ingresarDatos(RegistroModel registro) {
        return Tasks.instrumented(Registrar.class, registro);
    }

}
