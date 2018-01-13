package com.choucair.formacionPanama.Definitions;

import com.choucair.formacionPanama.Steps.BusquedaEmpleadoSteps;
import com.choucair.formacionPanama.Steps.LoginPlanetSteps;
import com.choucair.formacionPanama.Steps.NavegacionPlanetSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class BusquedaEmpleadoDefinition {

	@Steps
	LoginPlanetSteps loginPlanetSteps;
	
	@Steps
	NavegacionPlanetSteps navegacionPlanetSteps;
	
	@Steps
	BusquedaEmpleadoSteps busquedaEmpleadoSteps;
	
	@Given("^Yo como usuario del aplicativo planet me logueo con mis credenciales usuario \"([^\"]*)\" y pass \"([^\"]*)\"$")
	public void yo_como_usuario_del_aplicativo_planet_me_logueo_con_mis_credenciales_usuario_y_pass(String strUsuario, String strPass) throws Throwable {
		loginPlanetSteps.login_planet(strUsuario, strPass);
	}

	@Given("^navego hasta la pantalla de busqueda empleado$")
	public void navego_hasta_la_pantalla_de_busqueda_empleado() throws Throwable {
		navegacionPlanetSteps.navegar_a_busqueda_empleado();
	}

	@When("^selecciono el cargo de analistas de prueba$")
	public void selecciono_el_cargo_de_analistas_de_prueba() throws Throwable {
		busquedaEmpleadoSteps.seleccionar_cargo_analista_de_prueba();
	}

	@When("^selecciono el pais Panama$")
	public void selecciono_el_pais_Panama() throws Throwable {
		busquedaEmpleadoSteps.seleccionar_pais();
	}

	@When("^realizar la busqueda$")
	public void realizar_la_busqueda() throws Throwable {
		busquedaEmpleadoSteps.click_en_buscar();
	}

	@Then("^me muestra el listado de resultados$")
	public void me_muestra_el_listado_de_resultados() throws Throwable {
		busquedaEmpleadoSteps.verificar_resultados();
	}
	
	
	
}
