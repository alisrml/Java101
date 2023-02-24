package Temel_kavramlar_degiskenler;
import java.util.Scanner;
public class KDV_tutari_hesaplayan_program {
    public static void main(String[] args) {
        // scanner sınıfını tanımladım
        Scanner input = new Scanner(System.in);

        // degiskenleri tanımladım
        int kdvsiz_fiyat;
        float kdv_orani,kdv_tutari,kdvli_fiyat;

        System.out.print("KDV'siz fiyatı giriniz:");
        kdvsiz_fiyat = input.nextInt();

        kdv_orani = kdvsiz_fiyat>=1000 ? 0.08f : 0.18f;
        kdv_tutari = kdvsiz_fiyat*kdv_orani;
        kdvli_fiyat = kdvsiz_fiyat + kdv_tutari;

        System.out.println("KDV'siz fiyat:"+kdvsiz_fiyat);
        System.out.println("KDV'li fiyat:"+kdvli_fiyat);
        System.out.println("KDV tutarı:"+kdv_tutari);

    }
}