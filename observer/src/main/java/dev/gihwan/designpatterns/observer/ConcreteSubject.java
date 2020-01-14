package dev.gihwan.designpatterns.observer;

import java.util.Scanner;

public class ConcreteSubject extends AbstractSubject<Integer> {

    private final Scanner scanner;

    public ConcreteSubject() {
        super();
        this.scanner = new Scanner(System.in);
    }

    public void readForever() {
        while (true) {
            final String input = scanner.next();
            try {
                final int inputAsInteger = Integer.parseInt(input);
                notifyToObservers(inputAsInteger);
            } catch (NumberFormatException e) {
                // ignore
            } catch (Exception e) {
                break;
            }
        }
    }
}
