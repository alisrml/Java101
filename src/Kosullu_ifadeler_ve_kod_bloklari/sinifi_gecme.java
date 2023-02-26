package Kosullu_ifadeler_ve_kod_bloklari;

import java.util.Scanner;
public class sinifi_gecme {
    public static void main(String[] args){
        // Scanner sınıfını tanımladım.
        Scanner girdi = new Scanner(System.in);

        // degiskenleri olusturdum.
        int mat,fizik,turkce,kimya,muzik,toplam_not = 0,not_say = 0;
        double average;

        // notları alıp toplama ekledim.
        System.out.print("Matematik notunuz:");
        mat = girdi.nextInt();
        if(0<=mat && mat<=100){
            toplam_not += mat;
            not_say += 1;
        }

        System.out.print("Fizik notunuz:");
        fizik = girdi.nextInt();
        if(0<=fizik && fizik<=100){
            toplam_not += fizik;
            not_say += 1;
        }

        System.out.print("Türkçe notunuz:");
        turkce = girdi.nextInt();
        if(0<=turkce && turkce<=100){
            toplam_not += turkce;
            not_say += 1;
        }

        System.out.print("Kimya notunuz:");
        kimya = girdi.nextInt();
        if(0<=kimya && kimya<=100){
            toplam_not += kimya;
            not_say += 1;
        }

        System.out.print("Müzik notunuz:");
        muzik = girdi.nextInt();
        if(0<=muzik && muzik<=100){
            toplam_not += muzik;
            not_say += 1;
        }

        if(toplam_not!=0 && not_say!=0){
            average = toplam_not/not_say;
            if (average>=55){
                System.out.println("Geçtiniz...");
            }else{
                System.out.println("Kaldınız...");
            }
            System.out.print("Ortalamanız: "+average);
        }else{
            System.out.println("Kaldınız...");
        }
    }
}
