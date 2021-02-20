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

import static co.automatizacion.ServicioRest.tasks.RealizarConsultaDeListaDeUsuarios.realizarConsultaDeListaDeUsuarios;
import static co.automatizacion.ServicioRest.tasks.RealizarLaCreacionDeUsuario.realizarLaCreacionDeUsuario;

public class ListaDeUsuarioStepDefinitions {

    private Actor actor;

    @Before
    public void iniciarActor() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^conecta con el servicio para consultar los usuarios$")
    public void conectaConElServicioParaConsultarLosUsuarios() {
        actor = Actor.named("usuario").whoCan(CallAnApi.at("https://reqres.in"));
    }


    @When("^consulta los usuarios por pagina$")
    public void consultaLosUsuariosPorPagina() {
        actor.attemptsTo(realizarConsultaDeListaDeUsuarios());
    }

    @Then("^valida el codigo de respuesta para la consulta$")
    public void validaElCodigoDeRespuestaParaLaConsulta() {
        actor.should(
                ResponseConsequence.seeThatResponse("Deberia ver la siguiente respuesta: ",
                        response -> response.statusCode(200)

                )
        );
    }


}
