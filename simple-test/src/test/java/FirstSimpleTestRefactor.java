import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstSimpleTestRefactor extends TestBase{

    @Test
    public void searchTestWithLoupe(){
        openSite("https://jqueryui.com");
        typeOnSearchField("Button");
        proceedToSearch();

        String actualText = getElementsText(By.cssSelector("h1 span"));
        System.out.println(actualText);

        Assert.assertEquals(actualText, "button");

    }

    @Test
    public void searchTestWithEnter(){
        openSite("https://jqueryui.com");
        typeOnSearchField("Button");
        proceedToSearchByClickingEnter();

        String actualText = getElementsText(By.cssSelector("h1 span"));
        System.out.println(actualText);

        Assert.assertEquals(actualText, "button");

    }
    @Test
    public void searchTestWithEnterWithPlus(){
        openSite("https://jqueryui.com");
        typeOnSearchField("Button"+Keys.ENTER);
        //proceedToSearchByClickingEnter();

        String actualText = getElementsText(By.cssSelector("h1 span"));
        System.out.println(actualText);

        Assert.assertEquals(actualText, "button");

    }


}