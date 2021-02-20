package co.automatizacion.ServicioRest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/buscar_usuario_unico.feature",
        glue = "co.automatizacion.ServicioRest.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class BuscarUsuarioUnico {

}
