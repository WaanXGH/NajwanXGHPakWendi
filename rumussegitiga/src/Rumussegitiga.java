
/**
 *
 * @author najwan R
 */

import java.util.Scanner;

public class Rumussegitiga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean ulang;

        do {
            System.out.print("Masukkan sisi panjang / alas: ");
            double p = input.nextDouble();
            System.out.print("Masukkan Sisi Lebar: ");
            double l = input.nextDouble();
            System.out.print("Masukkan Sisi tinggi: ");
            double t = input.nextDouble(); 

            System.out.println(" ");
            System.out.println("==========================");
            System.out.println("Pilih operasi:");
            System.out.println("1. Menghitung Luas dan Keliling  Segitiga");
            System.out.println("2. Menghitung Luas dan Keliling  Persegi");
            System.out.println("3. Menghitung Luas dan Keliling Lingkaran");
            System.out.println("==========================");
            System.out.println(" ");

            int pilihan = input.nextInt();

            // pemisah antara soal dan jawaban
            System.out.println(" ");

            switch (pilihan) {
                case 1:
                    double luassegitiga = ((p * t) / 2);

                    // Menghitung keliling segitiga
                    double kelilingsegitiga = p + l + t;

                    // Menampilkan hasil
                    System.out.println("Keliling segitiga: " + kelilingsegitiga);
                    System.out.println("Luas segitiga: " + luassegitiga);
                    break;

                case 2:
                    // Menghitung keliling persegi panjang
                    double keliling = (2 * (p + l));

                    // Menghitung luas persegi panjang
                    double luas = p * l;

                    // Menampilkan hasil
                    System.out.println("Keliling persegi panjang: " + keliling);
                    System.out.println("Luas Persegi panjang: " + luas);
                    break;
                    
                case 3:
                    System.out.println(" ");
            System.out.print("Masukkan Diameter Lingkaran: ");
            double d = input.nextDouble();
            double jari = d/2;
            
            double luaslingkaran = (Math.PI * (jari*jari) );
            double kelilinglingkaran = (Math.PI * d );
                
            System.out.println("Keliling Lingkaran adalah: " + kelilinglingkaran);
            System.out.println("Keliling Lingkaran adalah: " + luaslingkaran);
                    
               break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }

            // Tanyakan kepada pengguna apakah ingin mengulang
            System.out.print("Apakah Anda ingin mengulang? (y/t): ");
            String jawaban = input.next();
            System.out.println("");
            ulang = jawaban.equalsIgnoreCase("y");
            
        } while (ulang);

        input.close();
    }
}


        
        
        
             
        
//import java.util.Scanner;
//
//
///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//
///**
// *
// * @author najwan R
// */
////public class rumuspersegi {
////    
////}
//
//public class rumuspersegi{
//    public static void main(String[] args) {        
//        Scanner input = new Scanner(System.in);
//      
//        System.out.print("Masukkan panjang sisi panjang: ");
//        double p = input.nextDouble();
//        
//        System.out.print("Masukkan panjang sisi lebar: ");
//        double l = input.nextDouble();
//        
//        // Menghitung keliling segitiga
//        double keliling = (2*(p+l));
//        
//        // Menghitung luas segitiga menggunakan rumus Heron
//        double luas;
//        luas = (p*l);
//        
//        System.out.println("Keliling persegi panjang: " + keliling);
//        System.out.println("Luas Persegi panjang: " + luas);
//        
//        input.close();
//    }
//}
//




        // rumus segitiga
//        Scanner input = new Scanner(System.in);
//      
//        System.out.print("Masukkan panjang sisi panjang alas: ");
//        double a = input.nextDouble();
//        
//        System.out.print("Masukkan panjang sisi lebar: ");
//        double l = input.nextDouble();
//        
//        System.out.print("Masukkan panjang sisi tinggi: ");
//        double t = input.nextDouble();
//        
//        // Menghitung keliling segitiga
//        double keliling = a + l + t;
//        
//        // Menghitung luas segitiga menggunakan rumus Heron
//        double luas;
//        luas = ((a * t) /2);
//        
//        System.out.println("Keliling segitiga: " + keliling);
//        System.out.println("Luas segitiga: " + luas);
//        
//        input.close();
//    }
//}

