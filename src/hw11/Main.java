package hw11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static <T> T[] swap(T[] arr, int firstElementToSwap,int secondElementToSwap){
        T buffer=arr[firstElementToSwap];
        arr[firstElementToSwap]=arr[secondElementToSwap];
        arr[secondElementToSwap]=buffer;
        return arr;
    }
    public static  <T> ArrayList<T> toArrayList(T[] arr){
        return new ArrayList<T>(Arrays.asList(arr));

    }
    public static void main(String[] args) {
        Integer[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(swap(arr,0,4)));
        System.out.println(toArrayList(arr));
        Apple apple1=new Apple(1);
        Apple apple2=new Apple(1);
        Apple apple3=new Apple(1);
        Apple apple4=new Apple(1);
        Orange orange1=new Orange(1.5);
        Orange orange2=new Orange(1.5);
        Orange orange3=new Orange(1.5);
        Orange orange4=new Orange(1.5);
        Box<Apple> appleBox=new Box<>();
        Box<Orange> orangeBox=new Box<>();
        appleBox.addFruits(apple1,apple2,apple3,apple4);
        System.out.println(appleBox.getWeight());
        //appleBox.addFruit(orange1);
        orangeBox.addFruits(orange1,orange2,orange3,orange4);
        System.out.println(appleBox.compareTo(orangeBox));
        //appleBox.pourOff(orangeBox);
        Box<Apple> appleBox1=new Box<>();
        appleBox.pourOff(appleBox1);
        System.out.println(appleBox.getWeight());
        System.out.println(appleBox1.getWeight());

    }
}
