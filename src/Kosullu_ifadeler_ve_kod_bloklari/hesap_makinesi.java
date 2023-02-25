package Kosullu_ifadeler_ve_kod_bloklari;

import java.util.Scanner;
public class hesap_makinesi {
    public static void main(String[] args){
        // Scanner sınıfını tanımladım.
        Scanner girdi = new Scanner(System.in);

        //degiskenleri tanımladım
        int n1,n2,islem;

        System.out.print("1.Sayıyı giriniz:");
        n1 = girdi.nextInt();
        System.out.print("2.Sayıyı giriniz:");
        n2 = girdi.nextInt();

        System.out.print("1.Toplama\n2.Çıkarma\n3.Çarpma\n4.Bölme\n");
        System.out.print("İşleminiz:");
        islem = girdi.nextInt();

        switch (islem){
            case 1:
                System.out.print("Sonuc:"+ (n1+n2));
                break;
            case 2:
                System.out.print("Sonuc:"+ (n1-n2));
                break;
            case 3:
                System.out.print("Sonuc:"+ (n1*n2));
                break;
            case 4:
                switch (n2) {
                    case 0:
                        System.out.print("Sayı sıfıra bölünemez...");
                        break;
                    default:
                        System.out.print("Sonuc:"+ (n1/n2));
                        break;
                }
                break;
            default:
                System.out.print("Hatalı işlem....");
        }

        }
        /* Burada if else blokları kullanılıyor.
        if (islem==1){
            System.out.print("Sonuc:"+ (n1+n2));
        }else if(islem==2){
            System.out.print("Sonuc:"+ (n1-n2));
        }else if (islem==3){
            System.out.print("Sonuc:"+ (n1*n2));
        }else if(islem==4){
            if(n2==0){
                System.out.print("Sıfıra bölme yapılamaz....");
            }else{
                System.out.print("Sonuc:"+ (n1/n2));
            }
        }else{
            System.out.print("Hatalı işlem...");
        } */

}