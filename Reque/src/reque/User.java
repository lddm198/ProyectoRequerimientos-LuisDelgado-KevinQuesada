/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reque;

/**
 *
 * @author kevin
 */
public class User {
    int tipo;
    String Name;
    String Email;

    public User(int tipo, String Name, String Email) {
        this.tipo = tipo;
        this.Name = Name;
        this.Email = Email;
    }

    public int getTipo() {
        return tipo;
    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }
    
    
    
}
