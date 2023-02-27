package Donguler;
import java.util.Scanner;
public class uc_ve_dort_tam_bolunenler_ortalamasi {
    public static void main(String[] args){
        //Scanner sınıfı tanımladım.
        Scanner input = new Scanner(System.in);

        //Degisken tanımladım.
        int sayi,sayi_adedi = 0,toplam = 0;
        double ortalama;

        //girdileri aldım.
        System.out.print("Sayı giriniz:");
        sayi = input.nextInt();

        for(int i=1; i<=sayi;i++){
            if (i%3==0 && i%4==0){
                toplam += i;
                sayi_adedi += 1;
            }
        }
        if (toplam==0){
            System.out.print(sayi+" Sayısına kadar olan sayılardan 3 ve 4'e tam bölünenlerin ortalaması: 0");
        }else {
            ortalama = toplam/sayi_adedi;
            System.out.print(sayi+" Sayısına kadar olan sayılardan 3 ve 4'e tam bölünenlerin ortalaması: "+ortalama);
        }
    }
}
