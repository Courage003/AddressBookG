import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//First UC1 feature added
        System.out.println("Welcome to Address Book Program!");
        AddressBook addressBook= new AddressBook();
        Scanner sc = new Scanner(System.in);

        boolean continueProgram= true;
        while(continueProgram) {
            System.out.println("\nMenu: ");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display Contacts");
            System.out.println("5. Exit");
            System.out.println("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    //Add a new contact
                    System.out.println("Enter contact details: ");
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

                    Contact contact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
                    addressBook.addContact(contact);

                    System.out.println("Contact added successfully!");
                    addressBook.displayContacts();
                    break;

                case 2:
                    //Edit an existing contact
                    System.out.print("\nEnter the first name of the contact to be edited: ");
                    String nameToEdit = sc.nextLine();
                    if (addressBook.editContact(nameToEdit, sc)) {
                        System.out.println("Contact Updated successfully!");

                    } else {
                        System.out.println("Contact not found!");
                    }
                    break;

                case 3:
                    //Delete a contact
                    System.out.println("\nEnter the first name of the contact to be deleted: ");
                    String nameToDelete=sc.nextLine();
                    if(addressBook.deleteContact(nameToDelete)){
                        System.out.println("Contact deleted successfully!");
                    }
                    else{
                        System.out.println("Contact not found!");
                    }
                    break;

                case 4:
                    //Display all contacts
                    addressBook.displayContacts();
                    break;

                case 5:
                    //Exit the program
                    continueProgram = false;
                    break;

                default:
                    System.out.println("Invalid choice! Please try again. ");

            }

        }

        System.out.println("Existing addressbook program");
        sc.close();





    }
}