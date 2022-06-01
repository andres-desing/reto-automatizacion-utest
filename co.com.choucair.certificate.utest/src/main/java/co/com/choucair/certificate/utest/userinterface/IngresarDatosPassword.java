package co.com.choucair.certificate.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IngresarDatosPassword extends PageObject {
    public static final Target PASSWORD = Target.the("password").located(By.id("password"));
    public static final Target CONFIRMARPASSWORD = Target.the("confirmarpassword").located(By.id("confirmPassword"));
    public static final Target CHECK_STAYINFORMED = Target.the("stayinformed").located(By.xpath("//span[@class='checkmark signup-consent__checkbox signup-consent__checkbox--highlight']"));
    public static final Target CHECK_UTESTTERMS = Target.the("utestterms").located(By.xpath("//span[@class='checkmark signup-consent__checkbox error']"));
    public static final Target CHECK_SECURITYPOLIY = Target.the("securitypolity").located(By.xpath("//span[@class='checkmark signup-consent__checkbox error']"));
    public static final Target BOTON_COMPLTESETUP = Target.the("completesetup").located(By.xpath("//a[@class='btn btn-blue']"));
}
