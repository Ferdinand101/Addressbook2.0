package com.telRan.ashkelon;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {


    @Test
    public void testContactCreation() {
        initContactCreation();
        fillContactForm(new ContactData("name", "lname", "Tel-Aviv", "s@g.com", "123455666"));
        new Select(wd.findElement(By.name("new_group"))).selectByVisibleText("dd");
        submitContactCreation();
    }

    public void submitContactCreation() {
        wd.findElement(By.name("submit")).click();
    }

    public void fillContactForm(ContactData contactData) {
        type(By.name("firstname"), contactData.getfName());
        type(By.name("lastname"), contactData.getlName());
        type(By.name("address"), contactData.getAddress());
        type(By.name("email"), contactData.getEmail());
        type(By.name("home"), contactData.getPhoneHome());
    }

    public void initContactCreation() {
        click(By.xpath("//a[@href='edit.php']"));
    }


}
