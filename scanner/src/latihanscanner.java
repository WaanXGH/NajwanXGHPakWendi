
import java.util.Scanner;

public class latihanscanner {
 public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    
    
    System.out.print("Input Nama: ");
    String nama = input.nextLine();
    
     System.out.print("Masukkan Jurusan Anda: ");
     String jurusan =  input.nextLine();
     
     System.out.print("Masukkan Alamat tinggal anda : ");
     String asal = input.nextLine();
     
     System.out.print("Masukkan Sekolah anda : ");
     String sekolah = input.nextLine();
     
     System.out.print("Masukkan Nomor Telepon  anda : ");
     String telp = input.nextLine();
     
     // output
     
     System.out.println(" ");
     System.out.print("Halo..."); 
     System.out.println("Nama saya " +nama);
     System.out.println("Saya sekolah di " +sekolah);
     System.out.println("jurusan saya " +jurusan);
     System.out.println("saya tinggal di " +asal);
     System.out.println("Nomor telepon saya " +telp);
     System.out.println(" ");
     System.out.println("Salam Kenal ya :)");
    
      
    
    
    }
}

  