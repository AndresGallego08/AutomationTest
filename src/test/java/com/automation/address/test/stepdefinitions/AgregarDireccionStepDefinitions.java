package com.automation.address.test.stepdefinitions;

import java.util.List;

import com.automation.address.test.steps.AgregarDireccionSteps;
import com.automation.address.test.models.DatosRegistroDireccion;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class AgregarDireccionStepDefinitions {
	
	@Steps
	AgregarDireccionSteps agregarDireccionSteps;	
	
	@Dado("^que estoy en la pagina de registro de direcciones$")
	public void queEstoyEnLaPaginaDeRegistroDeDirecciones() {
		agregarDireccionSteps.clickEnMyAddresses();
		agregarDireccionSteps.clickAddNewAddress();
	}

	@Cuando("^ingreso los datos$")
	public void ingresoLosDatos(List<DatosRegistroDireccion>listaRegistro) {
		agregarDireccionSteps.escribirNombre(listaRegistro.get(0).getFirstName());
		agregarDireccionSteps.escribirApellido(listaRegistro.get(0).getLastName());
		agregarDireccionSteps.escribirEmpresa(listaRegistro.get(0).getCompany());
		agregarDireccionSteps.escribirDireccion(listaRegistro.get(0).getAddress());
		agregarDireccionSteps.escribirDireccionDos(listaRegistro.get(0).getAddressLineTwo());
		agregarDireccionSteps.escribirCiudad(listaRegistro.get(0).getCity());
		agregarDireccionSteps.seleccionarEstado(listaRegistro.get(0).getState());
		agregarDireccionSteps.escribirCodigoPostal(listaRegistro.get(0).getPostalCode());
		agregarDireccionSteps.escribirTelefonoCasa(listaRegistro.get(0).getHomePhone());
		agregarDireccionSteps.escribirTelefonoMovil(listaRegistro.get(0).getMobilePhone());
		agregarDireccionSteps.escribirInformacionAdicional(listaRegistro.get(0).getAdditionalInformation());
		agregarDireccionSteps.escribirTitulo(listaRegistro.get(0).getTitle());
		agregarDireccionSteps.clickGuardar();

	}

	@Entonces("^valido la presencia del boton Add a new address$")
	public void validoLaPresenciaDelBotonAddANewAddress() {
		agregarDireccionSteps.validarPresenciaDelBoton();
	}

}
