package Kosullu_ifadeler_ve_kod_bloklari;

import java.util.Scanner;

public class havaya_gote_etk_onerisi {
    public static void main(String[] args){
        //Scanner sınıfını oluşturdum.
        Scanner girdi = new Scanner(System.in);

        //Degiskenleri olusturdum.
        int heat;

        System.out.print("Hava sıcaklığı?: ");
        heat = girdi.nextInt();

        if (heat<5){
           System.out.print("Kayak Yapabilirsiniz...");
        } else if (heat <= 25) {
            if (heat<=15){
                System.out.println("Sinemaya gidebilirsiniz...");
            }
            if (heat>=10){
                System.out.println("Pikniğe gidebilirsiniz...");
            }
        } else {
            System.out.println("Yüzmeye gidebilirsiniz...");
        }

    }
}
