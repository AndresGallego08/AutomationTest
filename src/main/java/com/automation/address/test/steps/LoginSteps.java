package com.automation.address.test.steps;

import com.automation.address.test.pageobjects.LoginPageObject;

import net.thucydides.core.annotations.Step;

public class LoginSteps {
	LoginPageObject LoginPOM = new LoginPageObject();
	
	@Step
	public void abrirAutomationPractice() {
		LoginPOM.open();
	}
	
	@Step
	public void clickLogin() {
		LoginPOM.clickLogin();
	}
	
	@Step
	public void escribirEmail(String email) {
		LoginPOM.escribirEmail(email);
	}
	
	@Step
	public void escribirClave(String clave) {
		LoginPOM.escribirClave(clave);
	}
	
	@Step
	public void clickSignIn() {
		LoginPOM.clickSignIn();
	}
	
	@Step
	public void validarPresenciaDelBoton() {
		LoginPOM.validarPresenciaDelBoton();
	}
	
}
