/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contactmangager;
import java.util.ArrayList;
/**
 *
 * @author caube
 */
public class ContactListhuhu {
    private String myNumber;
    private ArrayList<Contact> myContacts;
    
    public ContactListhuhu(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }
    
    private int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }
    
    public boolean addContact(Contact contact){
        if(findContact(contact)>0){
            System.out.println("Contact is already");
            return false;
        } 
        myContacts.add(contact);
        return true;
    }
    
    public boolean updateContact(Contact oldContact, Contact newContact){
        int foundPosition = findContact(oldContact);
        if(foundPosition < 0){
            System.out.println("Contact was not found");
            return false;
        }
        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName()+"was replaced with "+ newContact.getName());
        return true;
    }
    
    public boolean removeContact(Contact contact){
        int foundPosition = findContact(contact);
        if(foundPosition < 0){
            System.out.println("Contact was not found");
            return false;
        }
        this.myContacts.remove(contact);
        System.out.println(contact.getName()+ "was deleted");
        return true;
    }
    
    public int findContact(String contactName){
        for (int i = 0; i< this.myContacts.size();i++){
            Contact contact = myContacts.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }
    
    public void printContact(){
        System.out.println("Contact list "+this.myNumber);
        for (int i=0;i<this.myContacts.size();i++){
            System.out.println((i+1)+") "+myContacts.get(i).getName()+" -> "+myContacts.get(i).getphoneNumber());
        }
    }
    
    //queryContact(String name) return Contact 
    public Contact queryContact(String name) {
        int position=findContact(name);
        if(position>=0){
            return this.myContacts.get(position);
        }
        return null;
    }
    
    public String queryContact(Contact contact){
        if(findContact(contact)>0){
            return contact.getName();            
        }
        return null;
    }
}
