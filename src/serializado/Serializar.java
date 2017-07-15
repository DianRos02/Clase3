
package serializado;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serializar {
    public static void main(String[] args) throws Exception{
        String file = "persona.dat";
        
        ObjectOutputStream out =  new ObjectOutputStream(new FileOutputStream(file));
        out.writeObject(new Persona("Lucas","Gonales",25));
        out.writeObject(new Persona("Lucas2","Gonzales1",26));
        out.writeObject(new Persona("Lucas3","Gonzales2",27));
        out.close();
        
    }
}
