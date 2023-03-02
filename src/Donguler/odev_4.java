package Donguler;

public class odev_4 {
    public static void main(String[] args){
        int son = 100,bolen_say = 0;

        for(int i = 2;i<=100;i++){
            bolen_say = 0;
            for (int a = 2;a<i;a++){
                if(i%a==0){
                    bolen_say += 1;
                }
            }
            if(bolen_say == 0){
                System.out.println(i);
            }
        }
    }
}
