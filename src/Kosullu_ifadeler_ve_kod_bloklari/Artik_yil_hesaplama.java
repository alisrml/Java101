package Kosullu_ifadeler_ve_kod_bloklari;
import java.util.Scanner;
public class Artik_yil_hesaplama {
    public static void main(String[] args){
        //Scanner sınıfını tanımladım.
        Scanner input = new Scanner(System.in);

        //Degiskenleri tanimladım.
        int year;
        boolean artik_mi = false;

        //yıl bilgisini input aldım.
        System.out.print("Yıl giriniz: ");
        year = input.nextInt();

        // artık yl hesaplamasını burada yapıyorum.
        if(year%4==0){
            if (year%100==0){
                if (year%400==0){
                    artik_mi = true;
                }
            }else {
                artik_mi = true;
            }
        }

        //Sonucu yazdırıyorum.
        if (artik_mi){
            System.out.print(year+ " yılı artık bir yıldır.");
        }else {
            System.out.print(year+ " yılı artık bir yıl değildir.");
        }
    }
}
