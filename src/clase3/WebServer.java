/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author educacionit
 */
public class WebServer {
    public static void main(String[] args) throws Exception{
        String html = "<h1>Servidor de Ezequiel</h1>"; //normalemente esta en un html y el servidor lo lee
        String resp ="HTTP/1.0\n"
                +"Content-Type: text/html\n"
                +"Content-Length: "+ html.length()+"\n\n"
                +html; 
        ServerSocket ss = new ServerSocket(8000); //Ojo a que puertovoy a acceder
        
        while(true){
            System.out.println("Esperando Cliente");
            Socket so = ss.accept();
            OutputStream out = so.getOutputStream();
            out.write(resp.getBytes());
            out.close();
            so.close();
        }
    }//Fin clase MAIN
}//FIN clase WebServer
