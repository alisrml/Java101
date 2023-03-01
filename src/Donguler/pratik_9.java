package Donguler;
import java.util.Scanner;

public class pratik_9 {
    public static void main(String[] args){
        //Scanner sınıfını tanımladım.
        Scanner input = new Scanner(System.in);

        //Degiskenleri tanımladım.
        String userName,password;
        int right = 3,balance = 1500,select;

        //Kullanıcıdan kullanıcı adı ve sifre bilgilerini burada alıyorum. 3 hakkını bitirmedikçe
        while (right>0){
            System.out.print("Kullanıcı adınız: ");
            userName = input.nextLine();
            System.out.print("Şifreniz: ");
            password = input.nextLine();

            //Giris bilgileri doğruysa işlemlere başlanıyor.
            if (userName.equals("mauro") && password.equals("icardi")) {
                System.out.println("Merhaba, Okan Buruk Bankasına Hoşgeldiniz!");

                do{
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");

                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    select = input.nextInt();

                    switch (select){
                        case 1:
                            System.out.print("Para miktarı: ");
                            int price = input.nextInt();
                            balance += price;
                            System.out.println("Yeni bakiyeniz: "+ balance);
                            break;

                        case 2:
                            System.out.println("Bakiyeniz: "+balance);
                            System.out.print("Para miktarı: ");
                            int price2 = input.nextInt();

                            if (price2>balance){
                                System.out.println("Yetersiz bakiye....");
                            }else {
                                System.out.println("Lütfen paranızı alınız...");
                                balance -= price2;
                                System.out.println("Yeni bakiyeniz: "+ balance);
                            }
                            break;

                        case 3:
                            System.out.println("Bakiyeniz: "+ balance);
                            break;
                    }


                }while (select !=4);
                System.out.print("Tekrar görüşmek üzere....");
                break;

                //giris bilgilerinin yanlış olması durumu.
            }else {
                //Giris bilgileri yanlışsa hak 1 azalıyor. Hak 0 olunca hesab bloke oluyor.
                right --;
                System.out.println("Hatalı kullanıcı adı yada şifre...");
                if(right ==0){
                    System.out.print("Banka hesabınız bloke olmuştur, banka ile iletişime geçiniz...");
                }else {
                    System.out.println("Kalan hakkınız: "+right+". Tekrar Deneyiniz....");
                }

            }
        }

    }
}
