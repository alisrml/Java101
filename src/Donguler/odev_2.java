package Donguler;
import java.util.Scanner;

public class odev_2 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        int sayi,sonuc = 0;

        System.out.print("Bir sayı giriniz:" );
        sayi = input.nextInt();

        for(int i = 1;i<sayi;i++){
            if(sayi%i==0){
                sonuc += i;
            }
        }

        if (sayi == sonuc){
            System.out.print(sayi+" sayısı bir mükemmel sayıdır.");
        }else {
            System.out.print(sayi+" sayısı mükemmel bir sayı değildir.");
        }
    }
}
