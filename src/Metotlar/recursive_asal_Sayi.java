package Metotlar;
import java.util.Scanner;
public class recursive_asal_Sayi {
    static boolean asal_mi(int sayi,int bolen){
        if (sayi<2){
            return false;
        } else if (bolen == 1) {
            return true;
        }else {
            if (sayi%bolen == 0){
                return false;
            }else {
                return asal_mi(sayi,bolen-1);
            }
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int sayi = input.nextInt();

        if (asal_mi(sayi,sayi-1)){
            System.out.print(sayi+" sayısı bir asal sayıdır.");
        }else {
            System.out.print(sayi +" sayisi bir asal sayı değildir.");
        }

    }
}
