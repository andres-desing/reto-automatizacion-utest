package co.com.choucair.certificate.utest.questions;

import co.com.choucair.certificate.utest.userinterface.SeleccionarBotonJoin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerificarUtest implements Question {
    public static VerificarUtest resultado(){
        return new VerificarUtest();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(SeleccionarBotonJoin.LBL_STEP1).viewedBy(actor).asString();
    }
}
