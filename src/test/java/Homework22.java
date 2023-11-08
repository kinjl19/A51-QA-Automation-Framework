import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework22 extends BasePage {
    public Homework22(WebDriver dr) {
        super(dr);
    }

    @Test
    public void renamePlaylist(){
        String newPlaylistName = "Test Playlist";
        String updatedPlaylistMsg = "Updated playlist \"Test Playlist\"";

        LoginPage lPage = new LoginPage(driver);
        HomePage hPage = new HomePage(driver);

        lPage.login();
        hPage.doubleClickPlaylist();
        hPage.enterNewPlaylistName(newPlaylistName);
        Assert.assertEquals(hPage.getRenamePlaylistSuccessMsg(), updatedPlaylistMsg);

    }
}
