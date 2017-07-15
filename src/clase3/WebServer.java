/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;

import java.net.ServerSocket;

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
        ServerSocket so = new ServerSocket(80); //Ojo a que puertovoy a acceder
        
        while(true){
            System.out.println("Esperando Cliente");
        }
    }//Fin clase MAIN
}//FIN clase WebServer
