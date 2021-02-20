package co.automatizacion.ServicioRest.stepdefinitions;

import co.automatizacion.ServicioRest.models.DatosUsuario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.questions.ResponseConsequence;

import java.util.List;

import static co.automatizacion.ServicioRest.tasks.RealizarEliminacionDeUsuarios.realizarEliminacionDeUsuarios;
import static co.automatizacion.ServicioRest.tasks.RealizarLaCreacionDeUsuario.realizarLaCreacionDeUsuario;

public class EliminacionDeUsuarioStepDefinitions {

    private Actor actor;

    @Before
    public void iniciarActor() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^conecta con el servicio para eliminar el usuario$")
    public void conectaConElServicioParaEliminarElUsuario() {
        actor = Actor.named("usuario").whoCan(CallAnApi.at("https://reqres.in"));

    }

    @When("^eliminar el usario con el id$")
    public void eliminarElUsarioConElId(List<DatosUsuario> datosUsuario) {
        actor.attemptsTo(realizarEliminacionDeUsuarios(datosUsuario));

    }


    @Then("^valida el codigo de respuesta de la peticion eliminar$")
    public void validaElCodigoDeRespuestaDeLaPeticionEliminar() {
        actor.should(
                ResponseConsequence.seeThatResponse("Deberia ver la siguiente respuesta: ",
                        response -> response.statusCode(204)

                )
        );

    }


}
