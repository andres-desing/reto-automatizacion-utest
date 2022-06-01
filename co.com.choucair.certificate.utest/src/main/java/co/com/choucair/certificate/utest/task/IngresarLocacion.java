package co.com.choucair.certificate.utest.task;

import co.com.choucair.certificate.utest.userinterface.IngresarDatosLocacion;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;


public class IngresarLocacion implements Task {

    private String city;
    private String postal;



    public IngresarLocacion (String city , String postal){

        this.city = city;
        this.postal = postal;

    }

    public static IngresarLocacion datoscity(String city , String postal) {
        return Tasks.instrumented(IngresarLocacion.class, city, postal);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(city).into(IngresarDatosLocacion.CITY),
                Hit.the(Keys.ARROW_DOWN).into(IngresarDatosLocacion.CITY),
                Hit.the(Keys.ENTER).into(IngresarDatosLocacion.CITY),
                Enter.theValue(postal).into(IngresarDatosLocacion.POSTAL),
                Hit.the(Keys.ENTER).into(IngresarDatosLocacion.POSTAL),
                Click.on(IngresarDatosLocacion.BOTON_NEXTDEVICE)


        );

    }
}
