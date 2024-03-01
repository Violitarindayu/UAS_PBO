/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

/**
 *
 * @author User
 */
public class UAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Motor Motor  = new Motor("RxKIng","Jepang","Roda 2",1983);
    Mobil Mobil = new Mobil("Inova","Indonesia","Roda 4","12 0rang");
    
    Motor.viewKendaraan();
    Motor.viewMotor();
    
    Mobil.viewKendaraan();
    Mobil.viewMobil();
    
    
    }
}    
    
    
}
