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

        Assert.assertEquals(driver.getCurrentUrl(), url);

        WebElement emUser = driver.findElement(By.cssSelector("[type='email']"));
        emUser.sendKeys("kinjal.borad@testpro.io");

        WebElement emPswd = driver.findElement(By.cssSelector("[type='password']"));
        emPswd.sendKeys("Ganesh#123");

        WebElement emLogin = driver.findElement(By.cssSelector("[type='submit']"));
        emLogin.click();

        WebElement klSearch = driver.findElement(By.cssSelector("[type='search']"));
        klSearch.sendKeys("midnight");

        WebElement vAll = driver.findElement(By.cssSelector("[data-test='view-all-songs-btn']"));
        vAll.click();

        WebElement fList = driver.findElement(By.xpath("//*[@id=\"songResultsWrapper\"]/div/div/div[1]/table/tr"));
        fList.click();

        WebElement AddTo = driver.findElement(By.cssSelector("[class='btn-add-to']"));
        AddTo.click();

        WebElement selPlaylist = driver.findElement(By.xpath("//*[@id=\"songResultsWrapper\"]/header/div[3]/div/section[1]/ul/li[12]"));
        selPlaylist.click();

        String adConfirm = "Added 1 song into kinjal";
        //Assert.assertEquals(driver.findElement(By.cssSelector("[class='alertify-logs top right']")).getText(), adConfirm);
        //Test Comment
        driver.quit();

    }

}
