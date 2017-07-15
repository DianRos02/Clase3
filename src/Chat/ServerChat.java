package Chat;

import clase3.UtilidadString;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JTextArea;

public class ServerChat implements Runnable{
    JTextArea txa;
        
    
    public ServerChat(JTextArea txa) {
        this.txa = txa;
    }
    
    @Override
    public void run() {
        try {
            ServerSocket ss = new ServerSocket(3333);
            while(true){
                Socket so = ss.accept();
                InputStream in = so.getInputStream();
                
                String rte = so.getInetAddress()+"";
                String mensaje = new UtilidadString().GetString(in);
                txa.append(rte+" -> " + mensaje + "\n");
                in.close();
                so.close();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}    

