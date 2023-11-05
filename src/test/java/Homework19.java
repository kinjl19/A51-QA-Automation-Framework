import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework19 extends BaseTest {
    @Test
    public void deletePlaylist() {
        String confirmDelete = "playlist";
        this.openBrowser("https://qa.koel.app/");
        this.loginSite("demo@class.com", "te$t$tudent");
        this.deleteSong();
        String x = this.getConfirmDelete();
        Assert.assertTrue(x.contains(confirmDelete));
        closeBrowser();
    }
}
