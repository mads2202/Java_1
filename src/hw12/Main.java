package hw12;

import java.util.Arrays;
import java.util.stream.Stream;

public class  Main {
    static final int SIZE = 100000000;
    static final int HALF = SIZE / 2;
    static float[] arr = new float[SIZE];
    public static void fillArr(float[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i]=1;
        }
    }
    public static void someMath(float[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
    public static void someMultiThreadMath(float[] arr) throws InterruptedException {

        float[] leftHalf= Arrays.copyOfRange(arr,0,SIZE/2);
        float[] rightHalf= Arrays.copyOfRange(arr,SIZE/2,SIZE);
        Thread t1=new Thread(()->{
            someMath(leftHalf);
            System.arraycopy(leftHalf,0,arr,0,leftHalf.length);

        });
        t1.start();
        Thread t2=new Thread(()->{
            someMath(rightHalf);
            System.arraycopy(rightHalf,0,arr,leftHalf.length,rightHalf.length);
        });
        t2.start();
        t1.join();
        t2.join();




    }

    public static void main(String[] args) throws InterruptedException {
        fillArr(arr);
        long startTime=System.currentTimeMillis();
        someMultiThreadMath(arr);
        System.out.println(System.currentTimeMillis()-startTime);
        fillArr(arr);
        startTime=System.currentTimeMillis();
        someMath(arr);
        System.out.println(System.currentTimeMillis()-startTime);



    }
}
