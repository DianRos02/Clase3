
package serializado;

import java.io.EOFException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ClienteSerializable {
    public static void main(String[] args) throws Exception {
        Socket so = new Socket("192.168.58.24",6000);
        
        try {
            ObjectOutputStream out = new ObjectOutputStream(so.getOutputStream());
            ObjectInputStream in = new ObjectInputStream(so.getInputStream());
            out.writeObject(new Persona("Ezequiel","Anchorena",30));
            System.out.println(in.readObject());
            out.close();
            in.close();
        } catch (EOFException e) {
            System.out.println("e");    
        }

 
        so.close();
        
        
    }//FIN MAIN
}//FIN Clase
