package Diger_konular;

public class pratik_02 {
    static boolean isPalindrome(String kelime){
        int i = 0, j = kelime.length()-1;
        while (i<j){
            if(kelime.charAt(i) != kelime.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(isPalindrome("kayak"));
    }
}
