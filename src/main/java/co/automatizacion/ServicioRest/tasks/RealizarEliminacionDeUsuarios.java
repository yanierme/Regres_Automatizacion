package co.automatizacion.ServicioRest.tasks;

import co.automatizacion.ServicioRest.models.DatosUsuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Delete;
import net.serenitybdd.screenplay.rest.interactions.Post;

import java.util.List;

public class RealizarEliminacionDeUsuarios implements Task {

    DatosUsuario datosUsuario;

    public RealizarEliminacionDeUsuarios(List<DatosUsuario> datosUsuario) {
        this.datosUsuario = datosUsuario.get(0);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Delete.from("/api/users/"+datosUsuario.getId()+"")
        );
    }

    public static RealizarEliminacionDeUsuarios realizarEliminacionDeUsuarios(List<DatosUsuario> datosUsuario) {
        return Tasks.instrumented(RealizarEliminacionDeUsuarios.class, datosUsuario);
    }


}
