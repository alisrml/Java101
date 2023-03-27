package Diziler;

public class pratik_01 {
    public static void main(String[] args){
        int[] liste = {1,3,6,4,7,8,9};
        double sum = 0;

        for (int j : liste) {
            sum += 1 / j;
        }
        System.out.print("Listenin harmonik serisi: "+sum);
        System.out.print("\nListenin harmonik ortalaması: "+(liste.length/sum));
    }
}
