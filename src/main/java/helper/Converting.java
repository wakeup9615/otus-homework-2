package helper;

public class Converting {
    public static String convertAgesToYears(int age) {
        int temp = age % 10;
        if (temp == 1) {
            return " год";
        } else if (temp == 0 || temp >= 5) {
            return " лет";
        } else if (temp >= 2) {
            return " года";
        } else {
            return " лет"; // для необработанных случаев
        }
    }
}


