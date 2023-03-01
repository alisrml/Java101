package Donguler;
import java.util.Scanner;

public class pratik_8 {
    public static void main(String[] args){
        //Scanner sınıfını tanımladım.
        Scanner input = new Scanner(System.in);

        //Degiskenleri tanımlayıp input aldım.
        int n;
        System.out.print("Bir sayı giriniz:");
        n = input.nextInt();

        //Şekli çizdiriyorum.
        //Bu döngü n satır sayısı kadar dönecek.
        for (int i =1;i<=n;i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = n-1;i>=0;i--) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
