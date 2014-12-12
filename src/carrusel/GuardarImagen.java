/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrusel;

import java.io.*;

/**
 *
 * @author CESAR
 */
public class GuardarImagen {
    public void GuardarImagen(Imagen i) throws Exception{
        File f=new File("F:\\galeria.xxx");
        FileOutputStream fos=new FileOutputStream(f);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(i);
    }
    
}
