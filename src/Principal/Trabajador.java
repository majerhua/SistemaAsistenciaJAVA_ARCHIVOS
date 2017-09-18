
package Principal;

import java.io.*;

public class Trabajador implements Serializable{
    
    private String codigoTrabajador;
    private String nombre;
    private String apellido;
    private Integer edad;
    private String direccion;
    private Integer telefono;
    private String fechaIngreso;
    private String codigoDepartamento;

    
    public Trabajador(){
        
    }
   
    public Trabajador(String codigoTrabajador, String nombre, String apellido, Integer edad, String direccion, Integer telefono, String fechaIngreso, String codigoDepartamento) {
        this.codigoTrabajador = codigoTrabajador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaIngreso = fechaIngreso;
        this.codigoDepartamento = codigoDepartamento;
    }

   
    public String getCodigoTrabajador() {
        return codigoTrabajador;
    }

    
    public void setCodigoTrabajador(String codigoTrabajador) {
        this.codigoTrabajador = codigoTrabajador;
    }

    
    public String getNombre() {
        return nombre;
    }

  
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
    public String getApellido() {
        return apellido;
    }

   
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    
    public Integer getEdad() {
        return edad;
    }

    
    public void setEdad(Integer edad) {
        this.edad = edad;
    }

   
    public String getDireccion() {
        return direccion;
    }

  
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

   
    public Integer getTelefono() {
        return telefono;
    }

    
    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    
    public String getFechaIngreso() {
        return fechaIngreso;
    }

    
    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

   
    public String getCodigoDepartamento() {
        return codigoDepartamento;
    }

   
    public void setCodigoDepartamento(String codigoDepartamento) {
        this.codigoDepartamento = codigoDepartamento;
    }

    
       
                    
    
}
