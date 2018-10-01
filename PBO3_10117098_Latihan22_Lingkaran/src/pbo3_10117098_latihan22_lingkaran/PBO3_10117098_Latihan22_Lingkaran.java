/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117098_latihan22_lingkaran;
import java.util.Scanner;
/**
 *
 * @author 
 * Nama     : Santi Susanti
 * KELAS    : PBO3
 * NIM      : 10117098
 * Deskripsi Program : Program ini berisi program untuk menghitung jari-jari,
 *                     luas, dan keliling lingkaran
 */
public class PBO3_10117098_Latihan22_Lingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String d; 
        double diameter; 
        double r; //jari-jari
        double L; //luas
        double K; //keliling
        Scanner scn = new Scanner(System.in);
        
        System.out.println("====== Perhitungan Lingkaran ======");
        
        do {            
            System.out.print("Masukkan nilai diameter lingkaran : ");
            d = scn.nextLine();

            System.out.println((!d.matches("[0-9]*"))
                    ?"Nilai Diameter Tidak Sesuai\n":"");

        } while (!d.matches("[0-9]*"));
        
        System.out.println("\n======Hasil Perhitungan Lingkaran======");
        diameter = Double.parseDouble(d); 
        r = diameter/2;
        System.out.printf("Jari-jari Lingkaran = %.0f cm %n",r);
        L = Math.PI*r*r;
        System.out.printf("Luas Lingkaran = %.2f cm %n",L);
        K = 2*Math.PI*r;
        System.out.printf("Keliling Lingkaran = %.2f cm %n",K);
    }
    
}
