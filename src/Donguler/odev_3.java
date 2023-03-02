package Donguler;
import java.util.Scanner;

public class odev_3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int basamak;
        System.out.print("Bir sayı giriniz:");
        basamak = input.nextInt();

        for(int i=0;i<=10;i++){
            for(int a =0;a<i;a++){
                System.out.print(" ");
            }
            for(int n=1;n<2*basamak-2*i;n++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
