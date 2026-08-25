import java.util.*;

public class ContactManager {

    public static void main(String[] args) {
        HashMap<String, Contact> contacts = new HashMap<>();

        contacts.put("Alice Smith", new Contact("Alice Smith", "+1 617 555 0101"));
        contacts.put("Bob Johnson", new Contact("Bob Johnson", "+1 212 555 0172"));
        contacts.put("Charlie Brown", new Contact("Charlie Brown", "+44 20 7946 0958"));
        contacts.put("Diana Davis", new Contact("Diana Davis", "+358 40 123 4567"));
        contacts.put("Evan Wilson", new Contact("Evan Wilson", "+1 415 555 0140"));

        Contact found = contacts.get("Alice Smith");
        if (found == null) {
            System.out.println("Contact not found.");
        } else {
            System.out.println(found);
        }

        Contact missing = contacts.get("Unknown Person");
        if (missing == null) {
            System.out.println("Contact not found.");
        } else {
            System.out.println(missing);
        }

        ArrayList<Contact> sorted = new ArrayList<>(contacts.values());
        sorted.sort((a, b) -> a.getName().compareTo(b.getName()));

        System.out.println("=== All Contacts ===");
        for (Contact contact : sorted) {
            System.out.println(contact);
        }
    }
}
