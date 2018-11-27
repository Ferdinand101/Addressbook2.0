import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    WebDriver wd;

    @BeforeMethod
    public  void setUp(){
        wd = new ChromeDriver();
    }

    public void proceedToSearchByClickingEnter() {
        //clicker sur enter
        wd.findElement(By.cssSelector(".icon-search")).sendKeys(Keys.ENTER);
    }

    public String getElementsText(By locator) {
        return wd.findElement(locator)
                .getText().toLowerCase();
    }

    public void proceedToSearch() {
        click(By.cssSelector(".icon-search"));
    }

    public void typeOnSearchField(String text) {
        type( By.name("s"),text);
    }

    public void type( By locator,String text) {
        click(locator);
        wd.findElement(By.name("s")).clear();
        wd.findElement(By.name("s")).sendKeys(text);
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }

    public void openSite(String url) {
        wd.get(url);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        wd.quit();
    }
}
