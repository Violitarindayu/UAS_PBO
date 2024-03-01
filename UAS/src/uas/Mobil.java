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
public class Mobil extends Kendaraan{
   private String dayaTampung;
   
public Mobil (String nama, String asal, String jenisKendaraan, String dayaTampung){
    super(nama, asal, jenisKendaraan);
    this.dayaTampung = dayaTampung;
}

public void viewMobil(){
    System.out.println("Daya Tampung :"+dayaTampung);
    
}
}
   
  
    
