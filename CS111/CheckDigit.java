public class CheckDigit {
    public static void main(String[] args) {
        long num = Long.parseLong(args[0]);
        int sum1 = 0;
        int sum2 = 0;
        int lastDigit1 = 0;
        int lastDigit2 = 0;
        int l = String.valueOf(num).length();
        for (int i = l; i > 0; i = i - 2) {
            sum1 = sum1 + Character.getNumericValue(String.valueOf(num).charAt(i - 1));
        }
        for (int j = l - 1; j > 0; j = j - 2) {
            sum2 = sum2 + Character.getNumericValue(String.valueOf(num).charAt(j - 1));
        }
        if (sum1 < 10) {
            lastDigit1 = Character.getNumericValue(String.valueOf(sum1).charAt(0));
        } else {
            lastDigit1 = Character.getNumericValue(String.valueOf(sum1).charAt(1));
        }
        if (sum2 < 10) {
            lastDigit2 = Character.getNumericValue(String.valueOf(sum2).charAt(0));
        } else {
            lastDigit2 = Character.getNumericValue(String.valueOf(sum2).charAt(1));
        }
        lastDigit2 = lastDigit2 * 3;
        if (lastDigit2 < 10) {
            lastDigit2 = Character.getNumericValue(String.valueOf(lastDigit2).charAt(0));
        } else {
            lastDigit2 = Character.getNumericValue(String.valueOf(lastDigit2).charAt(1));
        }
        lastDigit1 = lastDigit1 + lastDigit2;
        if (lastDigit1 < 10) {
            System.out.println(Character.getNumericValue(String.valueOf(lastDigit1).charAt(0)));
        } else {
            System.out.println(Character.getNumericValue(String.valueOf(lastDigit1).charAt(1)));
        }
    }
}