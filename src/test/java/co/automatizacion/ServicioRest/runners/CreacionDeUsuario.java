package co.automatizacion.ServicioRest.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/creacion_de_usuario.feature",
        glue = "co.automatizacion.ServicioRest.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class CreacionDeUsuario {

}
