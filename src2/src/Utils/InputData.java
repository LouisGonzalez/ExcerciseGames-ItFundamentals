package Utils;

import java.util.Scanner;

public class InputData {

    public static int readNumber() {
        int sc;
        Scanner scanner = new Scanner(System.in);
        sc = scanner.nextInt();
        return sc;
    }

    public static void readString() {
        String sc2;
        Scanner scanner = new Scanner(System.in);
        sc2 = scanner.nextLine();

    }
}
