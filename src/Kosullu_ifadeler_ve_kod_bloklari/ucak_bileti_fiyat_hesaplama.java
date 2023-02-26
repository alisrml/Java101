package Kosullu_ifadeler_ve_kod_bloklari;
import java.util.Scanner;

public class ucak_bileti_fiyat_hesaplama {
    public static void main(String[] args){
        //Scanner sınıfını tanımladım.
        Scanner input = new Scanner(System.in);

        //Degisken tanımlama.
        int mesafe,yas,yolculuk_tipi;
        Double normal_tutar,yas_indirimi,indirimli_tutar,gidis_donus_indirimi = 0.0,toplam_tutar;

        //kullanıcıdan girdileri aldım.
        System.out.print("Mesafeyi km türünden giriniz: ");
        mesafe = input.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextInt();
        System.out.print("Yolculuk tipini giriniz(1 tek yön,2 gidiş dönüş).");
        yolculuk_tipi = input.nextInt();

        //hatalı girdi kontrolü yaptım.
        if(mesafe<=0 || yas<=0 || (yolculuk_tipi<1 || yolculuk_tipi>2)){
            System.out.print("Hatalı veri girdiniz....");
        }else {
            normal_tutar = mesafe*0.1;
            //yas indirimi hesapladım.
            if (yas<12){
                yas_indirimi = normal_tutar*0.5;
            } else if (yas<=24) {
                yas_indirimi = normal_tutar*0.1;
            } else if (yas>65) {
                yas_indirimi = normal_tutar*0.3;
            }else {
                yas_indirimi = 0.0;
            }
            indirimli_tutar = normal_tutar-yas_indirimi;

            //gidis donus indirimini hesapladım.
            if (yolculuk_tipi ==2){
                gidis_donus_indirimi = indirimli_tutar*0.2;
                indirimli_tutar -= gidis_donus_indirimi;
            }

            toplam_tutar = indirimli_tutar;
            System.out.print("Toplam tutar: "+ toplam_tutar);
        }
    }
}
