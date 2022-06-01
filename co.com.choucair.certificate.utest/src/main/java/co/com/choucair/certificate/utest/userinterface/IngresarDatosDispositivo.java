package co.com.choucair.certificate.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IngresarDatosDispositivo extends PageObject {
    public static final Target SELECT_COMPUTER = Target.the("computer").located(By.xpath("//*[@id='web-device']/div[1]/div[2]/div/div[1]/span"));
    public static final Target SELECT_COMP = Target.the("").located(By.xpath("//*[@id='web-device']/div[1]/div[2]/div/input[1]"));
    public static final Target SELECT_VERSION = Target.the("").located(By.xpath("//*[@id='web-device']/div[2]/div[2]/div/div[1]/span"));
    public static final Target SELECT_VER = Target.the("").located(By.xpath("//*[@id='web-device']/div[2]/div[2]/div/input[1]"));
    public static final Target SELECT_LENGUAJE = Target.the("").located(By.xpath("//*[@id='web-device']/div[3]/div[2]/div/div[1]/span"));
    public static final Target SELECT_LENG = Target.the("").located(By.xpath("//*[@id='web-device']/div[3]/div[2]/div/input[1]"));
    public static final Target SELECT_MOBILE = Target.the("").located(By.xpath("//*[@id='mobile-device']/div[1]/div[2]/div/div[1]/span"));
    public static final Target SELECT_MOB = Target.the("").located(By.xpath("//*[@id='mobile-device']/div[1]/div[2]/div/input[1]"));
    public static final Target SELECT_MODELO = Target.the("").located(By.xpath("//*[@id='mobile-device']/div[2]/div[2]/div/div[1]/span"));
    public static final Target SELECT_MOD = Target.the("").located(By.xpath("//*[@id='mobile-device']/div[2]/div[2]/div/input[1]"));
    public static final Target SELECT_OPERATING = Target.the("").located(By.xpath("//*[@id='mobile-device']/div[3]/div[2]/div/div[1]/span"));
    public static final Target SELECT_OPERA = Target.the("").located(By.xpath("//*[@id='mobile-device']/div[3]/div[2]/div/input[1]"));
    public static final Target BOTON_LASTSTEP = Target.the("").located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}
