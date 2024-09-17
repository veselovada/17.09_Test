package third_test;

import java.util.HashMap;
import java.util.Map;


class AddressBook {
    private Map<String, String> contacts;

    public AddressBook() {
        contacts = new HashMap<>();
    }


    public void addContact(String name, String phone) {
        contacts.put(name, phone);
        System.out.println("Contact " + name + " added with a number " + phone);
    }


    public String getPhone(String name) {
        return contacts.get(name);
    }


    public void removeContact(String name) {
        if (contacts.remove(name) != null) {
            System.out.println("Contact " + name + " deleted.");
        } else {
            System.out.println("Contact " + name + " no found.");
        }
    }


    public void printAllContacts() {
        System.out.println("All contacts:");
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", phone number: " + entry.getValue());
        }
    }
}

