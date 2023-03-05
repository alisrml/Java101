package Metotlar;
import java.util.Scanner;

public class fibonacci {
    static int fibonacci(int n){
        if (n<=2){
            return 1;
        }else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        int sonuc = fibonacci(sayi);

        System.out.print("Fibonacci dizisinin "+sayi+".elemanının değeri: "+sonuc);

    }
}
