package clase3;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClienteMinimo {
    public static void main(String[] args) throws Exception{
        
        
                
        //Socket so=new Socket("192.168.58.24",5555); // aca aclaro a la ip que me quiero conectar
        Socket so=new Socket("192.168.59.129",5555); // aca aclaro a la ip que me quiero conectar
        UtilidadString a = new UtilidadString();
        InputStream in = so.getInputStream();
        System.out.println("Conectado al servidor");
        System.out.println(a.GetString(in));
        OutputStream out = so.getOutputStream();

        out.write("Mensaje Recibido Prueba de mensaje enviado".getBytes());
        out.write(-1);
//        //in.   //Aca voy a recorrer bite a byte para entender el mensaje
//        int car;
//        for(;;){
//            car= in.read();
//            if (car==-1) break;
//            System.out.print((char)car);
//        }
//        System.out.println();
        in.close();
        so.close();
        out.close();
        System.out.println("Desconectado del servidor");
        
    }
    

}
