/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrusel;
import java.util.ArrayList;

/**
 *
 * @author CESAR
 */
public class Galeria {
    ArrayList<Imagen>imagenes;
    
    public Galeria(){
        imagenes=new ArrayList<Imagen>();
        
        Imagen i1=new Imagen();
        i1.setUrl("F:\\Carrusel\\build\\classes\\Picture\\porsche.jpg");
        i1.setTitulo("Porsche 911");
        i1.setDescripcion("Es un auto muy antiguo que ha sido renovado con el pasar de los años."
                +" Este vehiculo en la actualidad es considerado uno de los mas rapidos y con mejor tecnologia");
        
        Imagen i2=new Imagen();
        i2.setUrl("F:\\Carrusel\\build\\classes\\Picture\\audir1.jpg");
        i2.setTitulo("Audi R1");
        i2.setDescripcion("Surgio en el año 2013, gracias a la demanda."
                +"Este diseño esta bazado para las personas jovenes que buscan vidersion,"
                +"comodidad y seguridad en el mismo vehiculo.");
        
        Imagen i3=new Imagen();
        i3.setUrl("F:\\Carrusel\\build\\classes\\Picture\\camaro.jpg");
        i3.setTitulo("Camaro");
        i3.setDescripcion("Es conciderado un muscle car, por todos los años que ha sibrevivido en el mercado."
                +"Se ha mejorado en todos los aspectos desde su primera edicion.");
        
        Imagen i4=new Imagen();
        i4.setUrl("F:\\Carrusel\\build\\classes\\Picture\\camaroz28.jpg");
        i4.setTitulo("Camaro Z28");
        i4.setDescripcion("Este auto es semejante al anterior camaro, la diferencia es que este tiene un motormas poderoso."
                +"Tiene mas HP porque tiene un motor con mas cilindradada y trae un turbo cargador de fabrica.");
        
        Imagen i5=new Imagen();
        i5.setUrl("F:\\Carrusel\\build\\classes\\Picture\\golf.jpg");
        i5.setTitulo("VW Golf");
        i5.setDescripcion("Es un auto un poco viejo ya que su primera edicion fue en los 70'."
                +"Desde entoces tambien se ha ido mejorando en todos los aspectos.");
        
        
        imagenes.add(i1);
        imagenes.add(i2);
        imagenes.add(i3);
        imagenes.add(i4);
        imagenes.add(i5);
    }
    
    public ArrayList<Imagen> leerTodas() {
        return imagenes;
    }

    public void setImagenes(ArrayList<Imagen> imagenes) {
        this.imagenes = imagenes;
    }
}
