
package serializado;

import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSerializable {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(6000);
        
        System.out.println("Esperando Cliente");
        
        
        //Streaming para objetos

        
        while(true){
        Socket so = ss.accept(); //para poder aceptar las conexiones 
        ObjectOutputStream out = new ObjectOutputStream(so.getOutputStream()); // Salida de datos
        ObjectInputStream in = new ObjectInputStream(so.getInputStream());    // entrada/lectura de datos
            try {
                System.out.println(in.readObject());                // lectura del dato con el ObjectInputStream
                out.writeObject("Objeto Recibido");                
            } catch (InvalidClassException e) {
                System.out.println(e);
            }

            out.close();
            so.close();
        }
                
        
        
    }
}
