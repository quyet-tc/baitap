/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contactmangager;
import java.util.Scanner;
/**
 *
 * @author caube
 */
public class Mai {
    private static Scanner scanner = new Scanner(System.in);
    private static ContactListhuhu contactList = new ContactListhuhu("0123456789");
    
    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printActions();
        while(!quit){
            System.out.println("\n Enter action: (6 to show avaiable actions)");
            int action = scanner.nextInt();
            scanner.nextLine();
            
            switch(action){
                case 0:
                    System.out.println("\n shutting down ... ");
                    quit = true;
                    break;
                case 1:
                    contactList.printContact();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }
    private static void addNewContact(){
        System.out.println("Enter new contact name: ");
        String name =  scanner.nextLine();
        System.out.println("Enter Phone Number");
        String phone =  scanner.nextLine();
        Contact contact = new Contact(name, phone);
        if(contactList.addContact(contact)){
            System.out.println("New Contact Added: name = "+name+" phone "+phone);
        }else{
            System.out.println("Cannot add, "+name+" already on contact list");
        }
    }
    
    private static void updateContact(){
        System.out.println("Enter exsiting contac name: ");
        String name = scanner.nextLine();
        Contact existingContact = contactList.queryContact(name);
        if(existingContact==null){
            System.out.println("Contact not found");
            return ;
        }
        System.out.println("Enter new contact name");
        String newName = scanner.nextLine();
        System.out.println("Enter new phone number");
        String newPhone = scanner.nextLine();
        Contact contact = new Contact(newName, newPhone);
        if(contactList.updateContact(existingContact, contact)){
            System.out.println("Successfully update record");
        }else{
            System.out.println("Error updating record");
        }
    }
    
    private static void removeContact(){
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContact = contactList.queryContact(name);
        if(existingContact==null){
            System.out.println("Contact not found");
            return ;
        }
        if(contactList.removeContact(existingContact)){
            System.out.println("Successfully deleted");
        }else{
            System.out.println("Error deleting contact");
        }
    }
    
    private static void queryContact(){
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContact =  contactList.queryContact(name);
        if (existingContact==null) {
            System.out.println("Contact not found");
            return ;
        }else{
            System.out.println("Name "+existingContact.getName()+" phone number is "+existingContact.getphoneNumber());
        }
    }
    
    private static void startPhone(){
        System.out.println("Starting phone ....");
    }
    
    private static void printActions(){
        System.out.println("\nAvaiable actions: \npress");
        System.out.println("0 - to shutdown \n"
                + "1 - to print contacts\n"
                + "2 - to add new contact\n"
                + "3 - to update existing contact\n"
                + "4 - to remove contac\n"
                + "5 - query if an existing contact\n"
                + "6 - to print a list avaiable actions");
        System.out.println("Choose your actions: ");
    }
}