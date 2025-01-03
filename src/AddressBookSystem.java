import java.util.HashMap;
import java.util.Scanner;
public class AddressBookSystem {
    private HashMap<String, AddressBook>addressBookMap;

    public AddressBookSystem(){
        addressBookMap = new HashMap<>();
    }

    //Add a new Address Book
    public void addAddressBook(String name){
        if(addressBookMap.containsKey(name)){
            System.out.println("An Address Book with this name already exists!");
        }
        else{
            addressBookMap.put(name, new AddressBook());
            System.out.println("Address Book " + name + " added successfully!");

        }
    }

    //Get an AddressBook by name
    public AddressBook  getAddressBook(String name){
        return addressBookMap.get(name);
    }

    //Display all Address Books
    public void displayAddressBooks(){
        System.out.println("Available Address Books: ");
        if(addressBookMap.isEmpty()){
            System.out.println("No Address Books available.");

        }
        else{
            addressBookMap.keySet().forEach(System.out::println);

        }
    }
}
