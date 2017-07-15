
package serializado;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializar {
    public static void main(String[] args) throws Exception{
        String file = "persona.dat";
        
        ObjectOutputStream out =  new ObjectOutputStream(new FileOutputStream(file));
        out.writeObject(new Persona("Lucas","Gonales",25));
        out.writeObject(new Persona("Lucas2","Gonzales1",26));
        out.writeObject(new Persona("Lucas3","Gonzales2",27));
        out.close();
        
        
        
        // DesSerializado
        
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
            try{
                while(true){
                    System.out.println(in.readObject());
                }
                }catch(EOFException e){
                        
                System.out.println("Final del archivo");
                }    
    }
}//End Main

