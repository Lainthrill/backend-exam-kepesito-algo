package hu.nive.ujratervezes.adddigits;

public class AddDigits {
    public int addDigits(String input) {
        int result = 0;
        if (input == null || input.length() == 0) {
            result = -1;
            return result;
        }
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))){
                result += Character.getNumericValue(input.charAt(i));
            }
        }
        return result;
    }
}
