package Main;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class TaskEight20 {
    private static char[][] map;
    private final static int MAP_SIZE = 5;

    private final static char DOT_X = '1';
    private final static char DOT_O = '0';
    private final static char DOT_EMPTY = '.';
    private static Scanner sc = new Scanner(System.in);
    private static int x, y;
    private static Random random = new Random();

    public static void main(String[] args) throws IOException {
        initMap();
        printMap();
        play();
    }

    private static void play() {
        while (true) {

            if ((checkWin(DOT_X) && checkWin(DOT_O) && checkDraw())) {
                System.out.println("0");
                break;
            }

            if (checkWin(DOT_X)) {
                System.out.println("1");
                break;
            }


            if (checkWin(DOT_O)) {
                System.out.println("-1");
                break;
            }

            if(checkDraw()){
                System.out.println("0");
                break;
            }

            break;

        }
    }

    private static boolean checkWin(char dot) {

        boolean check = false;

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if (map[i][j] == dot) {
                    check = true;
                } else {
                    check = false;
                    break;
                }
            }
            if (check == true) return check;
        }

        for (int j = 0; j < map.length; j++) {
            for (int i = 0; i < map.length; i++) {
                if (map[i][j] == dot) {
                    check = true;
                } else {
                    check = false;
                    break;
                }
            }
            if (check == true) return check;
        }

        for (int i = 0; i < map.length; i++) {
            if (map[i][i] == dot)
                check = true;
            else {
                check = false;
                break;
            }
        }

        if (check == true) return check;

        for (int i = 0; i < map.length; i++) {
            if (map[i][map.length - 1 - i] == dot)
                check = true;
            else {
                check = false;
                break;
            }
        }

        return check;
    }

    private static boolean checkDraw() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    private static void computerTurn() {
        System.out.println("\nComputer turn:");
        do {
            x = random.nextInt(MAP_SIZE);
            y = random.nextInt(MAP_SIZE);
        } while (!cellValidation(x + 1, y + 1, DOT_O));
        map[x][y] = DOT_O;
        printMap();
    }

    private static void humanTurn() {
        do {
            while (true) {
                System.out.println("Input coordinate(format: 'x y')");
                if (sc.hasNextInt()) {
                    x = sc.nextInt();
                } else {
                    System.out.println("Inputted wrong X coordinate format");
                    sc.nextLine();
                    continue;
                }

                if (sc.hasNextInt()) {
                    y = sc.nextInt();
                    break;
                } else {
                    System.out.println("Inputted wrong Y coordinate format");
                    sc.nextLine();
                }
            }
        } while (!cellValidation(x, y, DOT_X));
        map[x - 1][y - 1] = DOT_X;
        printMap();
    }


    private static void initMap() throws IOException {

        FileReader fr = new FileReader("input.txt");
        Scanner sc = new Scanner(fr);
        map = new char[MAP_SIZE][MAP_SIZE];

        List<String[]> list = new ArrayList<>();
        while (sc.hasNextInt()) {
            list.add(sc.nextLine().split(" "));
        }
        fr.close();
        Iterator<String[]> iter = list.listIterator();

        for (int i = 0; i < MAP_SIZE; i++) {
            String[] s;
            s = iter.next();
            for (int j = 0; j < MAP_SIZE; j++) {
                map[i][j] = s[j].charAt(0);
            }
        }

    }

    private static boolean cellValidation(int x, int y, char dot) {
        if (x < 1 || x > MAP_SIZE || y < 1 || y > MAP_SIZE) {
            System.out.println("Exit map size");
            return false;
        }
        boolean check = map[x - 1][y - 1] == DOT_EMPTY;

        if (check) {
            return check;
        } else {
            if (dot == DOT_X) {
                System.out.println("Cell is busy");
            }
            return false;
        }
    }


    private static void printMap() {

        System.out.println();
        for (int i = 0; i < map.length; i++) {

            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + "  ");
            }
            System.out.println();
        }
    }

}


