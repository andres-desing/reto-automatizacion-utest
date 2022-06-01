package co.com.choucair.certificate.utest.task;

import co.com.choucair.certificate.utest.userinterface.IngresarDatosDispositivo;
import co.com.choucair.certificate.utest.userinterface.IngresarDatosLocacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class IngresarDispositivo implements Task {


    public static IngresarDispositivo datosdispositivo() {
        return Tasks.instrumented(IngresarDispositivo.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(IngresarDatosDispositivo.SELECT_COMPUTER),
                Hit.the(Keys.ARROW_DOWN).into(IngresarDatosDispositivo.SELECT_COMP),
                Hit.the(Keys.ARROW_DOWN).into(IngresarDatosDispositivo.SELECT_COMP),
                Hit.the(Keys.ENTER).into(IngresarDatosDispositivo.SELECT_COMP),
                Click.on(IngresarDatosDispositivo.SELECT_VERSION),
                Hit.the(Keys.ARROW_DOWN).into(IngresarDatosDispositivo.SELECT_VER),
                Hit.the(Keys.ARROW_DOWN).into(IngresarDatosDispositivo.SELECT_VER),
                Hit.the(Keys.ENTER).into(IngresarDatosDispositivo.SELECT_VER),
                Click.on(IngresarDatosDispositivo.SELECT_LENGUAJE),
                Hit.the(Keys.ARROW_DOWN).into(IngresarDatosDispositivo.SELECT_LENG),
                Hit.the(Keys.ARROW_DOWN).into(IngresarDatosDispositivo.SELECT_LENG),
                Hit.the(Keys.ENTER).into(IngresarDatosDispositivo.SELECT_LENG),
                Click.on(IngresarDatosDispositivo.SELECT_MOBILE),
                Hit.the(Keys.ARROW_DOWN).into(IngresarDatosDispositivo.SELECT_MOB),
                Hit.the(Keys.ARROW_DOWN).into(IngresarDatosDispositivo.SELECT_MOB),
                Hit.the(Keys.ENTER).into(IngresarDatosDispositivo.SELECT_MOB),
                Click.on(IngresarDatosDispositivo.SELECT_MODELO),
                Hit.the(Keys.ARROW_DOWN).into(IngresarDatosDispositivo.SELECT_MOD),
                Hit.the(Keys.ARROW_DOWN).into(IngresarDatosDispositivo.SELECT_MOD),
                Hit.the(Keys.ENTER).into(IngresarDatosDispositivo.SELECT_MOD),
                Click.on(IngresarDatosDispositivo.SELECT_OPERATING),
                Hit.the(Keys.ARROW_DOWN).into(IngresarDatosDispositivo.SELECT_OPERA),
                Hit.the(Keys.ARROW_DOWN).into(IngresarDatosDispositivo.SELECT_OPERA),
                Hit.the(Keys.ENTER).into(IngresarDatosDispositivo.SELECT_OPERA),
                Click.on(IngresarDatosDispositivo.BOTON_LASTSTEP)

        );
    }
}
