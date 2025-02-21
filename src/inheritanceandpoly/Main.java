package inheritanceandpoly;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;

public class Main {
    public static void main(String[] args) {
        // Inheritance

        Dog bengie = new Dog("bengie.png", "Bengie", 7);
        Dog gracie = new Dog("gracie.png", "Gracie", 5);

        bengie.birthday();

        Cat whiskers = new Cat("whiskers.png", "Whiskers", 4);

        bengie.makeSound();
        whiskers.makeSound();

        List<Animal> animals = new ArrayList<>();
        animals.add(bengie);
        animals.add(gracie);
        animals.add(whiskers);

        animals.get(1).makeSound();

        Animal animal = new Cat("jenny.png", "Jenny",12);
        animal.makeSound();

        List<Animal> goodBoys = new ArrayList<>();
        goodBoys.add(bengie);
        goodBoys.add(whiskers);

        goodBoys.get(1).makeSound();

        List<IPettable> pets = new ArrayList<>();
        pets.add(bengie);
        pets.add(whiskers);
        pets.add(new Bird("joshi.png", "Joshi",10));

        for(IPettable pet : pets) {
            pet.pet();
        }

        // IFly flying = (IFly)whiskers;
        // flying.fly();

    }
}
