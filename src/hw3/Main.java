package hw3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    //task 1
    public static void guessTheNumber() {
        int number;
        int userNumber;
        boolean winFlag;
        int repeat;
        do {
            number=new Random().nextInt(10);
            Scanner scanner=new Scanner(System.in);
            winFlag=false;
            System.out.println("Добро пожаловать в игру \"Угадай число\"");
            for (int i = 0; i < 3; i++) {
                System.out.println("Введите число и нажмите ENTER");
                userNumber=scanner.nextInt();
                if(userNumber<number){
                    System.out.println("Вы ввели слишком маленькое число.");
                }else if(userNumber>number){
                    System.out.println("Вы ввели слишком большое число число.");
                }else if(userNumber==number){
                    winFlag=true;
                    break;
                }
            }
            if(winFlag){
                System.out.println("Поздравляем вы угадали число "+number);
            }else{
                System.out.println("Попытки кончились. Загаданное число "+number);
            }
            System.out.println("Если хотите сыграть ещё раз, введите 1. Если хотите закончить введите 0");
            repeat=scanner.nextInt();
        }while (repeat!=0);
    }
    //task2
    public static  void guessTheWord(){
        String[] arr={"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic",
                "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        System.out.println("Добро пожаловать в игру \"Угадай слово\"");
        System.out.println("Мы загадали 1 из этих слов \n"+ Arrays.toString(arr)+"\nугадай какое");
        String userAnswer;
        int length;
        StringBuilder encryptedAnswer=new StringBuilder("###############");
        String answer=arr[new Random().nextInt(arr.length)];
        Scanner scanner= new Scanner(System.in);
        do {
            System.out.println("Введите слово и нажмите ENTER");
            userAnswer=scanner.nextLine();
            if(userAnswer.length()<answer.length()){
                length=userAnswer.length();
            }
            else
                length=answer.length();
            for (int i = 0; i < length; i++) {
                if(answer.charAt(i)==userAnswer.charAt(i)){
                    encryptedAnswer.setCharAt(i,answer.charAt(i));
                }
            }
            System.out.println(encryptedAnswer);



        }while (!answer.equals(userAnswer));
        if (answer.equals(userAnswer)){
            System.out.println("Поздравляемы вы отгадали слово "+ answer);
        }

    }





    public static void main(String[] args) {

        guessTheWord();



    }
}
