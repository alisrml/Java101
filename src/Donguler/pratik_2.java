package Donguler;
import java.util.Scanner;
public class pratik_2 {
    public static void main(String[] args){
        //Scanner sınıfını tanımladım.
        Scanner input = new Scanner(System.in);

        //Degiskenleri tanımladım.
        int sayi,toplam = 0,toplam_sayi = 0;

        do{
            System.out.print("Sayı giriniz:");
            sayi = input.nextInt();
            if (sayi%4==0){
                toplam += sayi;
                toplam_sayi += 1;
            }
        }while (sayi%2!=1);

        System.out.print("Toplam: "+toplam);
    }
}
