
package Vacaciones;

import java.io.*;

public class Vacaciones implements Serializable{
    
    private String codigo;
    private String fechaInicio;
    private String fechaFinal;
    private String autorisa;
    
    public Vacaciones(String codigo, String fechaInicio, String fechaFinal, String autorisa) {
        this.codigo = codigo;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.autorisa = autorisa;
    }

    
       
       
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public String getAutorisa() {
        return autorisa;
    }

    public void setAutorisa(String autorisa) {
        this.autorisa = autorisa;
    }


     
}
