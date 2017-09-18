
package Departamento;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class archivoDepartamento {
    
    public archivoDepartamento(){
        
        
    }
            
    
    public void grabar() throws FileNotFoundException, IOException, ClassNotFoundException{
        
        
        
        FileOutputStream entrada = new FileOutputStream("F:/departamento.txt");
        ObjectOutputStream guardarDepartamento = new ObjectOutputStream(entrada);
        guardarDepartamento.writeObject(ingresarDepartamentos.dt);
        entrada.close();
        
       
        
    }
    
    public void recuperar() throws FileNotFoundException, IOException, ClassNotFoundException{
        
        
        FileInputStream recuperar = new FileInputStream("F:/departamento.txt");
        ObjectInputStream recuperarDepartamento = new ObjectInputStream(recuperar);
        ingresarDepartamentos.dt = (ArrayList) recuperarDepartamento.readObject();
        recuperar.close();
        
               
    }
    
    
    
    
    
            
            
    
    
}
