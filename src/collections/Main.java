package collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        String[] questions = new String[2];
        questions[0] ="What is the name of the main protagonist in The Legend of Zelda series?";
        questions[1] ="How many slots are in a standard Minecraft hotbar?";


        List<String> questionsList = new ArrayList<>(); // no need to define the length
        // add to list
        questionsList.add("Which company created Halo?");
        questionsList.add("In Minecraft, what material is needed to craft a Nether portal?");
        questionsList.add("What is the capital of Germany?");

        // Lists --> you can add entries dynamically

        // Removing is fairly easy
        questionsList.remove(1);

        System.out.println(questionsList.size());

        System.out.println(questionsList.get(0));

        // List<int> numbers = new ArrayList<int>():
        // Generics don't work with primitive datatypes
        // wrapper classes you can use instead
        List<Integer> numbers = new ArrayList<>();
        numbers.add(42);
        numbers.add(1337);

        System.out.println(numbers.get(0));

        // MAPS
        // map a key to a certain Value. Called Key-Value Pairs
        Map<String, String> CountryToCapital = new HashMap<>();
        CountryToCapital.put("Germany", "Berlin");
        CountryToCapital.put("France", "Paris");
        CountryToCapital.put("Italy", "Rome");
        CountryToCapital.put("USA", "Washington DC");

        // get a Value of a Map you have to supply it a key
        System.out.println(CountryToCapital.get("France"));

        System.out.println("Contains Key 'Germany' ? " + CountryToCapital.containsKey("Germany"));
        System.out.println("Contains Key 'London' ? " + CountryToCapital.containsKey("London"));

        System.out.println(CountryToCapital.remove("France"));

        // SETS
        // a set is a collection that contains no duplicates
        Set<String> usernames = new HashSet<>();
        usernames.add("Kaupenjoe");
        usernames.add("PaulRiisk");
        usernames.add("Matony12");

        System.out.println(usernames.add("FRV"));
        System.out.println(usernames.add("FRV"));

        // ERRORS TO KNOW
        // uncomment to see

        //Index out of Bounds
        //System.out.println(questionsList.get(2));

        // Not an Exception but 'NULL'
        // return-value is going to be null
        //System.out.println(CountryToCapital.get("Malta"));

    }
}
