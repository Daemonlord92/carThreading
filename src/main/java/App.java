import factory.EngineFactory;
import vehicles.Car;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Car carV6 = new Car(EngineFactory.createEngine("v6"), "Bob");
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Welcome to the car travelled game,
                Goal is to get Bob moving and stopping him at random times
                the game will continue to print even when you are selecting options
                1) Start Engine
                2) Stop Engine
                3) Speed Up
                4) Speed Down
                """);
                while (true) {
                    int input = scanner.nextInt();
                    switch (input) {
                        case 1:
                            carV6.start();
                            break;
                        case 2:
                            carV6.stop();
                            break;
                        case 3:
                            carV6.speedUp();
                            break;
                        case 4:
                            carV6.speedDown();
                            break;
                        case 5:
                            System.exit(0);
                    }
                }
    }
}
