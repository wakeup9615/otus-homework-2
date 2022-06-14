import animal.Animal;
import animal.pets.Cat;
import animal.pets.Dog;
import animal.birds.Duck;
import data.Command;
import helper.Format;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<Animal>();
        Scanner sc = new Scanner(System.in);
        boolean isExit = true;
        while (isExit) {
            System.out.println("Выберите из меню add/list/exit");
            String cmdStr = sc.next().toUpperCase(Locale.ROOT).trim();
            Command cmd = null;
            for (Command command : Command.values()) {
                if (command.name().equals(cmdStr)) {
                    cmd = Command.valueOf(cmdStr);
                    break;
                } else {
                    cmd = command.UNKNOW;
                }
            }
            switch (cmd) {
                case ADD: {
                    System.out.println("Какое животное создать cat/dog/duck");
                    String animalStr = sc.next();
                    Animal animal;
                    switch (animalStr) {
                        case "cat":
                            animal = new Cat();
                            createAnimal(animal, sc);
                            animals.add(animal);
                            animal.say();
                            break;
                        case "dog":
                            animal = new Dog();
                            createAnimal(animal, sc);
                            animals.add(animal);
                            animal.say();
                            break;
                        case "duck":
                            animal = new Duck();
                            createAnimal(animal, sc);
                            animals.add(animal);
                            animal.say();
                            break;
                        default:
                            System.out.println("Такого животного нет");
                    }
                    break;
                }
                case LIST:
                    if (animals.isEmpty()) {
                        System.out.println("Список пуст, добавьте животное");
                    } else {
                        for (Animal animal : animals) {
                            System.out.println(animal.toString());
                        }
                    }
                    break;
                case EXIT:
                    System.out.println("Выход");
                    isExit = false;
                    break;
                case UNKNOW:
                    System.out.println("Неизвестная команда");
            }
        }
    }

    private static void createAnimal(Animal animal, Scanner scanner) {
        System.out.println("Введите имя");
        animal.setName(scanner.next());

        System.out.println("Введите возраст");
        animal.setAge(Format.checkFormatData(scanner));

        System.out.println("Введите вес");
        animal.setWeight(Format.checkFormatData(scanner));

        System.out.println("Введите цвет");
        animal.setColor(scanner.next());
    }
}

