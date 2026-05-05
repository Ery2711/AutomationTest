package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void validarUsuarioRegistrado(String nombre, String apellido) throws InterruptedException {
            WebElement usuario = driver.findElement(By.xpath("//span[@class='hidden-sm-down']"));
            Thread.sleep(3000);
            usuario.getText();
            assertEquals(nombre + " " + apellido,usuario.getText());
    }
}
