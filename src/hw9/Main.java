package hw9;

public class Main {
    public static final int ARRAY_SIZE = 4;

    public static int sum(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr.length != ARRAY_SIZE || arr[i].length != ARRAY_SIZE) {
                    throw new MyArraySizeException();
                }
                try{
                sum+=Integer.parseInt(arr[i][j]);}
                catch (NumberFormatException e){
                    throw new MyArrayDataException(i+" "+j,e);
                }

            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String[][] stringArr = new String[ARRAY_SIZE][ARRAY_SIZE];
        for (int i = 0; i < stringArr.length; i++) {
            for (int j = 0; j < stringArr[i].length; j++) {
                stringArr[i][j] = Integer.toString(i);
            }

        }
        String[][] wrongSizeStringArr = new String[5][5];
// first state: every Thing is ok
        try {
            System.out.println(sum(stringArr));
        } catch (MyArraySizeException e) {

            e.printStackTrace();
            e.getCause();
        } catch (MyArrayDataException e) {

            e.printStackTrace();
            e.getCause();
        }
        // second state: wrong array size
        try {
            System.out.println(sum(wrongSizeStringArr));
        } catch (MyArraySizeException e) {

            e.printStackTrace();
            e.getCause();
        } catch (MyArrayDataException e) {

            e.printStackTrace();
            e.getCause();
        }
        // third state: wrong array`s element format
        stringArr[3][3]="java";
        try {
            System.out.println(sum(stringArr));
        } catch (MyArraySizeException e) {

            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
            e.getCause();
        }


    }
}
