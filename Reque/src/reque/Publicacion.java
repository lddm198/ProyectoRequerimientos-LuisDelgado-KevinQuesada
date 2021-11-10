/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reque;

import java.util.ArrayList;
import javax.swing.JButton;

/**
 *
 * @author kevin
 */
public class Publicacion extends JButton{
    String Titulo;
    String Autor;
    String Texto;
    ArrayList<Comment> Comments;

    public Publicacion (String Titulo, String Autor, String Texto) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Texto = Texto;
        this.Comments = new ArrayList<Comment>();
    }


    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public String getTexto() {
        return Texto;
    }

    public ArrayList<Comment> getComments() {
        return Comments;
    }
    
    public void AddComment(Comment c){
        this.Comments.add(c);
    }
    
    
}
