package Kosullu_ifadeler_ve_kod_bloklari;
import java.util.Scanner;
public class burc_bulan_program {
    public static void main(String[] args){
        //Scanner sınıfını tanımladım.
        Scanner girdi = new Scanner(System.in);

        //Degiskenleri tanımladım.
        int month,day;
        String burc = "";
        boolean isError = false;

        //Ay gün bilgilerini aldım.
        System.out.print("Ay no: ");
        month = girdi.nextInt();
        System.out.print("Gün no:");
        day = girdi.nextInt();

        //burc yada hata durumunu belirledim.
        if (day>=1 && day<=31){
            if(month==1){
                if(day<=21){
                    burc = "oğlak";
                } else if (day>21) {
                    burc = "kova";
                }
            } else if (month == 2) {
                if (day<=19){
                    burc = "kova";
                } else if (day<=29) {
                    burc ="balık";
                }else {
                    isError = true;
                }
            } else if (month==3) {
                if (day<=20){
                    burc = "balık";
                } else if (day<=31) {
                    burc = "koç";
                }
            } else if (month ==4) {
                if (day<=20){
                    burc = "koç";
                } else if (day<=30) {
                    burc = "boğa";
                }else {
                    isError = true;
                }
            } else if (month==5) {
                if (day<=21){
                    burc = "boğa";
                } else if (day<=31) {
                    burc= "ikizler";
                }
            } else if (month==6) {
                if (day <=22){
                    burc = "ikizler";
                } else if (day<=30) {
                    burc = "yengeç";
                }else {
                    isError = true;
                }
            } else if (month==7) {
                if (day<=22){
                    burc = "yengeç";
                } else if (day<=31) {
                    burc = "aslan";
                }
            } else if (month==8) {
                if (day<=22){
                    burc = "aslan";
                } else if (day <=31) {
                    burc = "başak";
                }
            } else if (month == 9) {
                if (day <= 22){
                    burc = "başak";
                } else if (day<=30) {
                    burc = "terazi";
                }else {
                    isError = true;
                }
            } else if (month==10) {
                if(day<=22){
                    burc="terazi";
                } else if (day<=31) {
                    burc = "akrep";
                }
            } else if (month==11) {
                if (day<=23){
                    burc = "akrep";
                } else if (day<=30) {
                    burc="yay";
                }else{
                    isError = true;
                }
            } else if (month == 12) {
                if (day<=21){
                    burc = "yay";
                } else if (day<=31) {
                    burc = "oğlak";
                }
            } else {
                isError = true;
            }
        }else {
            isError = true;
        }

        //hata varsa hata durumunu yoksa sonucu yazdırıyorum.
        if (isError == true){
            System.out.print("Hatalı bilgi girişi....");
        } else {
            System.out.print("Burcunuz: "+burc);
        }
    }
}
