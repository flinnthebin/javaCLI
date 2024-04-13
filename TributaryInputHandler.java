package tributary.cli;

import java.util.Scanner;

public class TributaryInputHandler {
    private Scanner scanner;

    public TributaryInputHandler() {
        this.scanner = new Scanner(System.in);
    }

    public String getInput() {
        System.out.print("~ ");
        return scanner.nextLine();
    }

    public void closeScanner() {
        scanner.close();
    }
}
