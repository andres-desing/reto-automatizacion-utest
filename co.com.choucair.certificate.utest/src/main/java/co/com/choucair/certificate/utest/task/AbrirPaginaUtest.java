package co.com.choucair.certificate.utest.task;

import co.com.choucair.certificate.utest.userinterface.PaginaUtest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPaginaUtest implements Task {

    private PaginaUtest paginaUtest;


    public static AbrirPaginaUtest urlApp() {
        return Tasks.instrumented(AbrirPaginaUtest.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(paginaUtest));

    }
}
