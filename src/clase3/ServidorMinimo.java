package clase3;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorMinimo {
    public static void main(String[] args) throws Exception{
        String mensaje="Servidor de Diana";
        ServerSocket sc=new ServerSocket(5555);
        while(true){
            System.out.println("Esperando conexión de un cliente:");
            Socket so=sc.accept();
            
            System.out.println("Se conecto "+so.getInetAddress());
            OutputStream out=so.getOutputStream();
            
            InputStream in = so.getInputStream();   //con esto escucho a mi cliente
            out.write(mensaje.getBytes());
            out.write(-1);
            UtilidadString str = new UtilidadString();
            System.out.println(str.GetString(in));
            out.close();
            so.close();
            in.close();
            System.out.println("Cliente desconectado.");
        }
    }           
}
