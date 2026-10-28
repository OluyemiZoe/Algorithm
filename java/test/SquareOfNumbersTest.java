import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SquareOfNumbersTest {

    @Test
    public void TestToSquare_And_Sort_Array_Of_Numbers() {

        int[] input = {3, 2, 7, 1, 4};
        int[] expected = {1, 4, 9, 16, 49};

        int[] result = SquareOfNumbers.squareArray(input);
        assertArrayEquals(expected, result);
    }
    @Test
    public void TestToSquare_And_Sort_Array_Of_ThreeNumbers() {

        int[] input = {3, 2, 7, };
        int[] expected = {4, 9, 49};

        int[] result = SquareOfNumbers.squareArray(input);
        assertArrayEquals(expected, result);
    }
    @Test
    public void TestToSquare_And_Sort_Array_Of_Negative_Numbers() {

        int[] input = {-3, -2, -7, -4};
        int[] expected = {4, 9, 16, 49};

        int[] result = SquareOfNumbers.squareArray(input);
        assertArrayEquals(expected, result);
    }
}