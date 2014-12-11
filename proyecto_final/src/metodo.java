
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Telcel
 */
public class  metodo extends Thread {

    carrusel carr;

    public metodo(carrusel carr) {
        this.carr = carr;
        this.setDaemon(true);
        this.setName("Ciclo Imagenes");
    }
    
    public void setCarrusel(carrusel c)
    {
        carr=c;
    }
    
    @Override
    public void run() {
        super.run(); 
        while(true){
            carr.hola();   
            try {
                sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(metodo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
}
