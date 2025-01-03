import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//First UC1 feature added
        System.out.println("Welcome to Address Book Program!");
        AddressBook addressBook= new AddressBook();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter contact details: ");
        System.out.print("First Name: ");
        String firstName = sc.nextLine();
        System.out.print("Last Name: ");
        String lastName = sc.nextLine();
        System.out.print("Address: ");
        String address = sc.nextLine();
        System.out.print("City: ");
        String city = sc.nextLine();
        System.out.print("State: ");
        String state = sc.nextLine();
        System.out.print("Zip: ");
        String zip = sc.nextLine();
        System.out.print("Phone Number: ");
        String phoneNumber = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();

        Contact contact = new Contact(firstName,lastName,address,city,state,zip,phoneNumber,email);
        addressBook.addContact(contact);

        System.out.println("Contact added successfully!");
        addressBook.displayContacts();
    }
}