import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelperFunc {
    public static String generateYear(int year) {
        int temp = year % 10;
        if (temp == 1) {
            return " год";
        } else if (temp == 0 || temp >= 5 && temp <= 9) {
            return " лет";
        } else if (temp >= 2 && temp <= 4) {
            return " года";
        } else {
            return " лет"; // для необработанных случаев
        }
    }
}


