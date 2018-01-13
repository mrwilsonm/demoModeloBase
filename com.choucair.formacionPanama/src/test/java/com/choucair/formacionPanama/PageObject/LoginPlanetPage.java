package com.choucair.formacionPanama.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://planet.choucairtesting.com/bin/login/Main/WebHome?origurl=/")
public class LoginPlanetPage extends PageObject{

	public void input_user(String strUsuario) {
		find(By.name("username")).waitUntilPresent().and().sendKeys(strUsuario);
	}

	public void input_pass(String strPass) {
		// TODO Auto-generated method stub
		find(By.name("password")).waitUntilPresent().and().sendKeys(strPass);
	}

	public void click_entrar() {
		// TODO Auto-generated method stub
		find(By.name("password")).waitUntilPresent().and().sendKeys(Keys.ENTER);
	}

}
