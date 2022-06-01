package co.com.choucair.certificate.utest.task;

import co.com.choucair.certificate.utest.userinterface.SeleccionarBotonJoin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class EntrarJoinToday implements Task {

    public static EntrarJoinToday open(){
        return Tasks.instrumented(EntrarJoinToday.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SeleccionarBotonJoin.BOTON_JOINTODAY)
        );
    }
}
