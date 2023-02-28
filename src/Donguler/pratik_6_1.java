package Donguler;
import java.util.Scanner;
public class pratik_6_1 {
    public static void main(String[] args){
        //Scanner sınıfını tanımladım.
        Scanner input = new Scanner(System.in);

        //Degiskenleri tanımladım.
        int sayi,tempNum,basmak,sonuc = 0;

        //Sayi girdisini aldım.
        System.out.print("Sayı giriniz: ");
        sayi = input.nextInt();

        //basamak toplamı hesabını burda yapıyorum.
        tempNum = sayi;
        while (tempNum!= 0){
            basmak = tempNum%10;
            sonuc += basmak;
            tempNum /=10;
        }

        //Sonucu yazdırdım.
        System.out.print(sayi+"sayısının basamakları toplamı: "+sonuc);
    }
}
