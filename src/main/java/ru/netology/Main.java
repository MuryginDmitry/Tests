package ru.netology;

public class Main {
    public static void main(String[] args) {
        Contact.newContact("Вася", 890350255);
        Contact.newContact("Петя", 890350343);
        Contact.newContact("Федя", 890350444);
        Contact.printList();
        PhoneBook.newGroup("Работа");
        PhoneBook.newGroup("Дом");
        PhoneBook.addContactToGroup("Работа", 0);
        PhoneBook.addContactToGroup("Дом", 1);
        PhoneBook.addContactToGroup("Дом", 0);
        System.out.println(PhoneBook.printGroup("Работа"));
        System.out.println(PhoneBook.printGroup("Дом"));
        Contact.contactByNumber(890350444);
        Contact.contactByNumber(890350111);
    }
}