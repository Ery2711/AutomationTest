package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void abrirNavegador(String url){
        driver.get(url);
    }

    public void clickBotonSesion() throws InterruptedException {
        WebElement botonSesion = driver.findElement(By.xpath("//a/span[text()='Iniciar sesión']"));
        botonSesion.click();
        Thread.sleep(2000);
    }

    public void clickLinkCuenta() throws InterruptedException {
        WebElement linkCuenta = driver.findElement(By.xpath("//a[@data-link-action='display-register-form']"));
        linkCuenta.click();
        Thread.sleep(2000);
    }
}
