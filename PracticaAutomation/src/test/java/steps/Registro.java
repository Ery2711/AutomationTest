package steps;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;

public class Registro {
    LoginPage loginPage = new LoginPage(Hooks.driver);
    HomePage homePage = new HomePage(Hooks.driver);
    RegisterPage registerPage = new RegisterPage(Hooks.driver);
    @Given("estoy en la página de la tienda {string}")
    public void abrirPagina(String url){
        loginPage.abrirNavegador(url);
    }

    @When("doy click en la opción iniciar sesión")
    public void inicioSesion() throws InterruptedException {
        loginPage.clickBotonSesion();
    }

    @And("doy click en el link text cree una cuenta aquí")
    public void crearCuenta() throws InterruptedException {
        loginPage.clickLinkCuenta();
    }

    @And("lleno los campos del formulario para el registro: {string} {string} {string} {string} {string}")
    public void completarFormulario(String nombre, String apellido, String email, String pwd, String fechaNac){
        registerPage.llenarCamposRequeridos(nombre, apellido, email, pwd, fechaNac);
    }

    @And("doy click en el botón guardar")
    public void guardarRegistro(){
        registerPage.clickBotonGuardar();
    }

    @Then("debería visualizar mi usuario logeado en la pantalla: {string} {string}")
    public void confirmarUsuarioRegistrado(String nombre, String apellido) throws InterruptedException {
        homePage.validarUsuarioRegistrado(nombre, apellido);
    }
}