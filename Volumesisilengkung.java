/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week.pkg11;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Volumesisilengkung {
    public static void main(String[] args) {
        int pilihan = 3;
        do {            
            System.out.println("Perhitungan Volume Bangun Ruang Sisi Lengkung"); 
            System.out.println("1. Tabung");
            System.out.println("2. Bola");
            System.out.println("3. Kerucut");
            System.out.println("tekan '0' untuk berhenti!");
            System.out.println("Masukkan Pilihan Bangun Ruang Anda: ");
            Scanner masukkan = new Scanner(System.in);
            pilihan = masukkan.nextInt();
   
            switch(pilihan){
                case 1 : tabung();
                    break;
                case 2 : bola();
                    break;
                case 3 : kerucut();
                    break;
            }
        } while (pilihan !=0);
    }
private static void tabung() {
        Scanner masukkan = new Scanner(System.in);
        float v,r,t;
        double phi = 3.14;
        System.out.println("Anda Memilih Tabung");
        System.out.print("Masukkan jari-jari tabung: ");
        r = masukkan.nextFloat();
        System.out.print("Masukkan tinggi tabung: ");
        t = masukkan.nextFloat();
        r = r*r;
        v = (float) (phi*r*t);
        System.out.println("Volume Tabung : "+v);
}

    private static void bola() {
      Scanner masukkan = new Scanner(System.in);
        float v,r;
        double phi = 3.14;
        double a = 4/3.0;
        System.out.println("Anda Memilih Bola");
        System.out.print("Masukkan jari-jari Bola: ");
        r = masukkan.nextFloat();
        r = r*r*r;
        v = (float) (a*phi*r);
        System.out.println("Volume Bola : "+v);  
    }

    private static void kerucut() {
        Scanner masukkan = new Scanner(System.in);
        float v,r,t;
        double phi = 3.14;
        double b = 1/3.0;
        System.out.println("Anda Memilih Kerucut");
        System.out.print("Masukkan jari-jari Kerucut: ");
        r = masukkan.nextFloat();
        System.out.print("Masukkan tinggi Kerucut: ");
        t = masukkan.nextFloat();
        r = r*r;
        v = (float) (b*phi*r*t);
        System.out.println("Volume Kerucut : "+v);
    }
}
