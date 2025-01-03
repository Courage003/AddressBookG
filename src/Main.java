import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program!");
        AddressBookSystem addressBookSystem = new AddressBookSystem();
        Scanner scanner = new Scanner(System.in);

        boolean continueProgram = true;
        while (continueProgram) {
            System.out.println("\nMenu:");
            System.out.println("1. Add New Address Book");
            System.out.println("2. Select Address Book");
            System.out.println("3. Display Address Books");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Add a new Address Book
                    System.out.print("\nEnter a unique name for the new Address Book: ");
                    String addressBookName = scanner.nextLine();
                    addressBookSystem.addAddressBook(addressBookName);
                    break;

                case 2:
                    // Select an Address Book
                    System.out.print("\nEnter the name of the Address Book to select: ");
                    String selectedBook = scanner.nextLine();
                    AddressBook addressBook = addressBookSystem.getAddressBook(selectedBook);
                    if (addressBook != null) {
                        manageAddressBook(addressBook, scanner);
                    } else {
                        System.out.println("Address Book not found!");
                    }
                    break;

                case 3:
                    // Display all Address Books
                    addressBookSystem.displayAddressBooks();
                    break;

                case 4:
                    // Exit the program
                    continueProgram = false;
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }

        System.out.println("\nExiting Address Book Program. Thank you!");
        scanner.close();
    }

    // Method to manage a specific Address Book
    private static void manageAddressBook(AddressBook addressBook, Scanner scanner) {
        boolean continueManaging = true;
        while (continueManaging) {
            System.out.println("\nAddress Book Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display Contacts");
            System.out.println("5. Back to Main Menu");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Add multiple contacts
                    boolean addMore = true;
                    while (addMore) {
                        System.out.println("\nEnter contact details:");
                        System.out.print("First Name: ");
                        String firstName = scanner.nextLine();
                        System.out.print("Last Name: ");
                        String lastName = scanner.nextLine();
                        System.out.print("Address: ");
                        String address = scanner.nextLine();
                        System.out.print("City: ");
                        String city = scanner.nextLine();
                        System.out.print("State: ");
                        String state = scanner.nextLine();
                        System.out.print("Zip: ");
                        String zip = scanner.nextLine();
                        System.out.print("Phone Number: ");
                        String phoneNumber = scanner.nextLine();
                        System.out.print("Email: ");
                        String email = scanner.nextLine();

                        Contact contact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
                        addressBook.addContact(contact);

                        System.out.print("\nDo you want to add another contact? (yes/no): ");
                        String choiceAdd = scanner.nextLine();
                        addMore = choiceAdd.equalsIgnoreCase("yes");
                    }
                    break;

                case 2:
                    // Edit an existing contact
                    System.out.print("\nEnter the first name of the contact to edit: ");
                    String nameToEdit = scanner.nextLine();
                    if (addressBook.editContact(nameToEdit, scanner)) {
                        System.out.println("Contact updated successfully!");
                    } else {
                        System.out.println("Contact not found!");
                    }
                    break;

                case 3:
                    // Delete a contact
                    System.out.print("\nEnter the first name of the contact to delete: ");
                    String nameToDelete = scanner.nextLine();
                    if (addressBook.deleteContact(nameToDelete)) {
                        System.out.println("Contact deleted successfully!");
                    } else {
                        System.out.println("Contact not found!");
                    }
                    break;

                case 4:
                    // Display all contacts
                    addressBook.displayContacts();
                    break;

                case 5:
                    // Back to main menu
                    continueManaging = false;
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
