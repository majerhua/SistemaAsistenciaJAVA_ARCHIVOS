
package Empleado;

import Principal.Trabajador;
import java.io.*;

public class Empleado extends Trabajador implements Serializable{

    private String tipoEmpleado;

    
    public Empleado(String tipoEmpleado, String codigoTrabajador, String nombre, String apellido, Integer edad, String direccion, Integer telefono, String fechaIngreso, String codigoDepartamento) {
        super(codigoTrabajador, nombre, apellido, edad, direccion, telefono, fechaIngreso, codigoDepartamento);
        this.tipoEmpleado = tipoEmpleado;
    }

   
    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    
    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }
   
    
    
   
    
}
