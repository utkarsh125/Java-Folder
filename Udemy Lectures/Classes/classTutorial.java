package Classes;

public class classTutorial {
    public static void main(String[] args) {
        //we will type a local variable
        //Car is actually a class, but we can treat it as a datatype
        Car porsche = new Car();
        Car maruti = new Car();

        //System.out.println("Model is "+porsche.getModel());//By default the model is Null.

        porsche.setModel("alto");

        System.out.println("Model is "+porsche.getModel());

    }
}
