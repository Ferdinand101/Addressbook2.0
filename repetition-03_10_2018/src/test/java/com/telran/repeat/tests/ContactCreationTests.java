package com.telran.repeat.tests;

import com.telran.repeat.Provider.ContactStaticProvider;
import com.telran.repeat.Provider.StaticProvider;
import com.telran.repeat.model.Contact;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ContactCreationTests extends TestBase {


  @Test(dataProvider = "validContacts", dataProviderClass = ContactStaticProvider.class)
  public void createContactTest(Contact contact) throws IOException {
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(contact);
            //new Contact()
//            .setfName("Moshe")
//            .setlName("Coen")
//            .setAddress("Tel-Aviv")
//            .setEmail("gg@hh.com")
//            .setPhoneHome("134455566"));
    app.getContactHelper().confirmContactCreation();

  }
}
