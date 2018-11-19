package com.telran.repeat.Provider;

import com.telran.repeat.model.Contact;
import com.telran.repeat.model.Group;
import org.testng.annotations.DataProvider;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ContactStaticProvider {
    @DataProvider
    public static Iterator<Object[]> validContacts() throws IOException {
        List<Object[]> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(new File("src/test/resources/contacts.csv")));
        String line = reader.readLine();
        while(line != null){
            String[] split = line.split(";");
            list.add(new Object[]{new Contact()
                    .setfName(split[0])
                    .setlName(split[1])
                    .setAddress(split[2]).setEmail(split[3]).setPhoneHome(split[4])});
                   /* .withGroupName(split[0])
                    .withGroupHeader(split[1])
                    .withGroupFooter(split[2])});
                    */
            line = reader.readLine();
        }
        return list.iterator();

}
}

