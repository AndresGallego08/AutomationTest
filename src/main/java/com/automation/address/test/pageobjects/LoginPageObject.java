package com.automation.address.test.pageobjects;

import static org.junit.Assert.assertThat;

import org.hamcrest.Matchers;
import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://automationpractice.com/")
public class LoginPageObject extends PageObject {
	
	By btnLogin = By.xpath("//a[@class='login']");
	By txtEmail = By.id("email");
	By txtClave = By.id("passwd");
	By btnSignIng = By.id("SubmitLogin");
	By btnMyAddress = By.xpath("//a[@title='Addresses']");
	
	public void clickLogin() {
		getDriver().findElement(btnLogin).click();
	}
	
	public void escribirEmail(String email) {
		getDriver().findElement(txtEmail).sendKeys(email);
	}
	
	public void escribirClave(String clave) {
		getDriver().findElement(txtClave).sendKeys(clave);
	}
	
	public void clickSignIn() {
		getDriver().findElement(btnSignIng).click();
	}
	
	public void validarPresenciaDelBoton() {
		assertThat(getDriver().findElement(btnMyAddress).isDisplayed(), Matchers.is(true));
	}

}
