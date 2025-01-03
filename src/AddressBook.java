import java.util.ArrayList;

public class AddressBook {

    private ArrayList<Contact> contacts;

    public AddressBook(){
        contacts= new ArrayList<>();
    }

    public void addContact(Contact contact){
        contacts.add(contact);
    }

    public void displayContacts(){
        System.out.println("Contacts in Address Book: ");
        for(Contact contact: contacts){
            System.out.println(contact);
        }
    }
}
