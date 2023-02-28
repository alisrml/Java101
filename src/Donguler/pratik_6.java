package Donguler;
import java.util.Scanner;
public class pratik_6 {
    public static void main(String[] args){
        //Scanner sınıfını tanımladım.
        Scanner input = new Scanner(System.in);

        //Degiskenleri tanımladım.
        int sayi,tempNum,bas_say = 0,sonuc = 0,bas_deg,bas_kuv = 1;

        //Sayı girdisini aldım.
        System.out.print("Sayı giriniz: ");
        sayi = input.nextInt();

        //basamak sayısını hesapladım.
        tempNum = sayi;
        while (tempNum != 0){
            tempNum = tempNum/10;
            bas_say ++;
        }

        //basamakların kuvvetini alıp sonuca ekledim.
        tempNum = sayi;
        while (tempNum !=0){
            bas_deg = tempNum%10;
            bas_kuv = 1;
            for(int i = 1;i<=bas_say;i++){
                bas_kuv *= bas_deg;
            }
            sonuc += bas_kuv;
            tempNum /= 10;
        }

        //Sonucu kontrol edip yazdırıyorum.
        if (sonuc == sayi){
            System.out.println(sayi + " sayısı bir Armstrong sayıdır.");
        }else{
            System.out.println(sayi + " sayısı bir Armstrong sayısı değildir.");
        }
    }
}
