import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Homework18 extends BaseTest {

    @Test
    public void playSong(){
        openBrowser("https://qa.koel.app/");
        loginSite("kinjal.borad@testpro.io", "Ganesh#123");
        playNextSong();
        confirmPlay();
        
    }
}
