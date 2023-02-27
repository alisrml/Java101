package Donguler;
import java.util.Scanner;

public class pratik_5 {
    public static void main(String[] args){
        // scanner sınıfını tanımladım.
        Scanner input = new Scanner(System.in);

        //degiskenleri tanımladım.
        int taban,us,sonuc = 1;

        //girdileri aldım.
        System.out.print("Üssü alınacak sayı: ");
        taban = input.nextInt();
        System.out.print("Üs değerini giriniz: ");
        us = input.nextInt();

        //sonucu hesapladım.
        for (int i =1; i<=us;i++){
            sonuc *= taban;
        }

        //sonucu yazdırdım.
        System.out.print("Sonuç: "+sonuc);
    }
}
