package Kosullu_ifadeler_ve_kod_bloklari;
import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;
public class sayilari_kucukten_buyuge_siralama {
    public static void main(String[] args){
        //Scanner sınıfını tanımladım.
        Scanner girdi = new Scanner(System.in);

        //degiskenleri tanımladım.
        int a,b,c;

        // sayıları aldım.
        System.out.print("Birinci sayı:");
        a = girdi.nextInt();

        System.out.print("İkinci sayı:");
        b = girdi.nextInt();

        System.out.print("Üçüncü sayı:");
        c = girdi.nextInt();

        //Sayıları sıralayıp yazdırdım.
        if (a<b && a<c){
            if(b<c){
                System.out.print("a<b<c");
            }else{
                System.out.print("a<c<b");
            }
        } else if (b<c && b<a) {
            if (a<c){
                System.out.print("b<a<c");
            }else {
                System.out.print("b<c<a");
            }
        } else{
            if (a<b){
                System.out.print("c<a<b");
            }else {
                System.out.print("c<b<a");
            }
        }
    }
}
