package Temel_kavramlar_degiskenler;
import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args){
        // Scanner sınıfımı tanımladım.
        Scanner girdi = new Scanner(System.in);
        // Değişkenleri tanımladım.
        double km_fiyat = 2.20,acilis = 10.0, min_tutar = 20.0,toplam_tutar;
        int gidilen_mesafe;

        System.out.print("Gidilen mesafe: ");
        gidilen_mesafe = girdi.nextInt();
        toplam_tutar = (gidilen_mesafe*km_fiyat+acilis)<min_tutar ? min_tutar : gidilen_mesafe*km_fiyat+acilis;
        System.out.println("Toplam tutar: "+toplam_tutar);

    }
}
