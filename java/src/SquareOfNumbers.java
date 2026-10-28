import java.util.Arrays;

public class SquareOfNumbers {
    public static int[] squareArray(int[] array){
        int[] newArray = new int[array.length];
        int count = 0;
        for(int numbers : array){
            newArray[count] = numbers * numbers;
            count++;
        }
        return Arrays.stream(newArray).sorted().toArray();
    }
}