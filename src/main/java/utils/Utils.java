package utils;

import java.util.Random;

public class Utils {

    public static Integer[] getNumbers(int quantity) {
        Integer[] data = new Integer[quantity];
        Random random = new Random();

        for (int i = 0; i < quantity; i++) {
            data[i] = random.nextInt(Integer.MAX_VALUE)+1;
        }

        return data;
    }
}
