package com.choucair.formacionPanama.Steps;

import com.choucair.formacionPanama.PageObject.BusquedaEmpleadoPage;

import net.thucydides.core.annotations.Step;

public class BusquedaEmpleadoSteps {

	BusquedaEmpleadoPage busquedaEmpleadoPage;
	
	@Step
	public void seleccionar_cargo_analista_de_prueba() {
		busquedaEmpleadoPage.select_analista_de_prueba();
		
	}
	@Step
	public void seleccionar_pais() {
		busquedaEmpleadoPage.seleccionar_pais();
		
	}
	@Step
	public void click_en_buscar() {
		busquedaEmpleadoPage.click_en_buscar();
		
	}
	@Step
	public void verificar_resultados() {

		
	}
	
}
