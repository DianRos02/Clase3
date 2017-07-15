/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;

import java.io.InputStream;

/**
 *
 * @author educacionit
 */
public class UtilidadString {

    public  String GetString(InputStream in) throws Exception{
        String texto = "";
        int car;
        for(; ;){
            car= in.read();
            if (car==-1 || car == 255) return texto;
                texto += (char)car;
        }
    }    
}
