package Diger_konular;
import java.util.Scanner;
import java.util.Random;

public class pratik_01 {
    public static void main(String[] args){
        Random rand = new Random();
        int sayi = rand.nextInt(100);
        Scanner input = new Scanner(System.in);

        boolean isWin = false;
        int tahmin,tahmin_say =0;

        while (!isWin){
            System.out.print("Tahmininizi giriniz: ");
            tahmin = input.nextInt();
            tahmin_say +=1;

            if(tahmin>sayi){
               System.out.println("Daha küçük bir sayı giriniz.");
            } else if (tahmin<sayi) {
                System.out.println("Daha büyük bir sayı giriniz.");
            } else if (tahmin==sayi) {
                System.out.printf("Toplam %d denemede %d sayısını doğru tahmin ettiniz.",tahmin_say,sayi);
                isWin = true;
            }
        }
    }
}
