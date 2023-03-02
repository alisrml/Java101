package Donguler;
import java.util.Scanner;
public class odev_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n,max,min,sayi;
        System.out.print("Kaç sayı gireceksiniz: ");
        n = input.nextInt();
        System.out.print("Sayı giriniz: ");
        sayi = input.nextInt();
        max = sayi;
        min = sayi;

        for(int i =2;i<=n;i++){
            System.out.print("Sayı giriniz: ");
            sayi = input.nextInt();
            if (sayi > max){
                max = sayi;
            }
            if (sayi<min){
                min = sayi;
            }
        }
        System.out.println("En büyük sayı: "+max);
        System.out.println("En küçük sayı: "+min);
    }
}
