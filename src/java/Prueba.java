/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author arley
 */
@ManagedBean
@ViewScoped
public class Prueba {

    /**
     * Creates a new instance of Prueba
     */
    public Prueba() 
    {        
    }
    
    private String nombre = "prueba 3";
    private String algo = "prueba 3";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
