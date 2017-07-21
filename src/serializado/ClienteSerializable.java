
package serializado;
/*
con esta pantalla me conecto al servidor serializable, siempre que lo tenga corriendo 
*/
import java.io.EOFException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ClienteSerializable {
    public static void main(String[] args) throws Exception {
        Socket so = new Socket("192.168.58.24",6000);   //Aca eligo donde me voy a conectar
        // la ip donde me conecto va entre comillas y el puerto es el que elegimos en el server
        
        
        try {
            ObjectOutputStream out = new ObjectOutputStream(so.getOutputStream());
            ObjectInputStream in = new ObjectInputStream(so.getInputStream());
            out.writeObject(new Persona("Diana","Portillo",30));
            System.out.println(in.readObject());
            out.close();
            in.close();
        } catch (EOFException e) {
            System.out.println(e);    
        }

 
        so.close();
        
        
    }//FIN MAIN
}//FIN Clase
