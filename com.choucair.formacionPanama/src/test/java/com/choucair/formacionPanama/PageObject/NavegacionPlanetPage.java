package com.choucair.formacionPanama.PageObject;

import net.serenitybdd.core.pages.PageObject;

public class NavegacionPlanetPage extends PageObject {

	public void menu_encuentrame() {
		// TODO Auto-generated method stub
		findBy("//A[@href='/bin/view/Empleados/Directorio']/self::A").waitUntilPresent().and().click();
	}

	public void submenu_empleados() {
		// TODO Auto-generated method stub
		findBy("//A[@href='/bin/view/Empleados/DirectorioEmpleados'][text()='Empleados']/self::A").waitUntilPresent().and().click();
	}

}
