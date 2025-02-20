package casting;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {


        int loan = 750;
        float interestRate = 0.0525f;

        float interest = loan * interestRate;
        System.out.println(interest);

        float x = (int)50.5f + 20.6f;
        System.out.println(x);

    }
}
