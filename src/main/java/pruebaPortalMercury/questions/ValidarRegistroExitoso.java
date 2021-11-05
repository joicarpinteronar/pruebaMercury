package pruebaPortalMercury.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import pruebaPortalMercury.userinterfaces.RegistroPage;

public class ValidarRegistroExitoso implements Question<String> {

    public static ValidarRegistroExitoso validarRegistro() {
        return new ValidarRegistroExitoso();
    }

    @Override
    public String answeredBy(Actor actor) {
        String usuarioRegistrado = Text.of(RegistroPage.LBL_USUARIO).viewedBy(actor).asString().substring(0,23);
        return usuarioRegistrado;
    }
}
