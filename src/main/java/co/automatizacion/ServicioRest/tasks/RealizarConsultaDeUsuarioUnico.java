package co.automatizacion.ServicioRest.tasks;

import co.automatizacion.ServicioRest.models.DatosUsuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

import java.util.List;

public class RealizarConsultaDeUsuarioUnico implements Task {

    DatosUsuario datosUsuario;

    public RealizarConsultaDeUsuarioUnico(List<DatosUsuario> datosUsuario) {
        this.datosUsuario = datosUsuario.get(0);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Get.resource("/api/users?" + datosUsuario.getId() + "")
        );
    }

    public static RealizarConsultaDeUsuarioUnico realizarConsultaDeUsuarioUnico(List<DatosUsuario> datosUsuario) {
        return Tasks.instrumented(RealizarConsultaDeUsuarioUnico.class, datosUsuario);
    }


}
