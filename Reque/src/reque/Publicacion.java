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
    String Dificultad;
    ArrayList<Comentario> Comments;
    int ID;

    public Publicacion (String Titulo, String Autor, String Texto, int ID, String Dificultad) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Texto = Texto;
        this.Comments = new ArrayList<Comentario>();
        this.ID = ID;
        this.Dificultad = Dificultad;
    }

    public String getDificultad() {
        return Dificultad;
    }

    public int getID() {
        return ID;
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

    public ArrayList<Comentario> getComments() {
        return Comments;
    }
    
    public void AddComment(Comentario c){
        this.Comments.add(c);
    }
    
   
    
    
}
