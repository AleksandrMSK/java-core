package core.lesson3.color;

import java.util.Scanner;

public class Rainbow {
    private final Scanner scanner = new Scanner(System.in);
    private static final int RED_NUMBER = 1;
    private static final String RED_COLOR = "Красный цвет";

    public void start() {
        printColor(RED_NUMBER);
    }

    private void printColor(int color) {
        if (color == 1) {
            System.out.println(RED_COLOR);
        }
    }

}
