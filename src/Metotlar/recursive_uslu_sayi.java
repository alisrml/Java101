package Metotlar;
import java.util.Scanner;

public class recursive_uslu_sayi {

    static int us_alma(int taban,int us){
        if (us>=1){
            return taban*(us_alma(taban,us-1));
        }else {
            return 1;
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Taban değerini giriniz: ");
        int taban = input.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int us = input.nextInt();

        int sonuc = us_alma(taban,us);
        System.out.println("Sonuç: "+sonuc);
    }
}
