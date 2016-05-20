/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.ArrayList;

/**
 *
 * @author turupawn
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String>fortuna=new ArrayList();
        fortuna.add("Hoy te va a caer un piano encima");
        fortuna.add("Hoy te van a asaltar");
        fortuna.add("Hoy te ganas la loto, pero perdes el boleto");
        int random = (int)(Math.random()*100)%fortuna.size();
        System.out.println(fortuna.get(random));
    }
    
}
