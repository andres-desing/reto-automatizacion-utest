package co.com.choucair.certificate.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SeleccionarBotonJoin extends PageObject {

    public static final Target BOTON_JOINTODAY = Target.the("jointoday")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
    public static final Target LBL_STEP1 = Target.the("step1").located(By.xpath("//*[contains(text(), 'Step 1')]"));
}
