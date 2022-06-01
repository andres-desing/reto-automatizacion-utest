package co.com.choucair.certificate.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IngresarDatos extends PageObject {
    public static final Target FIRTSNAME = Target.the("firts name").located(By.id("firstName"));
    public static final Target LASTNAME = Target.the("last name").located(By.id("lastName"));
    public static final Target EMAIL = Target.the("email").located(By.id("email"));
    public static final Target BOTON_MONTH = Target.the("onclick").located(By.id("birthMonth"));
    public static final Target BOTON_DAY = Target.the("onclick").located(By.id("birthDay"));
    public static final Target BOTON_YEAR = Target.the("ONCLICK").located(By.id("birthYear"));
    public static final Target BOTON_LENGUAJES = Target.the("onclick").located(By.xpath("//input[@type='search']"));
    public static final Target BOTON_NEXTLOCATION = Target.the("onclick").located(By.xpath("//a[@class='btn btn-blue']"));

}
