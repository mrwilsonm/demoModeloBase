package com.choucair.formacionPanama;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/Planet/Busqueda/BusquedaEmpleado.feature")
public class BusquedaEmpleadoRunner {

}
