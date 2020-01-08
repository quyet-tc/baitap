/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contactmangager;

/**
 *
 * @author admins
 */
public class Contact {
    private String name;
    private String phonenumber;
    
    public Contact( String name, String phonenumber){
    this.name = name ;
    this .phonenumber = phonenumber;
    
    }
    public String getName(){
return name;
}
    private String phonenumber(){
    return phonenumber;
    }

    public String getphoneNumber() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
