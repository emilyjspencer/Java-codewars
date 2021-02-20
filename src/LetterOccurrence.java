// Count how many times the letter e occurs in the string

public class LetterOccurrence {



        public static void main(String[] args) {
            int result = findNumOfChar("hello my name is Emily", 'e');
            System.out.println(result);
        }

    public static int findNumOfChar(String sentence, char letter) {


        int counter = 0;

        // loop through the string
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == letter) {
                counter++;
            }
        }
        return counter;

    }

}