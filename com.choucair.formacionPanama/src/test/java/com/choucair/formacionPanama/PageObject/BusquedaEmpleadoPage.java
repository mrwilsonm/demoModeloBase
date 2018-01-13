package com.choucair.formacionPanama.PageObject;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;

public class BusquedaEmpleadoPage extends PageObject{

	public void select_analista_de_prueba() {
		find(By.name("cargo")).selectByVisibleText("Analista de Pruebas");
		
	}

	public void seleccionar_pais() {
		// TODO Auto-generated method stub
		find(By.name("Pais")).selectByVisibleText("Panamá");
	}

	public void click_en_buscar() {
		findBy("//A[@href='javascript:buscarpersona()'][text()=' Buscar']/self::A").waitUntilPresent().and().click();
		waitFor(7).second();
		//A[@href='javascript:buscarpersona()'][text()=' Buscar']/self::A
	}

}
