package Temel_kavramlar_degiskenler;

import java.util.Scanner;

public class daire_diliminin_alani {
    public static void main(String[] args) {
        // Scanner sınıfını tanımladım.
        Scanner girdi = new Scanner(System.in);
        // degiskenleri tanımladım.
        double pi = 3.14,r,aci,alan;
        System.out.print("Yarıçap:");
        r = girdi.nextDouble();
        System.out.print("Açı değeri:");
        aci = girdi.nextDouble();
        alan = pi*r*r*(aci/360);
        System.out.println("Daire diliminin alanı:" + alan);
    }
}
