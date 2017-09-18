
package Vacaciones;
import java.io.*;
import java.util.ArrayList;

public class archivoVacaciones {
    
    public archivoVacaciones(){
        
    }
    
    public void grabar() throws FileNotFoundException, IOException, ClassNotFoundException{
        
        
        
         FileOutputStream salida = new FileOutputStream("vacaciones.txt");
         ObjectOutputStream guardarEmpleado = new ObjectOutputStream(salida);
         guardarEmpleado.writeObject(ingresarVacaciones.ia);
         salida.close();
    }
    
    public  void recuperar() throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream   entrada = new FileInputStream("vacaciones.txt");
        ObjectInputStream  entrarEmpleado = new ObjectInputStream(entrada);
        ingresarVacaciones.ia = (ArrayList) entrarEmpleado.readObject();
        entrada.close();
        
        
        
    }
    
    
    
    
}
