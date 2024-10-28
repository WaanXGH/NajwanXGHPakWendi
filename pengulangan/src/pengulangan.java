import java.util.Scanner;


/**
 *
 * @author najwan R
 */
public class pengulangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 System.out.print ("Masukkan angka batas bawah : "); 
 
 int angkaBawah = input.nextInt();
 System.out.print ("Masukkan angka batas atas : "); 
 int angkaAtas = input.nextInt();
 System.out.println ("Bilangan prima antara "+angkaBawah+ " dan " 
+ angkaAtas + " adalah: ");
 System.out.println("----------------------------------------");
 
 int flag = 0;
 for(int i = angkaBawah; i <= angkaAtas; i++)
 {
 for( int j = 2; j < i; j++)
 {
 if(i % j == 0)
{
 flag = 0;
break;
 }
else
{
 flag = 1;
 }
 }
 if(flag == 1)
 {
 System.out.print(i+", ");
 }
 }
 }
        
      
    }
