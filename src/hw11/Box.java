package hw11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Box<T extends Fruit> implements Comparable {
    ArrayList<T> fruits;

    public Box() {
        this.fruits = new ArrayList<T>();
    }

    public void addFruit(T fruit) {
        this.fruits.add(fruit);
    }

    public void addFruits(T... fruits) {
        this.fruits.addAll(Arrays.asList(fruits));
    }

    public double getWeight() {
        double sum = 0;
        for (T fruit : fruits) {
            sum += fruit.getWeight();
        }
        return sum;
    }

    @Override
    public int compareTo(Object o) {
        if ((o instanceof Box)) {
            if (this.getWeight() == ((Box<?>) o).getWeight()) {
                return 0;
            } else if (this.getWeight() > ((Box<?>) o).getWeight()) {
                return 1;
            } else
                return -1;

        } else {
            return -1;
        }
    }

    public ArrayList<T> getFruits() {
        return fruits;
    }

    public void pourOff(Box<T> to){
        to.getFruits().addAll(this.getFruits());
        Iterator<T> iterator=fruits.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }

    }
}
