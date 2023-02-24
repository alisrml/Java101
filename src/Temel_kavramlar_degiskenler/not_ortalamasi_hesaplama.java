package Temel_kavramlar_degiskenler;

import java.util.Scanner;
public class not_ortalamasi_hesaplama {
    public static void main(String[] args){
        // Değişkenleri oluşturalım
        int mat,fizik,kimya,turkce,tarih,muzik;

        //scanner sınıfımızı tanımlayalım
        Scanner input = new Scanner(System.in);

        //Notlarımızı alalım
        System.out.print("Matematik notunuzu giriniz:");
        mat = input.nextInt();

        System.out.print("Fizik notunuzu giriniz:");
        fizik = input.nextInt();

        System.out.print("Kimya notunuzu giriniz:");
        kimya = input.nextInt();

        System.out.print("Türkçe notunuzu giriniz:");
        turkce = input.nextInt();

        System.out.print("Tarih notunuzu giriniz:");
        tarih = input.nextInt();

        System.out.print("Müzik notunuzu giriniz:");
        muzik = input.nextInt();

        double ortalama = (mat+fizik+kimya+turkce+tarih+muzik)/6.0;
        System.out.print("Genel ortalamanız:"+ ortalama +"\n");
        String durum = ortalama>=60 ? "Geçtiniz" : "Kaldınız";
        System.out.print(durum);


    }
}