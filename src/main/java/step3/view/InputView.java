package step3.view;

import java.util.Scanner;

public class InputView {
    private final Scanner scanner;

    public InputView() {
        scanner = new Scanner(System.in);
    }

    public int askNumberOfCars() {
        System.out.println("자동차 대수는 몇 대 인가요?");
        return scanner.nextInt();
    }

    public int askNumberOfTrys() {
        System.out.println("시도 회수는 몇 회 인가요?");
        return scanner.nextInt();
    }
}
