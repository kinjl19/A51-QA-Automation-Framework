import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
public class homework17 extends BaseTest {
    @Test
    public void addSongToPlaylist() {

//      Added ChromeOptions argument below to fix websocket error
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String url = "https://qa.koel.app/";
        driver.get(url);

        WebElement regLink = driver.findElement(By.cssSelector("[href='registration']"));
        regLink.click();

        String regURL = "https://qa.koel.app/registration";
        Assert.assertEquals(driver.getCurrentUrl(), regURL);

        WebElement emUser = driver.findElement(By.cssSelector("[type='email']"));
        emUser.sendKeys("kinjal.borad@testpro.io");

        WebElement emPswd = driver.findElement(By.cssSelector("[type='password']"));
        emPswd.sendKeys("Ganesh#123");

        WebElement emLogin = driver.findElement(By.cssSelector("[type='submit']"));
        emLogin.click();

        //driver.quit();
    }

}
