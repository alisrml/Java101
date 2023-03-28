package Diziler;

public class odev_03 {
    public static void main(String[] args){
        int[][] matris = {{1,2,3},{4,5,6}};
        int[][] transpoze = new int[matris[0].length][matris.length];

        //matristeki satir transpozeda sutun olacak.
        for ( int satir=0;satir<matris.length;satir++){
            for (int sutun=0;sutun<matris[0].length;sutun++){
                transpoze[sutun][satir] = matris[satir][sutun];
            }
        }

        //Matrisi yazdırdığım döngü.
        System.out.println("Matris : ");
        for (int satir = 0;satir<matris.length;satir++){
            for(int sutun=0;sutun<matris[0].length;sutun++){
                System.out.print(matris[satir][sutun]+"  ");
            }
            System.out.println();
        }

        //Transpoze yazdırdığım döngü.
        System.out.println("Transpoze : ");
        for (int satir=0;satir<transpoze.length;satir++){
            for (int sutun = 0;sutun<transpoze[0].length;sutun++){
                System.out.print(transpoze[satir][sutun]+"  ");
            }
            System.out.println();
        }
    }
}
