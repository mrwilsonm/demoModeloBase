package com.choucair.formacionPanama.Steps;

import com.choucair.formacionPanama.PageObject.NavegacionPlanetPage;

import net.thucydides.core.annotations.Step;

public class NavegacionPlanetSteps {

	NavegacionPlanetPage navegacionPlanetPage;
	@Step
	public void navegar_a_busqueda_empleado() {
		navegacionPlanetPage.menu_encuentrame();
		navegacionPlanetPage.submenu_empleados();
		
	}

}
