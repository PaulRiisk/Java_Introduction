package classesandobjects;

public class Dog {

    // Some fields to dog class
    public String picture;  // public - open and free usable
    protected String name;  // protected
    private int age;        // private - only inside the class usable
    public static final int dogToHumanYearMultiplier = 7;

    // static - don't need an object to access this (for every dog)
    // final - assign value once and never change it again (const)


    // Getter - to get Age (in prints or something, for privates)
    public int getAge() {
        return age;
    }



    // Default Constructor
    public Dog() {

    }

    // to create a new Object we need a Custom Constructor
    public Dog(String picture, String name, int age) {
        this.picture = picture;
        this.name = name;
        this.age = age;
    }

    public void woof() {
        System.out.println(this.name + " just woofed!");
    }

    public void birthday() {
        this.age++;
    }

    public int getAgeInHumanYears() {
        return this.age * Dog.dogToHumanYearMultiplier;
    }

    public static void outputDog(Dog dog) {
        System.out.println(dog.name);
        System.out.println(dog.age);
    }

}
