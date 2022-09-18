package Lesson_4;

import java.util.*;

public class Telefon_Numbers {

    ArrayList<Contact> directory = new ArrayList<>();

    public void add(String name, Long number){
        Contact contact = new Contact(name,number);
        this.directory.add(contact);
    }

    public void get(String name){
        System.out.println(name);
        for (Contact a: directory){
            if (a.getName() == name){
                System.out.println("+" + a.getNumber());
            }
        }
    }
}
