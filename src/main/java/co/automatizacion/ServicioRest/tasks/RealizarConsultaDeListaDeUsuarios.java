package co.automatizacion.ServicioRest.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;


public class RealizarConsultaDeListaDeUsuarios implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Get.resource("/api/users?page=2")
        );
    }

    public static RealizarConsultaDeListaDeUsuarios realizarConsultaDeListaDeUsuarios() {
        return Tasks.instrumented(RealizarConsultaDeListaDeUsuarios.class);
    }


}
