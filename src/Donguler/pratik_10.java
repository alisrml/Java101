package Donguler;
import java.util.Scanner;

public class pratik_10 {
    public static void main(String[] args){
        //Scanner sınıfını tanımladım.
        Scanner input = new Scanner(System.in);

        //Degiskenleri tanımladım.
        int ekok = 1,ebob = 1,n1,n2,i,a;

        //Girdileri aldım.
        System.out.print("Birinci sayı: ");
        n1 = input.nextInt();
        System.out.print("İkinci sayı: ");
        n2 = input.nextInt();

        i = n1;
        while (i>0){
            if (n1%i==0 && n2%i==0){
                ebob = i;
                break;
            }
            i --;
        }

        a = 1;
        while (a<=n1*n2){
            if(a%n1==0 && a%n2==0){
                ekok = a;
                break;
            }
            a ++;
        }

        System.out.println("Ebob: "+ebob);
        System.out.println("Ekok: "+ekok);
    }
}
