package Donguler;
import java.util.Scanner;

public class pratik_4 {
    public static void main(String[] args){
        //Scanner sınıfını tanımladım.
        Scanner input = new Scanner(System.in);

        //Degiskenleri tanımaldım.
        int n,r,pay = 1,payda = 1,sonuc,i = 1;

        //girdileri aldım.
        System.out.println("C(n,r)");
        System.out.print("n: ");
        n = input.nextInt();
        System.out.print("r: ");
        r = input.nextInt();

        //faktoriyel hesabı yaptım.
        while (i<=n){
            pay *= i;
            i++;
        }
        i = 1;
        while ((i<=(n-r))){
            payda *= i;
            i++;
        }
        i = 1;
        while (i<=r){
            payda *= i;
            i++;
        }
        //kombinasyon hesabını yaptım.
        sonuc = pay/payda;

        System.out.print("Sonuç: "+sonuc);
    }
}
