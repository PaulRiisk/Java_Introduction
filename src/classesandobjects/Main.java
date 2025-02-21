package classesandobjects;

public class Main {
    public static void main(String[] args) {
        // Classes & Object

        // using the "default Constructor"
        Dog doggo = new Dog();
        System.out.println(doggo.name);

        Dog bengie = new Dog("bengie.png", "Bengie", 7);
        System.out.println(bengie.name);
        System.out.println(bengie.getAge());

        Dog gracie = new Dog("gracie.png", "Gracie", 5);
        System.out.println(gracie.name);
        System.out.println(gracie.getAge());

        //same output as above but System.out defined in dog class
        Dog.outputDog(gracie);

        bengie.woof();
        gracie.woof();

        System.out.println("Bengie is in human-years " + bengie.getAgeInHumanYears() + " years old!");

    }
}
