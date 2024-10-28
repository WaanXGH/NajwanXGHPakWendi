import java.util.Scanner;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author najwan R
 */
//public class rumuspersegi {
//    
//}

public class rumuspersegi{
    public static void main(String[] args) {        
        Scanner input = new Scanner(System.in);
      
        System.out.print("Masukkan panjang sisi panjang: ");
        double p = input.nextDouble();
        
        System.out.print("Masukkan panjang sisi lebar: ");
        double l = input.nextDouble();
        
        // Menghitung keliling segitiga
        double keliling = (2*(p+l));
        
        // Menghitung luas segitiga menggunakan rumus Heron
        double luas;
        luas = (p*l);
        
        System.out.println("Keliling persegi panjang: " + keliling);
        System.out.println("Luas Persegi panjang: " + luas);
        
        input.close();
    }
}

