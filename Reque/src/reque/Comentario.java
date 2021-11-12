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
public class Comentario {
    String Text;
    String Autor;

    public Comentario(String Text, String Autor) {
        this.Text = Text;
        this.Autor = Autor;
    }

    public String getText() {
        return Text;
    }

    public String getAutor() {
        return Autor;
    }
    
    public boolean Public() {
        return true;
    }
    
    
}
