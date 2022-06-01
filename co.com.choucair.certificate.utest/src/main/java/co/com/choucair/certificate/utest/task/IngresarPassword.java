package co.com.choucair.certificate.utest.task;

import co.com.choucair.certificate.utest.userinterface.IngresarDatos;
import co.com.choucair.certificate.utest.userinterface.IngresarDatosPassword;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class IngresarPassword implements Task {

    private String password;
    private String confirmarpassword;


    public IngresarPassword (String password, String confirmarpassword){
        this.password = password;
        this.confirmarpassword = confirmarpassword;
    }

    public static IngresarPassword datospassword(String password, String confirmarpassword) {
        return Tasks.instrumented(IngresarPassword.class, password,confirmarpassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(password).into(IngresarDatosPassword.PASSWORD),
                Enter.theValue(confirmarpassword).into(IngresarDatosPassword.CONFIRMARPASSWORD),
                Click.on(IngresarDatosPassword.CHECK_STAYINFORMED),
                Click.on(IngresarDatosPassword.CHECK_UTESTTERMS),
                Click.on(IngresarDatosPassword.CHECK_SECURITYPOLIY),
                Click.on(IngresarDatosPassword.BOTON_COMPLTESETUP)
        );

    }
}
