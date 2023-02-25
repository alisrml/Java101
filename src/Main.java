public class Main {
    public static void main(String[] args){
        int gun = 2;
        switch (gun) {
            case 2:
                System.out.println("Bugün cumartesi");
            case 3:
                System.out.println("Bugün pazar");
                break;
            default:
                System.out.println("Bugün hafta içi");
        }
    }
}
