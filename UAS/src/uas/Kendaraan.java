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
public class Kendaraan {
     private String nama;
    private String asal ;
    private String jenisKendaraan;
    
public Kendaraan (String nama, String asal, String jenisKendaraan){
    this.nama= nama;
    this.asal = asal;
    this.jenisKendaraan= jenisKendaraan;
}

public void viewKendaraan(){
    System.out.println("Nama: " +nama);
     System.out.println("Asal : " +asal);
      System.out.println("Jenis Kendaraan: " +jenisKendaraan);
      
}   
}
    
