package Donguler;
import java.util.Scanner;

public class pratik_7 {
    public static void main(String[] args){
        //Scanner sınıfını tanımladım.
        Scanner input = new Scanner(System.in);

        //Degiskenleri tanımladım.
        int sayi;
        double sonuc = 0;

        //Girdileri aldım.
        System.out.print("Sayı giriniz:");
        sayi = input.nextInt();

        //hesaplama yaptım.
        for (double i = 1; i<=sayi;i++){
            sonuc += (1/i);
        }

        //Sonucu yazdırdım.
        System.out.print("Sonuç: "+sonuc);
    }
}
