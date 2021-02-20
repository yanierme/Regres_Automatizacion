package co.automatizacion.ServicioRest.stepdefinitions;

import co.automatizacion.ServicioRest.models.DatosUsuario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.questions.ResponseConsequence;
import java.util.List;
import static co.automatizacion.ServicioRest.tasks.RealizarLaCreacionDeUsuario.realizarLaCreacionDeUsuario;

public class CreacionDeUsuarioStepDefinitions {

    private Actor actor;

    @Before
    public void iniciarActor() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^conecta con el servicio para crear el usuario$")
    public void conectaConElServicioParaCrearElUsuario() {
        actor = Actor.named("usuario").whoCan(CallAnApi.at("https://reqres.in"));

    }

    @When("^crea usuario con los datos$")
    public void creaUsuarioConLosDatos(List<DatosUsuario> datosUsuario) {
        actor.attemptsTo(realizarLaCreacionDeUsuario(datosUsuario));
    }

    @When("^valida el codigo de respuesta$")
    public void validaElCodigoDeRespuesta() {
        actor.should(
                ResponseConsequence.seeThatResponse("Deberia ver la siguiente respuesta: ",
                        response -> response.statusCode(201)

                )
        );
    }


}
