/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrusel;

/**
 *
 * @author CESAR
 */
public class CargarImagen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Imagen i=new Imagen();
        i.getTitulo();
        i.setDescripcion(null);
        i.getUrl();
        
        GuardarImagen p=new GuardarImagen();
        p.GuardarImagen(i);
        
    }
    
}
