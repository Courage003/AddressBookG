import java.util.ArrayList;
import java.util.Scanner;
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

    public boolean editContact(String firstName, Scanner sc){
        for(Contact contact: contacts){
            if(contact.getFirstName().equalsIgnoreCase(firstName)){
                System.out.println("\nEditing contact: " + contact);

                System.out.print("Enter new Address: ");
                contact.setAddress(sc.nextLine());
                System.out.print("Enter new City: ");
                contact.setCity(sc.nextLine());
                System.out.print("Enter new State: ");
                contact.setState(sc.nextLine());
                System.out.print("Enter new Zip: ");
                contact.setZip(sc.nextLine());
                System.out.print("Enter new Phone Number: ");
                contact.setPhoneNumber(sc.nextLine());
                System.out.print("Enter new Email: ");
                contact.setEmail(sc.nextLine());

                return true;
            }
        }
        return false; // Contact not found


        }

}
