package Diziler;

public class pratik_04 {

    static boolean varmi(int[] liste,int deger){
        for(int i:liste){
            if(i==deger){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] liste = {1,5,7,2,4,6,9,1,4,4,9,5,6,6,2,2,0,0,7,8};
        int[] tekrar = new int[liste.length];
        int index = 0;

        for (int i = 0; i<liste.length;i++){
            for( int j = 0; j<liste.length;j++){
                if ((i!=j)&&(liste[i] == liste[j])&&(liste[i]%2==0)){
                    if(!varmi(tekrar,liste[i])){
                        tekrar[index++] = liste[i];
                    }
                    break;
                }
            }
        }

        for(int eleman:tekrar){
            System.out.print(eleman+" ");
        }
    }
}
