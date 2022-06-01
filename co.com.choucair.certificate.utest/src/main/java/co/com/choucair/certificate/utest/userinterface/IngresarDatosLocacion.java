package co.com.choucair.certificate.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IngresarDatosLocacion extends PageObject {
    public static final Target CITY = Target.the("city").located(By.id("city"));
    public static final Target POSTAL = Target.the("postal").located(By.id("zip"));
    public static final Target BOTON_NEXTDEVICE = Target.the("onclik")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}
