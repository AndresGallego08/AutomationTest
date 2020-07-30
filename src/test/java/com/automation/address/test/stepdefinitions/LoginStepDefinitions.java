package com.automation.address.test.stepdefinitions;

import java.util.List;

import com.automation.address.test.models.Login;
import com.automation.address.test.steps.LoginSteps;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class LoginStepDefinitions {
	
	@Steps
	LoginSteps loginSteps;
	
	@Dado("^que estoy en la pagina de inicio$")
	public void queEstoyEnLaPaginaDeInicio() {
		loginSteps.abrirAutomationPractice();
		loginSteps.clickLogin();
	}

	@Cuando("^ingreso las credenciales$")
	public void ingresoLasCredenciales(List<Login>listaLogin) {
		loginSteps.escribirEmail(listaLogin.get(0).getEmail());
		loginSteps.escribirClave(listaLogin.get(0).getClave());
		loginSteps.clickSignIn();
	}

	@Entonces("^valido la presencia del boton My Addresses$")
	public void validoLaPresenciaDelBotonMyAddresses() {
		loginSteps.validarPresenciaDelBoton();
	}

}
