package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
    private WebDriver driver;

    public RegisterPage(WebDriver driver){
        this.driver = driver;
    }

    public void llenarCamposRequeridos(String nombre,String apellido, String email, String pwd, String fechaNac){
        WebElement nombreUsuario = driver.findElement(By.xpath("//input[@id='field-firstname']"));
        WebElement apellidoUsuario = driver.findElement(By.xpath("//input[@id='field-lastname']"));
        WebElement emailUsuario = driver.findElement(By.xpath("//input[@id='field-email']"));
        WebElement pwdUsuario = driver.findElement(By.xpath("//input[@id='field-password']"));
        WebElement fechaNacimiento = driver.findElement(By.xpath("//input[@id='field-birthday']"));
        nombreUsuario.sendKeys(nombre);
        apellidoUsuario.sendKeys(apellido);
        emailUsuario.sendKeys(email);
        pwdUsuario.sendKeys(pwd);
        fechaNacimiento.sendKeys(fechaNac);
        WebElement termsConditions = driver.findElement(By.xpath("//input[@name='psgdpr']"));
        WebElement privacyData = driver.findElement(By.xpath("//input[@name='customer_privacy']"));
        if (!termsConditions.isSelected()){
            termsConditions.click();
        }
        if (!privacyData.isSelected()){
            privacyData.click();
        }
    }

    public void clickBotonGuardar(){
        WebElement botonGuardar = driver.findElement(By.xpath("//button[@data-link-action='save-customer']"));
        botonGuardar.click();
    }
}
