package co.automatizacion.ServicioRest.tasks;

import co.automatizacion.ServicioRest.models.DatosUsuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Delete;
import net.serenitybdd.screenplay.rest.interactions.Put;

import java.util.List;

public class RealizarActualizacionDeUsuarios implements Task {

    DatosUsuario datosUsuario;

    public RealizarActualizacionDeUsuarios(List<DatosUsuario> datosUsuario) {
        this.datosUsuario = datosUsuario.get(0);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Put.to("/api/users/" + datosUsuario.getId() + "")
                        .with(request -> request.header("Content-Type", "application/json")
                                .body("{\"name\": \"" + datosUsuario.getName() + "\",\"job\": \"" + datosUsuario.getJob() + "\"}")
                        )
        );
    }

    public static RealizarActualizacionDeUsuarios realizarActualizacionDeUsuarios(List<DatosUsuario> datosUsuario) {
        return Tasks.instrumented(RealizarActualizacionDeUsuarios.class, datosUsuario);
    }


}
