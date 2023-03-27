package Diziler;
import java.util.Arrays;
import java.util.Scanner;

public class odev_01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int liste_len;

        System.out.print("Dizinin boyutu: ");
        liste_len = input.nextInt();
        int[]  sayilar = new int[liste_len];

        System.out.println("Dizinin elemanlarını giriniz: ");
        for (int i = 0; i<liste_len;i++){
            System.out.printf("%d. Elemanı : ",i+1);
            sayilar[i] = input.nextInt();
        }

        Arrays.sort(sayilar);
        System.out.print("Sıralama: ");
        for(int i:sayilar){
            System.out.print(i+" ");
        }
    }
}
