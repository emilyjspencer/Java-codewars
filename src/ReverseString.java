import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        String result = reverseString("happy birthday");
        System.out.println(result);

    }


    public static String reverseString(String string) {
        // create a new instance of string builder
        StringBuilder reversed = new StringBuilder();
        // convert string to StringBuilder
        reversed.append(string);
        reversed.reverse();
        return reversed.toString();
    }
}
// yadhtrib yppah