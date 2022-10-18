package Classes.inheritance;

public class Dog extends Animal{
    //ANIMAL CLASS IS THE BASE CLASS

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {

        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;

        
    }
    private void chew(){
        System.out.println("Dog.chew() Called.");
    }
    @Override
    public void eat(){
        System.out.println("Dog.eat() called.");
        chew();
        super.eat();//super - call the super equivalent of eat 
    }

    public void walk(){
        System.out.println("Dog.walk() called.");
        //You can use super.move() or just move()
        super.move(15);
        //move(5); //This is better than super.move();
    }
    
    public void run(){
        System.out.println("Dog.run() called.");
        move(1);
    }


    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called.");
    }
    //we use super.move() if we want to override anything.
    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
