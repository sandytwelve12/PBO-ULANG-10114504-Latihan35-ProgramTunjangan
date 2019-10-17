/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10114504.latihan35.programtunjangan;

/**
 *
 * @author
 * NAMA     : Sandy Akbar
 * KELAS    : PBO-Ulang
 * NIM      : 10114504
 * DESKRIPSI: Program Ini berisi class Program tunjangan
 */
public class Tunjangan {
    double tunjangan;
    double totalGaji;
    
    public void Tunjangan(double gajiPokok, String Status){
        System.out.println("===Hasil Perhitungan===");
        System.out.println("Berapa Gaji Pokok Anda Perbulan = "+gajiPokok);
        
        //proses
        tunjangan = (Status.equalsIgnoreCase("Menikah")) ? gajiPokok*0.35 : 0;
        
        System.out.println("Tunjangan  : Rp. "+ tunjangan);
        
        totalGaji = tunjangan + gajiPokok;
        System.out.println("Total Gaji : Rp. "+totalGaji);
        
    
}
