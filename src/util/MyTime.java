package util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Administrador
 */
public class MyTime extends Observable implements Runnable {   
      
    private String horas;   
      
    public MyTime(Observer obs) {   
        this.addObserver(obs);  
    }   
    public void run() {   
        while(true){  
            this.horas = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss").format(Calendar.getInstance().getTime());  
            this.notifyObservers();  
        }          
    }    
  
    public String getHoras() {  
        return horas;  
    }    
}  
