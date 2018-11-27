import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstSimpleTest {
    WebDriver wd;

    @BeforeMethod
    public void setUp(){
        wd = new ChromeDriver();
    }
    @Test
    public void firstTest(){
        //get pareil que navigate to, navigate plus recent
        wd.get("https://jqueryui.com");
        wd.findElement(By.name("s")).click();
        wd.findElement(By.name("s")).clear();
        wd.findElement(By.name("s")).sendKeys("Button");

        wd.findElement(By.cssSelector(".icon-search")).click();

        Assert.assertEquals(wd.findElement(By.cssSelector("h1 span")).getText(),"Button");

    }

    @AfterMethod
    public void tearDown(){
        wd.quit();
    }
}
