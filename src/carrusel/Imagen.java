/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrusel;
import java.io.Serializable;

/**
 *
 * @author CESAR
 */
public class Imagen implements Serializable {
    private String titulo;
    private String url;
    private String descripcion;
    
    public Imagen (){        
    }
    
    public Imagen(String titulo, String url, String descripcion){
        this.url=url;
        this.titulo=titulo;
        this.descripcion=descripcion;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
