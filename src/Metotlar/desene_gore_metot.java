package Metotlar;
import java.util.Scanner;

public class desene_gore_metot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("N sayısı : ");
        int n = input.nextInt();
        System.out.print("Çıktısı : ");
        desen(n, true, n);

    }

    public static void desen(int number, boolean yon, int temp) {
        System.out.print(number + " ");
        if (number > 0 && yon) {
            desen(number - 5, true, temp);
        } else {
            if (number == temp) {
                return;
            }
            desen(number + 5, false, temp);
        }
    }
}
