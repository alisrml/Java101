package Temel_kavramlar_degiskenler;

import java.util.Scanner;

public class manav_kasa_programi {
    public static void main(String[] args){
        //Scanner sınıfını tanımladım.
        Scanner girdi = new Scanner(System.in);
        // degiskenleri tanımladım.
        double armut_f = 2.14,elma_f = 3.67,dom_f = 1.11,muz_f = 0.95,pat_f = 5,toplam;
        int armut,elma,dom,muz,pat;

        System.out.print("Armut kaç kg ? :");
        armut = girdi.nextInt();
        System.out.print("Elma kaç kg ? :");
        elma = girdi.nextInt();
        System.out.print("Domates kaç kg ? :");
        dom = girdi.nextInt();
        System.out.print("Muz kaç kg ? :");
        muz = girdi.nextInt();
        System.out.print("Patlıcan kaç kg ? :");
        pat = girdi.nextInt();

        toplam = armut*armut_f+elma*elma_f+dom*dom_f+muz*muz_f+pat*pat_f;
        System.out.println("Toplam tutar: "+toplam);
    }

}
