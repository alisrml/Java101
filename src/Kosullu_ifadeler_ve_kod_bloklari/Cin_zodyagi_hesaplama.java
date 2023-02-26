package Kosullu_ifadeler_ve_kod_bloklari;
import java.util.Scanner;
public class Cin_zodyagi_hesaplama {
    public static void main(String[] args){
        //Scanner sınıfını tanımladım.
        Scanner input = new Scanner(System.in);

        //Degiskenleri tanımladım.
        int dogum_yili,burc_no;
        String cin_zodyagi = "";

        //inputları aldım.
        System.out.print("Doğum yılınız: ");
        dogum_yili = input.nextInt();

        //burada çin zodyağı burcunu hesapladım.
        burc_no = dogum_yili%12;
        switch (burc_no){
            case 0:
                cin_zodyagi = "maymun";
                break;
            case 1:
                cin_zodyagi = "horoz";
                break;
            case 2:
                cin_zodyagi = "köpek";
                break;
            case 3:
                cin_zodyagi = "domuz";
                break;
            case 4:
                cin_zodyagi = "fare";
                break;
            case 5:
                cin_zodyagi = "öküz";
                break;
            case 6:
                cin_zodyagi = "kaplan";
                break;
            case 7:
                cin_zodyagi = "tavşan";
                break;
            case 8:
                cin_zodyagi = "ejderha";
                break;
            case 9:
                cin_zodyagi = "yılan";
                break;
            case 10:
                cin_zodyagi = "at";
                break;
            case 11:
                cin_zodyagi = "koyun";
                break;
        }
        //burada sonucu yazdırdım.
        if (cin_zodyagi.equals("")){
            System.out.print("Bir hata olustu....");
        } else {
            System.out.print("Çin zodyağı burcunuz: "+ cin_zodyagi);
        }
    }
}
