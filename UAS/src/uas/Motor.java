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
public class Motor extends Kendaraan{
  private int tahunProduksi;
   
public Motor (String nama, String asal, String jenisKendaraan, int tahunProduksi){
    super(nama, asal, jenisKendaraan);
    this.tahunProduksi = tahunProduksi;
}

public void viewMotor(){
    System.out.println(" Tahun Produksi :"+tahunProduksi);
    
}
}
    

