package Diziler;

import java.util.Scanner;

public class pratik_02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int [] liste = {15,12,788,1,-1,-778,2,0};
        int sayi,buyuk = liste[0],kucuk = liste[0];

        System.out.print("Lütfen bir sayı giriniz:");
        sayi = input.nextInt();

        for (int i = 0; i<liste.length;i++){
            if(liste[i]>sayi && liste[i]<buyuk){
                buyuk = liste[i];
            }
            if(liste[i]<sayi && liste[i]>kucuk){
                kucuk = liste[i];
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı :"+kucuk);
        System.out.println("Girilen sayıdan büyük en yakın sayı :"+buyuk);
    }
}
