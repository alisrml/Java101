package Donguler;
import java.util.Scanner;
public class pratik_3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sayi,a = 4,b = 5;
        System.out.print("Sayı giriniz: ");
        sayi = input.nextInt();

        while (a<sayi || b<sayi){
            if (a<sayi){
                System.out.println(a);
            }
            if (b<sayi){
                System.out.println(b);
            }
            a *= 4;
            b *= 5;
        }
    }
}
