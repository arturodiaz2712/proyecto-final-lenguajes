
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author T107
 */
public class galeria {
     ArrayList<imagencita> imagenes;

    public galeria() {
    imagenes=new ArrayList<imagencita>();
    imagencita i1=new imagencita();
    i1.setUrl("folder/alaska.png");
    i1.setTitulo("Paisaje nevado en alaska");
    i1.setDescripcion("es un lugar con temperaturas bajo cero en el cual corre peligro de desaparecer");
    
    imagencita i2=new imagencita();
    i2.setUrl("folder/alpes.png");
    i2.setTitulo("paisaje en epoca de vereano en los alpes suisos");
    i2.setDescripcion("es una tundra con una fauna basta ");
    
    imagencita i3=new imagencita();
    i3.setUrl("folder/bosque.png");
    i3.setTitulo("bosque de algun pais");
    i3.setDescripcion("temperaturas templadas y con peligro de desaparecer por el descuido humano");
    
    imagencita i4=new imagencita();
    i4.setUrl("folder/montañas.png");
    i4.setTitulo("montañas de un pais nordico");
    i4.setDescripcion("un lugar en extremo frio con ventiscas peligrosas");
    
    imagencita i5=new imagencita();
    i5.setUrl("folder/Desert.png");
    i5.setTitulo("sierra de colorado");
    i5.setDescripcion("esta imagen la baje de las que vienen predeterminadas en la compu esta chida");
    
    
    
    imagenes.add(i1);
    imagenes.add(i2);
    imagenes.add(i3);
    imagenes.add(i4);
    imagenes.add(i5);
    
    }

    

   public ArrayList<imagencita> leerTodas()
   {
     return imagenes;
   }
    public void setImagenes(ArrayList<imagencita> imagenes) {
        this.imagenes = imagenes;
    }
    
    
}
