package com.elpisor.qa.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper  extends  HelperBase{
  public SessionHelper(WebDriver wd) {
    super(wd);
  }
  public void login(String user, String password) {
    type(By.name("user"), user);
    type(By.name("pass"), password);
    click(By.cssSelector("[type=submit]"));
  }

  public void openSite(String url) {
    wd.get(url);
  }
}
