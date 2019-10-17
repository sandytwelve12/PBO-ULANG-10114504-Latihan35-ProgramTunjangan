/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10114504.latihan35.programtunjangan;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Sandy Akbar
 * KELAS    : PBO-Ulang
 * NIM      : 10114504
 * DESKRIPSI: Program Ini berisi Program tunjangan
 */
public class PBOULANG10114504Latihan35ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        Tunjangan myTunjangan = new Tunjangan();
        
        System.out.println("===PROGRAM TUNJANGAN===");
        System.out.print("Berapa Gaji Pokok Anda sebulan = Rp.");
        int gajiPokok = scan.nextInt();
        System.out.print("Status Anda? (Menikah/Belum)   = ");
        String status = scan.next();
        System.out.println("");
        
        myTunjangan.Tunjangan(gajiPokok, status);
        System.out.println("(Developed by Sandy Akbar)");
    }
    
}
