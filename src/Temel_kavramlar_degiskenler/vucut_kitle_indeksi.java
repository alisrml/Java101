package Temel_kavramlar_degiskenler;
import java.util.Scanner;
public class vucut_kitle_indeksi {
    public static void main(String[] args){
        //Scanner sınıfını tanımladım.
        Scanner girdi = new Scanner(System.in);
        // degiskenleri tanımladım
        double boy,kilo,bki;
        System.out.print("Boyunuzu metre cinsinden giriniz:");
        boy = girdi.nextDouble();
        System.out.print("Kilonuzu giriniz:");
        kilo = girdi.nextDouble();
        bki = kilo/(boy*boy);

        System.out.print("Beden kitle indeksiniz:" + bki);
    }
}
