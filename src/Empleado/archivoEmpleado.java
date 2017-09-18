
package Empleado;
import static Empleado.ingresarEmpleado.lc;
import java.io.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class archivoEmpleado {
    
    public archivoEmpleado(){
        
    }
    
    public void grabar() throws FileNotFoundException, IOException, ClassNotFoundException{
        
        
        
         FileOutputStream salida = new FileOutputStream("emple.txt");
         ObjectOutputStream guardarEmpleado = new ObjectOutputStream(salida);
         guardarEmpleado.writeObject(ingresarEmpleado.lc);
         salida.close();
    }
    
    public  void recuperar() throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream   entrada = new FileInputStream("emple.txt");
        ObjectInputStream  entrarEmpleado = new ObjectInputStream(entrada);
        ingresarEmpleado.lc = (ArrayList) entrarEmpleado.readObject();
        entrada.close();
        
        
        
    }
    
}
