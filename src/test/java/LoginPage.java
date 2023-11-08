import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver dr){ super(dr); }
    By emailField = By.cssSelector("input[type='email']");
    By pswdField = By.cssSelector("input[type='password']");
    By submitBtn = By.cssSelector("button[type='submit']");
    public void provideEmail(String email){
        findElement(emailField).sendKeys(email);
    }
    public void providePassword(String password){
        findElement(pswdField).sendKeys(password);
    }
    public void clickSubmit(){
        click(submitBtn);
    }
    public void login(){
        provideEmail("demo@class.com");
        providePassword("te$t$tudent");
        clickSubmit();
    }

}
