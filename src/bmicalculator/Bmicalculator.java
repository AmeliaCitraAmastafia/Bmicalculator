/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bmicalculator;

import java.util.Scanner;

/**
 *
 * @author 
 */
public class Bmicalculator {
public static void main(String[] args) {
     
     Scanner berat = new Scanner (System.in);
     Scanner tinggi = new Scanner(System.in);
     
     double be;
     double ti;
     double BMI;
     
     System.out.println("Masukkan Berat badan (kg) anda = ");
     be = berat.nextDouble();
     
     System.out.println("Masukkan Tinggi badan (meter) anda = ");
     ti = tinggi.nextDouble();
     
     double bmi = be/(ti*ti);
     System.out.print("Hasil BMI anda adalah "  +  bmi  );
     
     if (bmi < 18.5)
        System.out.println(" Kurus, Lebih banyak makan, atur gizi, dan olahraga yang cukup");
     else if (bmi < 25)
         System.out.println(" Normal, Tetap jaga dan menstabilkan pola makan dan kesehatan");
     else if (bmi < 30)
         System.out.println(" Kegemukan, Jaga pola makan, keseharian, kesehatan");
     else if(bmi >30)
         System.out.println(" Obesitas, Jaga pola makan, kesehatan, diet");
         }
 
 
}

