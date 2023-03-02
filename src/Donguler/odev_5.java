package Donguler;
import java.util.Scanner;

public class odev_5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n,n1 =0,n2 = 1,temp;

        System.out.print("Eleman sayısını giriniz: ");
        n = input.nextInt();

        for (int i = 1;i<=n;i++){
            temp = n1 + n2;
            System.out.println(n1+" + "+n2+" = "+temp);
            n1 = n2;
            n2 = temp;
        }
    }
}
