
package Principal;

import java.io.*;
import java.util.ArrayList;


public class archivoUsuario implements Serializable {
    
    
    public static ArrayList al = new ArrayList();
    
    
    public void grabar() throws FileNotFoundException, IOException, ClassNotFoundException{
        
        
       
        FileOutputStream salida = new FileOutputStream("F:/usuario.txt");
         ObjectOutputStream guardarUsuario = new ObjectOutputStream(salida);
         guardarUsuario.writeObject(al);
         salida.close();
    }
    
    public  void recuperar() throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream   entrada = new FileInputStream("F:/usuario.txt");
        ObjectInputStream  entrarUsuario = new ObjectInputStream(entrada);
        al = (ArrayList) entrarUsuario.readObject();
        entrada.close();
        
        
        
    }
    
    
    
    
}
