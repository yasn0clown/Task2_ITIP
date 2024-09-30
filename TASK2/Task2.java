import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(isAnagram("Eleven plus two?", "Twelve plus one!"));
    }
    // таск 1
    public static String duplicateChars(String word_a, String word_b){
        String res = "";
        String low_a = word_a.toLowerCase();
        String low_b = word_b.toLowerCase();
        for (int i = 0; i < low_a.length(); i++) {
            char thisChar = low_a.charAt(i);
            if (low_b.indexOf(thisChar) == -1) {
                res += thisChar;
            }
        }
        return res;
    }
    // таск 2
    public static int dividedByThree(int[] numbers) {
        int c = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]%2!=0 && numbers[i]%3==0) {
                c++;
            }
        }
        return c;
    }
    // таск 3
    public static String getInitials(String fio) {
        String[] arr = new String[3];
        String[] word = fio.split(" ");
        arr[0] = (word[1].charAt(0) + ".").toUpperCase();
        arr[1] = (word[2].charAt(0) + ".").toUpperCase();
        arr[2] = (word[0].charAt(0) + "").toUpperCase() + word[0].substring(1, word[0].length());
        return String.join("",arr);
    }
    // таск 4
    public static double[] normalizator(double[] arr) {
        double max = Arrays.stream(arr).max().getAsDouble();
        double min = Arrays.stream(arr).min().getAsDouble();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i]-min)/(max-min);
        }
        return arr;
    }
    // таск 5
    public static int[] compressedNums(double[] double_numbers) {
        int[] int_numbers = new int[double_numbers.length];
        for (int i = 0; i < double_numbers.length; i++) {
            int_numbers[i] = (int) double_numbers[i];
        }
        Arrays.sort(int_numbers);
        int c = 0;
        for (int i = 0; i < int_numbers.length; i++) {
            if (int_numbers[i] == 0) {
                c++;
            }
            else if (int_numbers[i] > 0) {
                break;
            }
        }
        return Arrays.copyOfRange(int_numbers, c, int_numbers.length);
    }
    // таск 6
    public static String camelToSnake(String phrase) {
        String low_string = phrase.toLowerCase();
        String res = "";
        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) != low_string.charAt(i)) {
                res += "_" + low_string.charAt(i);
            }
            else {
                res += low_string.charAt(i);
            }
        }
        return res;
    }
    // таск 7
    public static int secondBiggest(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 2];
    }
    // таск 8
    public static String localReverse(String str, Character mark) {
        String res = "";
        String[] split_str = str.split(mark+"", -1);
        for (int i = 0; i < split_str.length; i++) {
            if (i % 2 == 1 && (i != split_str.length-1 || str.charAt(str.length()-1) == mark)) {
                res += new StringBuilder(split_str[i]).reverse();
            }
            else {
                res += split_str[i];
            }
            if (i != split_str.length - 1) {
                res += mark;
            }
        }
        return res;
    }
    // таск 9
    public static int equal(int a, int b, int c) {
        if (a == c && a == b) {
            return 3;
        }
        else if (a == b || a == c || b == c) {
            return 2;
        }
        return 0;
    }
    // таск 10
    public static boolean isAnagram(String str_1, String str_2) {
        str_1 = str_1.toLowerCase().replaceAll("[^a-z]", "");
        str_2 = str_2.toLowerCase().replaceAll("[^a-z]", "");
        if (str_1.length() != str_2.length()) {
            return false;
        }
        char[] arr_1 = str_1.toCharArray();
        char[] arr_2 = str_2.toCharArray();
        Arrays.sort(arr_2);
        Arrays.sort(arr_1);
        return Arrays.equals(arr_1,arr_2);
    }
}
