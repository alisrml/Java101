package Temel_kavramlar_degiskenler;
import java.util.Scanner;
public class hipotenus_hesaplama_programi {
    public static void main(String[] args) {
        // scanner sınıfını tanımladım.
        Scanner input = new Scanner(System.in);

        //degiskenleri tanımladım.
        double kenar1,kenar2,hipotenus;

        System.out.print("1. dik kenar uzunluğunu giriniz:");
        kenar1 = input.nextDouble();
        System.out.print("2. dik kenar uzunluğunu giriniz:");
        kenar2 = input.nextDouble();
        hipotenus = Math.sqrt(kenar1*kenar1 + kenar2*kenar2);
        System.out.print("Kenarları "+kenar1+" ve "+ kenar2 +" olan dik üçgenin hipotenüsü "+hipotenus+".");
    }

}