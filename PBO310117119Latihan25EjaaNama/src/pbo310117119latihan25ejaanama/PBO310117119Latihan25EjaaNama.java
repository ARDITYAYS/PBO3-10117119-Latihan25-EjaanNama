/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo310117119latihan25ejaanama;

import java.util.Scanner;

/**
 *
 * @author Yogaputra
 * Nama : Arditya Yogaputra S 
 * Kelas : IF-3 / PBO-3 
 * Nim : 10117119 
 * Deskripsi : Program ini dapat meng eja nama yang ingin di eja
 */
public class PBO310117119Latihan25EjaaNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama;
        int panjang;
        char huruf;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nama Depan Anda Untuk Di- Eja\t : ");
        nama = scanner.next();
        panjang= nama.length();
        System.out.println("Ejaan untuk"+nama+" adalah");
        
        for (int i = 0; i < panjang; i++) {
            System.out.println("Huruf Ke-"+(i+1)+" : "+nama.charAt(i) );
            
        }
    }
    
}
