package Temel_kavramlar_degiskenler;
import java.util.Scanner;

public class ucgen_alan_hesaplama {
    public static void main(String[] args){
        // Scanner sınıfını tanımladım.
        Scanner girdi = new Scanner(System.in);
        //degiskenleri tanıladım.
        int a,b,c;
        double u,alan;
        //Kenar uzunluklarını aldım.
        System.out.print("1.kenar uzunluğu:");
        a = girdi.nextInt();
        System.out.print("2.kenar uzunluğu:");
        b = girdi.nextInt();
        System.out.print("3.kenar uzunluğu:");
        c = girdi.nextInt();

        u = (a+b+c)/2.0;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.print("Üçgenin alanı: "+ alan);
    }
}