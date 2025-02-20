package arithmeticoperators;

public class Main {
    public static void main(String[] args) {

        int x = 100;
        int y = 20;

        //addition
        int result = x + y;
        System.out.println(result);

        //subtraction
        result = x - y;
        System.out.println(result);

        //multiplication
        result = x * y;
        System.out.println(result);

        //division
        result = x / y;
        System.out.println(result);

        //remainder, 20/2 = 10 and 0 left over so remainder = 0
        result = 20 % 2;
        System.out.println(result);

        //math methods
        System.out.println("--------");
        System.out.println(Math.max(x, y));
        System.out.println(Math.abs(-500));     // |-500| = 500
    }
}
