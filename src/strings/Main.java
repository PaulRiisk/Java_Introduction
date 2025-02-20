package strings;

public class Main {
    public static void main(String[] args) {

        String sentence = "I love Java Tutorials!";
        System.out.println(sentence);
        System.out.println("Length is: " + "-" + sentence.length());

        // Upper and Lower Case
        System.out.println("Shouting: " + sentence.toUpperCase());
        System.out.println("Whispering: " + sentence.toLowerCase());
        System.out.println(sentence);

        // indexOf
        System.out.println("The word 'Java' is found at position: " + sentence.indexOf("Java"));

        // replace
        System.out.println(sentence.replace("Java", "Python"));

        String s = "";
        boolean empty = s.isEmpty();
        System.out.println(empty);

        // startsWith and endsWith
        System.out.println(sentence.startsWith("I"));
        System.out.println(sentence.endsWith("A"));

        // contains
        System.out.println(sentence.contains("Java"));

        // charAt
        System.out.println(sentence.charAt(7));

        // substring
        s = sentence.substring(7);
        System.out.println(s);

    }
}
