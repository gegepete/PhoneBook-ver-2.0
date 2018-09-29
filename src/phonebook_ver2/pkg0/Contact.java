package phonebook_ver2.pkg0;
import java.io.*;
public class Contact implements Serializable {
    private String name, surname, mobile, email;    
    
    public Contact(String name, String surname, String mobile, String email){
        this.name = name;
        this.surname = surname;
        this.mobile = mobile;
        this.email = email;
    }
    
    public String toString(){
        return name + " " + surname + "    " + mobile + "    " + email;
    } 
    
    public String getName(){
        return this.name;    
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getSurname(){
        return this.surname;
    }
    
    public void setSurname(String surname){
        this.surname = surname;
    }
    
    public String getMobile(){
        return this.mobile;
    }
    
    public void setMobile(String mobile){
        this.mobile = mobile;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
}