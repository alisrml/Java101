package Kosullu_ifadeler_ve_kod_bloklari;
import java.util.Scanner;
public class User_login {
    public static void main(String[] args){
        //Scanner sınıfnı tanımladım.
        Scanner girdi = new Scanner(System.in);

        //degiskenleri tanımladım.
        String userName = "patika",pass = "java123",inuser,inpass,sifirlama;

        System.out.print("Kullanıcı adı:");
        inuser = girdi.nextLine();
        System.out.print("Şifreniz:");
        inpass = girdi.nextLine();

        if(userName.equals(inuser) && pass.equals(inpass)){
            System.out.print("Giriş Yaptınız!");
        }else if(userName.equals(inuser) && pass!=inpass){
            System.out.print("Şifrenizi sıfırlamak istiyor musunuz?:");
            sifirlama = girdi.nextLine();
            if(sifirlama.equals("evet")){
                System.out.print("Yeni şifreniz:");
                inpass = girdi.nextLine();
                if (pass.equals(inpass)){
                    System.out.print("Yeni şifreniz eskisi ile aynı olamaz....");
                }else{
                    pass = inpass;
                    System.out.print("Şifreniz başarıyla değiştirildi...");
                }
            }
        }else{
            System.out.print("Bilgileriniz hatalı...");
        }
    }
}
