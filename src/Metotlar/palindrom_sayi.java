package Metotlar;
import java.util.Scanner;
public class palindrom_sayi {
    static boolean isPalindrom(int sayi){
        int temp = sayi,reverse = 0;

        while (temp!=0){
            int lastNum = temp%10;
            reverse = reverse*10 + lastNum;
            temp /= 10;
        }
        if (sayi == reverse){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi = input.nextInt();

        if(isPalindrom(sayi)){
            System.out.print(sayi+" sayısı bir palindrom sayıdır.");
        }else {
            System.out.print(sayi+" sayısı bir palindrom sayı değildir.");
        }
    }
}
