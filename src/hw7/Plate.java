package hw7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int n) {
        if (food - n >= 0) {
            food = food - n;
        }
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void addFood(int quantityFood){
        this.food+=quantityFood;
    }
}
