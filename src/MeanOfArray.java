/*
Get the mean of the array

 It's the academic year's end, fateful moment of your school report. The averages must be calculated.
 All the students come to you and entreat you to calculate their average for them. Easy !
 You just need to write a script.
Return the average of the given array rounded down to its nearest integer.
The array will never be empty.

 */


public class MeanOfArray{

    public static void main(String[] args) {
        int[] marks = {90, 86, 45, 30, 100, 49, 76};
        int result = getAverage(marks);
        System.out.println(result);
    }

    public static int getAverage(int[] marks){

        int sum = 0;
        // loop through the array
        for( int i : marks) {
            sum += i;
        }
        return sum / marks.length;
        // 68
    }

}
