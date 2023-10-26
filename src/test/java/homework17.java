import com.fasterxml.jackson.databind.ser.Serializers;
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
        openBrowser("https://qa.koel.app/");
        loginSite("kinjal.borad@testpro.io", "Ganesh#123");
        klSearch("midnight");
        String adConfirm = "Added 1 song into \" kinjal \"";
        Assert.assertEquals(driver.findElement(By.cssSelector("div.success.show")).getText(), adConfirm);
        //Test Comment
        driver.quit();

    }

}
