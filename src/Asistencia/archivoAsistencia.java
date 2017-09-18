/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asistencia;


import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author javier
 */
public class archivoAsistencia {
    
    
    public void grabar() throws FileNotFoundException, IOException, ClassNotFoundException{
        
        
        
        FileOutputStream entrada = new FileOutputStream("F:/asistencia.txt");
        ObjectOutputStream guardarDepartamento = new ObjectOutputStream(entrada);
        guardarDepartamento.writeObject(ingresarAsistencia.as);
        entrada.close();
        
       
        
    }
    
    public void recuperar() throws FileNotFoundException, IOException, ClassNotFoundException{
        
        
        FileInputStream recuperar = new FileInputStream("F:/asistencia.txt");
        ObjectInputStream recuperarDepartamento = new ObjectInputStream(recuperar);
        ingresarAsistencia.as = (ArrayList) recuperarDepartamento.readObject();
        recuperar.close();
                      
    }
    
    
}
