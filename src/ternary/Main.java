package ternary;

public class Main {
    public static void main(String[] args) {

        int exam = 65;
        int gift = 0;

        if(exam >= 50) {
            gift = 10;
        } else {
            gift = 0;
        }
        System.out.println(gift);

        // var  if          ternary     true    false
        gift = (exam >= 50) ?           10  :   0;
        System.out.println(gift);

    }
}
