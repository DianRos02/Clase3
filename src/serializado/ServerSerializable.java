
package serializado;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSerializable {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(6000);
        
        System.out.println("Esperando Cliente");
        Socket so = ss.accept(); //para poder aceptar las conexiones 
        
        //Streaming para objetos
        
        ObjectOutputStream out = new ObjectOutputStream(so.getOutputStream());
        ObjectInputStream in = new ObjectInputStream(so.getInputStream());
        
        while(true){
            System.out.println(in.readObject());
            out.writeObject("Objeto Recibido");
            out.close();
            so.close();
        }
                
        
        
    }
}
