
package co.com.choucair.certificate.utest.stepdefinitions;


import co.com.choucair.certificate.utest.model.DatosUtest;
import co.com.choucair.certificate.utest.questions.VerificarUtest;
import co.com.choucair.certificate.utest.task.*;
import co.com.choucair.certificate.utest.userinterface.IngresarDatos;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.util.List;

public class CrearUsuarioStepDefinition {


    @Before
    public void Iniciartest() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que el actor se encuentra en la pagina utest$")
    public void queElActorSeEncuentraEnLaPaginaUtest() {
        OnStage.theActorCalled("actor").wasAbleTo(AbrirPaginaUtest.urlApp());
    }

    @Y("^selecciona el boton jointoday$")
    public void seleccionaElBotonJointoday() {
        OnStage.theActorInTheSpotlight().
                attemptsTo(EntrarJoinToday.open());
    }

    @Cuando("^diligencia los datos personales en el formulario$")
    public void diligenciaLosDatosPersonalesEnElFormulario(List<DatosUtest> datosUtests) {
        OnStage.theActorInTheSpotlight().attemptsTo(Ingresar.datos(datosUtests.get(0).getFirtsname(),
                datosUtests.get(0).getLastname(), datosUtests.get(0).getEmail()));
    }

    @Y("^realiza un onclik en en el boton next location$")
    public void realizaunOnclikEnEnElBotonNextLocation() {
    }

    @Y("^despues ingresa a la siguiente pagina y ingresa los datos requeridos de localizacion$")
    public void despuesIngresaALaSiguientePaginaYIngresaLosDatosRequeridosDeLocalizacion(List<DatosUtest> datosUtests) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarLocacion.datoscity(datosUtests.get(0).getCity(),
                datosUtests.get(0).getPostal()));
    }
    @Y("^realiza un onclick en el boton next device$")
    public void realizaUnOnclickEnElBotonNextDevice() {
    }

    @Y("^luego es redireccionado a la pagina cuentanos sobre tus dispositivos y diligenciar los campos$")
    public void luegoEsRedireccionadoALaPaginaCuentanosSobreTusDispositivosYDiligenciarLosCampos() {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarDispositivo.datosdispositivo());
    }
    @Y("^seleccionamos el boton nex last step$")
    public void seleccionamosElBotonNexLastStep() {
    }

    @Y("^nos dara ingreso a la pagina de creacion de la contraseña$")
    public void nosDaraIngresoALaPaginaDeCreacionDeLaContraseña(List<DatosUtest> datosUtests) {
        OnStage.theActorInTheSpotlight().attemptsTo(IngresarPassword.datospassword(datosUtests.get(0).getPassword(),
                datosUtests.get(0).getConfirmarpassword()));
    }


    @Entonces("^se valida la creacion del usuario seleccionando el boton complete setup$")
    public void seValidaLaCreacionDelUsuarioSeleccionandoElBotonCompleteSetup() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarUtest.resultado(),
                Matchers.equalTo("Step 1")));
    }

}
