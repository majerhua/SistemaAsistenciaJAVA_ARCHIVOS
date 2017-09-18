
package Departamento;
import java.io.*;

public class departamento implements Serializable {
    
    private String codigoDepartamento;
    private String nombre;
    private String descripcion;

    
    public departamento(){
        
    }
    
    public departamento(String codigoDepartamento, String nombre, String descripcion) {
        this.codigoDepartamento = codigoDepartamento;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

  
    public String getCodigoDepartamento() {
        return codigoDepartamento;
    }

   
    public void setCodigoDepartamento(String codigoDepartamento) {
        this.codigoDepartamento = codigoDepartamento;
    }

   
    public String getNombre() {
        return nombre;
    }

   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public String getDescripcion() {
        return descripcion;
    }

   
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
    
    
    
}
