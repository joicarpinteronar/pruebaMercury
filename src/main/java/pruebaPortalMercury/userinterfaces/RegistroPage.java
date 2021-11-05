package pruebaPortalMercury.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class RegistroPage {

    public static final Target BTN_REGISTER =
            Target.the("Opcion Menu Registro").located(By.xpath("//a[contains(@href, 'register.php')]"));

    public static final Target TXT_NOMBRE =
            Target.the("Texto Nombre").located(By.name("firstName"));

    public static final Target TXT_APELLIDO =
            Target.the("Texto Apellido").located(By.name("lastName"));

    public static final Target TXT_TELEFONO =
            Target.the("Texto Telefono").located(By.name("phone"));

    public static final Target TXT_EMAIL =
            Target.the("Texto Email").located(By.id("userName"));

    public static final Target TXT_DIRECCION =
            Target.the("Texto Direccion").located(By.name("address1"));

    public static final Target TXT_CIUDAD =
            Target.the("Texto Ciudad").located(By.name("city"));

    public static final Target TXT_PROVINCIA =
            Target.the("Texto Provincia").located(By.name("state"));

    public static final Target TXT_CODIGO_POSTAL =
            Target.the("Texto Codigo Postal").located(By.name("postalCode"));

    public static final Target TXT_PAIS =
            Target.the("Texto Pais").located(By.name("country"));

    public static final Target TXT_NOMBRE_USUARIO =
            Target.the("Texto Nombre Usuario").located(By.id("email"));

    public static final Target TXT_PASSWORD =
            Target.the("Texto Password").located(By.name("password"));

    public static final Target TXT_CONFIRMAR_PASSWORD =
            Target.the("Texto Confirmar Password").located(By.name("confirmPassword"));

    public static final Target BTN_ENVIAR =
            Target.the("Texto Confirmar Password").located(By.name("submit"));

    public static final Target LBL_NOMBRE_USUARIO =
            Target.the("Label Nombre Usuario").located(By.xpath("//font/b"));

    public static final Target LBL_USUARIO =
            Target.the("Label Usuario").located(By.xpath("//p[3]/font/b"));
}
