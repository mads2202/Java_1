package hw4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int size;
    public static int dotsToWin;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        System.out.println("Введите размерность поля (от 1 и больше)");
        size = sc.nextInt();
        System.out.println("Введите необходимое для победы количество символов подряд");
        dotsToWin = sc.nextInt();
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (check(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            hardAiTurn();
            printMap();
            if (check(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    public static boolean isMapFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void easyAiTurn() {
        int x, y;
        do {
            x = rand.nextInt(size);
            y = rand.nextInt(size);
        } while (!isCellValid(x, y) || !isEmptyCell(x, y));
        System.out.println("Компьютер сделал ход в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    public static void hardAiTurn() {
        boolean isTurnDone = false;
        label:
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (isEmptyCell(j, i)) {
                    map[i][j] = DOT_O;
                    if (check(DOT_O)) {
                        System.out.println("Компьютер сделал ход в точку " + (j + 1) + " " + (i + 1));
                        isTurnDone = true;
                        break label;
                    } else {
                        map[i][j] = DOT_EMPTY;
                    }
                }
            }
        }
        label1:
        if (!isTurnDone){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (isEmptyCell(j, i)) {
                        map[i][j] = DOT_X;
                        if (check(DOT_X)) {
                            map[i][j] = DOT_O;
                            System.out.println("Компьютер сделал ход в точку " + (j+ 1) + " " + (i + 1));
                            isTurnDone = true;
                            break label1;
                        } else {
                            map[i][j] = DOT_EMPTY;
                        }
                    }
                }
            }}
            if (!isTurnDone)
                easyAiTurn();
        }

        public static void humanTurn () {
            int x, y;
            do {
                System.out.println("Введите координаты в формате X Y");
                x = sc.nextInt() - 1;
                y = sc.nextInt() - 1;
            } while (!isCellValid(x, y) && !isEmptyCell(x, y)); // while(isCellValid(x, y) == false)
            map[y][x] = DOT_X;
        }

        public static boolean isCellValid ( int x, int y){
            return !(x < 0 || x >= size || y < 0 || y >= size);
        }

        public static boolean isEmptyCell ( int x, int y){
            return (map[y][x] == DOT_EMPTY);
        }

        public static void initMap () {
            map = new char[size][size];
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    map[i][j] = DOT_EMPTY;
                }
            }
        }

        public static void printMap () {
            for (int i = 0; i <= size; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            for (int i = 0; i < size; i++) {
                System.out.print((i + 1) + " ");
                for (int j = 0; j < size; j++) {
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        public static boolean check ( char symb){
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    int counter = 0;
                    for (int k = 0; k < dotsToWin; k++) { //row right
                        if (!isCellValid(j + k, i))
                            break;
                        if (map[i][j + k] == symb) {
                            counter++;
                        } else break;
                        if (counter == dotsToWin)
                            return true;
                    }
                    counter = 0;
                    for (int k = 0; k < dotsToWin; k++) { //row left
                        if (!isCellValid(j - k, i))
                            break;
                        if (map[i][j - k] == symb) {
                            counter++;
                        } else break;
                        if (counter == dotsToWin)
                            return true;
                    }
                    counter = 0;
                    for (int k = 0; k < dotsToWin; k++) { //colum down
                        if (!isCellValid(j, i + k))
                            break;
                        if (map[i + k][j] == symb) {
                            counter++;
                        } else break;
                        if (counter == dotsToWin)
                            return true;
                    }
                    counter = 0;
                    for (int k = 0; k < dotsToWin; k++) { //colum up
                        if (!isCellValid(j, i - k))
                            break;
                        if (map[i - k][j] == symb) {
                            counter++;
                        } else break;
                        if (counter == dotsToWin)
                            return true;
                    }
                    counter = 0;
                    for (int k = 0; k < dotsToWin; k++) { // down and right half diag
                        if (!isCellValid(j + k, i + k))
                            break;
                        if (map[i + k][j + k] == symb) {
                            counter++;
                        } else break;
                        if (counter == dotsToWin)
                            return true;
                    }
                    counter = 0;
                    for (int k = 0; k < dotsToWin; k++) { // up and left half diag
                        if (!isCellValid(j - k, i - k))
                            break;
                        if (map[i - k][j - k] == symb) {
                            counter++;
                        } else break;
                        if (counter == dotsToWin)
                            return true;
                    }
                    counter = 0;
                    for (int k = 0; k < dotsToWin; k++) { //other half diag
                        if (!isCellValid(j + k, i - k))
                            break;
                        if (map[i - k][j + k] == symb) {
                            counter++;
                        } else break;
                        if (counter == dotsToWin)
                            return true;
                    }
                    counter = 0;
                    for (int k = 0; k < dotsToWin; k++) { //other half diag
                        if (!isCellValid(j - k, i + k))
                            break;
                        if (map[i + k][j - k] == symb) {
                            counter++;
                        } else break;
                        if (counter == dotsToWin)
                            return true;
                    }
                }
            }

            return false;
        }

    }