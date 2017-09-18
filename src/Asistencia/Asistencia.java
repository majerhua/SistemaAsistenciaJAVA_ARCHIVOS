
package Asistencia;

import java.util.Date;
import java.io.*;

public class Asistencia implements Serializable{
    
    
    private String codigoEmpleado;
    private String Fecha;
    private String horaEntrada;

   
    
    
    public Asistencia(String codigoEmpleado, String Fecha, String horaEntrada) {
        this.codigoEmpleado = codigoEmpleado;
        this.Fecha = Fecha;
        this.horaEntrada = horaEntrada;
    }

   
    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    
    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    
    public String getFecha() {
        return Fecha;
    }

   
    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    
    public String getHoraEntrada() {
        return horaEntrada;
    }

   
    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }
   

   

    
    
    
    
}