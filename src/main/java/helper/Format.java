package helper;

import java.util.Scanner;

public class Format {
    public static int checkFormatData(Scanner scanner) {
        int age;
        do {
            while (!scanner.hasNextInt()) {
                if (scanner.hasNextBigInteger()) {
                    System.out.println("Введите значение поменьше");
                } else {
                    System.out.println("Введите значение в формате числа");
                }
                scanner.next();
            }
            age = scanner.nextInt();
            if (age < 0) {
                System.out.println("Введите положительное число");
            }
        }
        while (age < 0);
        return age;
    }
}
