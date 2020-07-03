package desafio1;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class UsuarioTest {
    @Test
    public void testNavegacaoDoUsuario () {
        System.setProperty("webdriver.chromedriver", "~/projetos/luiza/drivers/chromedriver");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

         // Primeiro Fluxo do Storytelling: Busca e compra de bebida com marca especifica //


        // Navegando para a pagina
        navegador.get("https://www.ze.delivery/");

        // "Você tem 18 anos ou mais?"
        navegador.findElement(By.id("age-gate-button-yes")).click();

        // Entrar
        navegador.findElement(By.id("welcome-button-sign-in")).click();

        // Entrar com email
        navegador.findElement(By.className("css-16rb6l9-buttonBase-primaryButton-mailButton-IconButton")).click();

        // Digitar email
        navegador.findElement(By.name("email")).sendKeys("zeteste2020@gmail.com");

        // Digitar senha
        navegador.findElement(By.name("password")).sendKeys("amarelo2020");

        // Entrar
        navegador.findElement(By.id("login-mail-button-sign-in")).click();

       // Buscar Colorado Appia 600ml
         navegador.findElement(By.id("search-product-input")).sendKeys("Colorado Appia");

         //Selecionar Colorado
        navegador.findElement(By.className("css-kzmtws-productCard")).click();

        //Selecionar 6 unidades
        navegador.findElement(By.id("add-amount-6")).click();

        // Adicionar a sacola
        navegador.findElement(By.id("add-product")).click();

        // Continuar Compra
        navegador.findElement(By.id("finish-order")).click();

        //Revisar pedido
        navegador.findElement(By.className("css-15p8lmg-buttonBase-primaryButton")).click();

        //Escolher forma de pagamento
        navegador.findElement(By.id("Cartão de Débito ou Crédito")).click();

        //Finalixar Compra
        navegador.findElement(By.id("payment-method-button-finish-purchase")).click();

        // Confirmar Compra
        navegador.findElement(By.className("css-15p8lmg-buttonBase-primaryButton")).click();

        // "Agradecemos por ficar em casa"











        assertEquals(1,1);
    }
}
