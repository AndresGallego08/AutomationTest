package com.automation.address.test.pageobjects;

import net.serenitybdd.core.pages.PageObject;

import static org.junit.Assert.assertThat;

import org.hamcrest.Matchers;
import org.openqa.selenium.By;


public class AgregarDireccionPageObject extends PageObject {
	
	By btnMyAddress = By.xpath("//a[@title='Addresses']");
	By btnAddAddress = By.xpath("//a[@href='http://automationpractice.com/index.php?controller=address']");
	By txtFirstName = By.id("firstname");
	By txtLastName = By.id("lastname");
	By txtCompany = By.id("company");
	By txtAddress = By.id("address1");
	By txtAddressLineTwo = By.id("address2");
	By txtCity = By.id("city");
	By listState = By.id("id_state");
	By txtPostalCode = By.id("postcode");
	By txtHomePhone = By.id("phone");
	By txtMobilePhone = By.id("phone_mobile");
	By txtAdditionalInformation = By.id("other");
	By txtTitle = By.id("alias");
	By btnSave = By.id("submitAddress");
	
	
	public By listState(String state) {
		return By.xpath("//option[contains(text(),'" + state + "')]");
	}
	
	public void clickEnMyAddresses() {
		getDriver().findElement(btnMyAddress).click();
	}
	
	public void clickAddNewAddress() {
		getDriver().findElement(btnAddAddress).click();
	}
	
	public void escribirNombre(String firstName) {
		getDriver().findElement(txtFirstName).sendKeys(firstName);
	}
	
	public void escribirApellido(String lastName) {
		getDriver().findElement(txtLastName).sendKeys(lastName);
	}
	
	public void escribirEmpresa(String company) {
		getDriver().findElement(txtCompany).sendKeys(company);
	}
	
	public void escribirDireccion(String address) {
		getDriver().findElement(txtAddress).sendKeys(address);
	}
	
	public void escribirDireccionDos(String addressLineTwo) {
		getDriver().findElement(txtAddressLineTwo).sendKeys(addressLineTwo);
	}
	
	public void escribirCiudad(String city) {
		getDriver().findElement(txtCity).sendKeys(city);
	}
	
	public void seleccionarEstado(String state) {
		getDriver().findElement(listState(state)).click();
	}
	
	public void escribirCodigoPostal(String postalCode) {
		getDriver().findElement(txtPostalCode).sendKeys(postalCode);
	}
	
	public void escribirTelefonoCasa(String homePhone) {
		getDriver().findElement(txtHomePhone).sendKeys(homePhone);
	}
	
	public void escribirTelefonoMovil(String mobilePhone) {
		getDriver().findElement(txtMobilePhone).sendKeys(mobilePhone);
	}
	
	public void escribirInformacionAdicional(String additionalInformation) {
		getDriver().findElement(txtAdditionalInformation).sendKeys(additionalInformation);
	}
	
	public void escribirTitulo(String title) {
		getDriver().findElement(txtTitle).clear();
		getDriver().findElement(txtTitle).sendKeys(title);
	}
	
	public void clickGuardar() {
		getDriver().findElement(btnSave).click();
	}
	
	public void validarPresenciaDelBoton() {
		assertThat(getDriver().findElement(btnAddAddress).isDisplayed(), Matchers.is(true));
	}
	
}
