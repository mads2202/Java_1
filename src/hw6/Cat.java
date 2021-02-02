package hw6;

public class Cat extends Animal{
    private static int catCounter=0;
    private int joggingDistance=200;
    public Cat(String name, int age, String color) {
        super(name, age, color);

        catCounter++;
    }

    public static int getCatCounter() {
        return catCounter;
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
        return getName()+" don't swim";
    }
}
