package co.com.choucair.certificate.utest.task;

import net.serenitybdd.screenplay.Task;
import co.com.choucair.certificate.utest.userinterface.IngresarDatos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;


public class Ingresar implements Task {
    private String firtsname;
    private String lastname;
    private String email;



    public Ingresar (String firtsname, String lastname, String email){
        this.firtsname = firtsname;
        this.lastname = lastname;
        this.email = email;

    }

    public static Ingresar datos(String firtsname, String lastname, String email) {
        return Tasks.instrumented(Ingresar.class, firtsname, lastname, email);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(firtsname).into(IngresarDatos.FIRTSNAME),
                Enter.theValue(lastname).into(IngresarDatos.LASTNAME),
                Enter.theValue(email).into(IngresarDatos.EMAIL),
                Click.on(IngresarDatos.BOTON_MONTH),
                Hit.the(Keys.ARROW_DOWN).into(IngresarDatos.BOTON_MONTH),
                Hit.the(Keys.ARROW_DOWN).into(IngresarDatos.BOTON_MONTH),
                Hit.the(Keys.ARROW_DOWN).into(IngresarDatos.BOTON_MONTH),
                Hit.the(Keys.ENTER).into(IngresarDatos.BOTON_MONTH),
                Click.on(IngresarDatos.BOTON_DAY),
                Hit.the(Keys.ARROW_DOWN).into(IngresarDatos.BOTON_DAY),
                Hit.the(Keys.ARROW_DOWN).into(IngresarDatos.BOTON_DAY),
                Hit.the(Keys.ARROW_DOWN).into(IngresarDatos.BOTON_DAY),
                Hit.the(Keys.ENTER).into(IngresarDatos.BOTON_DAY),
                Click.on(IngresarDatos.BOTON_YEAR),
                Hit.the(Keys.ARROW_DOWN).into(IngresarDatos.BOTON_YEAR),
                Hit.the(Keys.ARROW_DOWN).into(IngresarDatos.BOTON_YEAR),
                Hit.the(Keys.ARROW_DOWN).into(IngresarDatos.BOTON_YEAR),
                Click.on(IngresarDatos.BOTON_LENGUAJES),
                Hit.the(Keys.ARROW_DOWN).into(IngresarDatos.BOTON_LENGUAJES),
                Hit.the(Keys.ARROW_DOWN).into(IngresarDatos.BOTON_LENGUAJES),
                Click.on(IngresarDatos.BOTON_NEXTLOCATION)

        );

    }
}
