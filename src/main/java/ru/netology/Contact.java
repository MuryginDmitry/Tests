package ru.netology;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Contact {
    protected String name;
    protected int phoneNumber;
    static List<Contact> contactList = new ArrayList<>();

    public Contact(String name, int phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phoneNumber);
    }

    @Override
    public boolean equals(Object obj) {
        Contact o = (Contact) obj;
        return name.equals(o.name) && phoneNumber == o.phoneNumber;
    }

    @Override
    public String toString() {
        return this.name + " " + this.phoneNumber;
    }

    public static void newContact(String name, int phoneNumber) {
        contactList.add(new Contact(name, phoneNumber));
    }

    public static void printList() {
        System.out.println();
        System.out.println("Список контактов:");
        for (Contact t : contactList) {
            System.out.println(t);
        }

    }

    public static void contactByNumber(int phoneNumber) {
        System.out.println();
        int i = 0;
        for (Contact t : contactList) {
            if (t.phoneNumber == phoneNumber) {
                System.out.println("Найден контакт:" + t.name);
                break;
            } else {
                i++;
            }
        }
        if (i == contactList.size()) {
            System.out.println("Контакт не найден.");
        }

    }


}

