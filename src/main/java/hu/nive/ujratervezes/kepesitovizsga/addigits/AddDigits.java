package hu.nive.ujratervezes.kepesitovizsga.addigits;

import java.util.Set;
import java.util.TreeSet;

public class AddDigits {

    public int addDigits(String input) {
        if (input == null || input.isEmpty()) {
            return -1;
        }
        int sum = 0;
        for (char item : input.toCharArray()) {
            if (Character.isDigit(item)) {
                sum += Character.getNumericValue(item);
            }
        }
        return sum;
    }
}
