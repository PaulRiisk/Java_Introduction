package assignmentoperators;

public class Main {
    public static void main(String[] args) {

        int x = 100;
        int y = 20;

        //x = x + y;
        x += y;
        System.out.println(x);
        x -= y;
        System.out.println(x);
        x *= y;
        System.out.println(x);
        x /= y;
        System.out.println(x);
        x %= y;
        System.out.println(x);


        x++;
        System.out.println(x);
        x--;
        System.out.println(x);

    }
}
