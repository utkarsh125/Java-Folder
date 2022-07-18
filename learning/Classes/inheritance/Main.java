package Classes.inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

    Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "Long Silky");
    //dog.eat();


    //OUTPUT:

    // Dog.eat() called.
    // Dog.chew() Called.
    // Animal.eat() Called

    //super.eat() from Dog.java was called first, from the overridden function.
    //Dog.chew() was called from the chew() function.
    //and since Dog.java inherits from Animal class, Animal.eat() was printed.
    //

    dog.walk();
    //dog.run();

    Fish fish = new Fish("Nemo", 5, 20, 2, 2, 1);
    fish.swim(15);


    }
}
