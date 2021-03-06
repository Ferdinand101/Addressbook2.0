package com.elpisor.qa.manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
  WebDriver wd;
  private SessionHelper sessionHelper;

  private String browser;

  public ApplicationManager(String browser) {
    this.browser = browser;
  }

  public void start() {
   if (browser.equals(BrowserType.CHROME)) {
      wd = new ChromeDriver();
    } else if (browser.equals(BrowserType.FIREFOX)) {
      wd = new FirefoxDriver();
    } else if (browser.equals(BrowserType.IE)){
      wd = new InternetExplorerDriver();
    }

    wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      sessionHelper = new SessionHelper(wd);
    sessionHelper.openSite("http://localhost/addressbook/");


    sessionHelper.login("admin", "secret");


  }

  public void stop()
  {
    wd.quit();
  }

  public SessionHelper getSessionHelper() {
    return sessionHelper;
  }
}
