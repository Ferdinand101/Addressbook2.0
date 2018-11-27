import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class TestWithList extends TestBase{
    @Test
    public void listLeftMenuTest() throws InterruptedException {
        openSite("https://jqueryui.com");
        List<WebElement> menu = wd.findElements(By.cssSelector("#sidebar li"));
        int size = menu.size();
        System.out.println(size);//?
        for(int i=0;i<=size-1;i++){
            Thread.sleep(2000);
            WebElement menu1 = wd.findElement(By.cssSelector("#sidebar"));
            WebElement item = menu1.findElement(By.cssSelector("li:nth-child("+(i+1)+")"));
            String itemText = item.getText();
            item.click();
        }
    }

    @Test
    public void listLeftMenuTestBySubmenu() throws InterruptedException {
        openSite("https://jqueryui.com");

        List<WebElement> subMenu = wd.findElements(By.xpath("//aside[@class='widget']"));
        int size = subMenu.size();

        System.out.println(size);
        for(int i=0;i<=size-1;i++){
            String subMenuTitle = subMenu.toString();
            System.out.println(subMenu);
            //WebElement itemsList = subMenu.

        }
    }
}
