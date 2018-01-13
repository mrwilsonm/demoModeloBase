package com.choucair.formacionPanama.Steps;

import com.choucair.formacionPanama.PageObject.LoginPlanetPage;

import net.thucydides.core.annotations.Step;

public class LoginPlanetSteps {

	LoginPlanetPage loginPlanetPage;
	
	@Step
	public void login_planet(String strUsuario, String strPass) {
		loginPlanetPage.open();
		loginPlanetPage.input_user(strUsuario);
		loginPlanetPage.input_pass(strPass);
		loginPlanetPage.click_entrar();
	}

}
