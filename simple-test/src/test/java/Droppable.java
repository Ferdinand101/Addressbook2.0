import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Droppable extends TestBase {
    @Test
    public void testDroppable(){
        wd.navigate().to("http://localhost/Tests/drop.html");

        WebElement box = wd.findElement(By.cssSelector("#draggable"));
        WebElement target = wd.findElement(By.cssSelector("#droppable"));

        new Actions(wd).dragAndDrop(box, target).release().perform();

    }
    @Test
    public void testDroppable2(){
        wd.navigate().to("http://localhost/Tests/drop.html");

        WebElement box = wd.findElement(By.cssSelector("#draggable"));
        WebElement target = wd.findElement(By.cssSelector("#droppable"));

        new Actions(wd).moveToElement(box)
                .clickAndHold().moveToElement(target)
                .release().perform();

    }
}
