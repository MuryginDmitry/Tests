package ru.netology;

import java.util.*;

public class PhoneBook {
    static Map<String, List<Contact>> map = new HashMap<>();

    public static void newGroup(String groupName) {
        List<Contact> groupList = new ArrayList<>();
        map.put(groupName, groupList);
    }

    public static Map <String, List<Contact>> getMap() {
        return map;
    }
    public static void addContactToGroup(String groupName, int contactIndex) {
        List<Contact> groupList = map.get(groupName);
        groupList.add(Contact.contactList.get(contactIndex));
        map.put(groupName, groupList);
    }

    public static String printGroup(String groupName) {
        StringBuilder sb =new StringBuilder();
        sb.append("\n" +
                "Список контактов группы " + groupName + ":" + "\n");
        List<Contact> groupList = map.get(groupName);
        for (Contact t : groupList) {
            sb.append(t+"\n");
        }
        return sb.toString();
    }
}

