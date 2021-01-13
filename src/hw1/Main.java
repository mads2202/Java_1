package hw1;

public class Main {
    //task3
    public static float arithmeticOperation(float a, float b, float c, float d){
        return  a * (b + (c / d));
    }
    //task4
    public static boolean sumBetween(int a, int b){
        return (a+b)>=10 && (a+b)<=20;
    }
    //task5
    public static String isPositive(int a){
        if(a<0){
            return "Число "+ a+" Отрицательное";
        }else return "Число "+ a+" Положительное";
    }
    //task6 про ноль в задании 6 не сказано, поэтому он не положительный и не отрицательный и на него тоже вернётся false
    public static boolean isNefative(int a){
        return a<0;
    }
    //task7
    public static String greetings(String name){
        return "Привет, "+name+" !";
    }
    //task8
    public static boolean isLeap(int year){
        return (year%4==0 && year%100!=0) || year%400==0;
    }
    public static void main(String[] args) {
        //task2: Initialise all vars
        String str="hello World";
        byte b=1;
        short s=2;
        int i=3;
        long l=4;
        float f= 5.0f;
        double d=5.0;
        char c='I';
        boolean bool= true;




    }
}
