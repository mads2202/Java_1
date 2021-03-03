package hw14;



import java.util.Arrays;

public class MainClass {
    //    Написать метод, которому в качестве аргумента передается не пустой одномерный целочисленный массив.
//        Метод должен вернуть новый массив, который получен путем вытаскивания из исходного массива элементов, идущих после последней четверки.
//        Входной массив должен содержать хотя бы одну четверку, иначе в методе необходимо выбросить RuntimeException.
//        Написать набор тестов для этого метода (по 3-4 варианта входных данных).
//        Вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ].
    public int[] convertArr(int[] arr) {
        if (!isContains4(arr))
            throw new RuntimeException();
        else {
            int indexOfLast4 = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 4) {
                    indexOfLast4 = i;
                }
            }
            return Arrays.copyOfRange(arr, indexOfLast4 + 1, arr.length);
        }
    }

    //    Написать метод, который проверяет состав массива из чисел 1 и 4. Если в нем нет хоть одной четверки или единицы,
//    то метод вернет false; Написать набор тестов для этого метода (по 3-4 варианта входных данных).
//            [ 1 1 1 4 4 1 4 4 ] -> true
//            [ 1 1 1 1 1 1 ] -> false
//            [ 4 4 4 4 ] -> false
//            [ 1 4 4 1 1 4 3 ] -> false
    public boolean isContains4(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        MainClass main=new MainClass();
        System.out.println(Arrays.toString(main.convertArr(new int[]{1,2,3})));


    }
}
