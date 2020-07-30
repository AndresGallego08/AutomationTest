package com.automation.address.test.steps;

import com.automation.address.test.pageobjects.AgregarDireccionPageObject;

import net.thucydides.core.annotations.Step;

public class AgregarDireccionSteps {
	
	AgregarDireccionPageObject agregarDireccionPOM = new AgregarDireccionPageObject();
	
	
	@Step
	public void clickEnMyAddresses() {
		agregarDireccionPOM.clickEnMyAddresses();
	}
	
	@Step
	public void clickAddNewAddress() {
		agregarDireccionPOM.clickAddNewAddress();
	}
	
	@Step
	public void escribirNombre(String firstName) {
		agregarDireccionPOM.escribirNombre(firstName);
	}
	
	@Step
	public void escribirApellido(String lastName) {
		agregarDireccionPOM.escribirApellido(lastName);
	}
	
	@Step
	public void escribirEmpresa(String company) {
		agregarDireccionPOM.escribirEmpresa(company);
	}
	
	@Step
	public void escribirDireccion(String address) {
		agregarDireccionPOM.escribirDireccion(address);
	}
	
	@Step
	public void escribirDireccionDos(String addressLineTwo) {
		agregarDireccionPOM.escribirDireccionDos(addressLineTwo);
	}
	
	@Step
	public void escribirCiudad(String city) {
		agregarDireccionPOM.escribirCiudad(city);
	}
	
	@Step
	public void seleccionarEstado(String state) {
		agregarDireccionPOM.seleccionarEstado(state);
	}
	
	@Step
	public void escribirCodigoPostal(String postalCode) {
		agregarDireccionPOM.escribirCodigoPostal(postalCode);
	}
	
	@Step
	public void escribirTelefonoCasa(String homePhone) {
		agregarDireccionPOM.escribirTelefonoCasa(homePhone);
	}
	
	@Step
	public void escribirTelefonoMovil(String mobilePhone) {
		agregarDireccionPOM.escribirTelefonoMovil(mobilePhone);
	}
	
	@Step
	public void escribirInformacionAdicional(String additionalInformation) {
		agregarDireccionPOM.escribirInformacionAdicional(additionalInformation);
	}
	
	@Step
	public void escribirTitulo(String title) {
		agregarDireccionPOM.escribirTitulo(title);
	}
	
	@Step
	public void clickGuardar() {
		agregarDireccionPOM.clickGuardar();
	}
	
	@Step
	public void validarPresenciaDelBoton() {
		agregarDireccionPOM.validarPresenciaDelBoton();
	}

}
