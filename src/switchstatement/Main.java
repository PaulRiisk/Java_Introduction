package switchstatement;

public class Main {
    public static void main(String [] args) {

        int medalPlacement = 1;


        //switch statement don't use with float, because of rounding errors

        switch (medalPlacement) {
            case 1: System.out.println("GOLD MEDAL"); break;
            case 2: System.out.println("SILVER MEDAL"); break;
            case 3: System.out.println("BRONZE MEDAL"); break;
            default: System.out.println("NO MEDAl"); break;
        }

    }
}
