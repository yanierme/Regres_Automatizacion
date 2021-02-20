package co.automatizacion.ServicioRest.tasks;

import co.automatizacion.ServicioRest.models.DatosUsuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Post;

import java.util.List;

public class RealizarLaCreacionDeUsuario implements Task {

    DatosUsuario datosUsuario;

    public RealizarLaCreacionDeUsuario(List<DatosUsuario> datosUsuario) {
        this.datosUsuario = datosUsuario.get(0);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Post.to("/api/users")
                        .with(request -> request.header("Content-Type", "application/json")
                                .body("{\"name\": \"" + datosUsuario.getName() + "\",\"job\": \"" + datosUsuario.getJob() + "\"}")
                        )
        );
    }

    public static RealizarLaCreacionDeUsuario realizarLaCreacionDeUsuario(List<DatosUsuario> datosUsuario) {
        return Tasks.instrumented(RealizarLaCreacionDeUsuario.class, datosUsuario);
    }


}
