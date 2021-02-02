package hw6;

public class Dog extends Animal {
    private static int dogCounter=0;
    private int joggingDistance=500;
    private int swimmingDistance=10;
    public Dog(String name, int age, String color) {
        super(name, age, color);
    }

    public static int getDogCounter() {
        return dogCounter;
    }
    @Override
    public String run(int distance) {
        if(joggingDistance>=distance) {
            return getName() + " run " + distance;
        } else{
            return getName() + " couldn't run " + distance;
        }
    }

    @Override
    public String swim(int distance) {
        if(swimmingDistance>=distance) {
            return getName() + " swim " + distance;
        } else{
            return getName() + " couldn't swim " + distance;
        }
    }


}
