package Diziler;

public class odev_02 {
    public static void main(String[] args){
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};
        int count;

        for (int i = 0 ; i<dizi.length ; i++){
            count = 0;
            for (int j = 0; j<dizi.length;j++){
                if(dizi[i] == dizi[j]){
                    if(j<i){
                        break;
                    }
                    count++;
                }
            }
            if(count>0){
                System.out.printf("%d sayısı %d kere tekrar edildi.\n",dizi[i],count);
            }

        }
    }
}
