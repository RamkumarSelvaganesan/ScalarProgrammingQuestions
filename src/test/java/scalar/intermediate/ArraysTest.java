package scalar.intermediate;

import org.testng.annotations.Test;

import static org.testng.Assert.assertThrows;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class ArraysTest {

    private final Arrays arrays = new Arrays();

    // ---------------- Tests for reverse() ----------------

    @Test
    void reverse_normalArray_returnsReversed() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {5, 4, 3, 2, 1};
        assertArrayEquals(expected, arrays.reverse(input));
    }

    @Test
    void reverse_singleElement_returnsSameArray() {
        int[] input = {7};
        int[] expected = {7};
        assertArrayEquals(expected, arrays.reverse(input));
    }

    @Test
    void reverse_emptyArray_returnsEmpty() {
        int[] input = {};
        int[] expected = {};
        assertArrayEquals(expected, arrays.reverse(input));
    }

    @Test
    void reverse_nullArray_throwsException() {
        assertThrows(NullPointerException.class, () -> arrays.reverse(null));
    }

    // ---------------- Tests for reverseByParts() ----------------

    @Test
    void reverseByParts_validRange_reversesSubsection() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 4, 3, 2, 5};
        assertArrayEquals(expected, arrays.reverseByParts(input, 1, 3));
    }

    @Test
    void reverseByParts_startEqualsEnd_arrayUnchanged() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, arrays.reverseByParts(input, 2, 2));
    }

    @Test
    void reverseByParts_fullArray_reversesEverything() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {5, 4, 3, 2, 1};
        assertArrayEquals(expected, arrays.reverseByParts(input, 0, 4));
    }

    @Test
    void reverseByParts_invalidRange_arrayUnchanged() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, arrays.reverseByParts(input, 4, 1));
    }

    @Test
    void reverseByParts_nullArray_throwsException() {
        assertThrows(NullPointerException.class, () -> arrays.reverseByParts(null, 0, 1));
    }

    // ---------------- Tests for rotateByTimes() ----------------

    @Test
    void rotateByTimes_normalCase_rotatesArray() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] expected = {3, 4, 5, 6, 1, 2};
        assertArrayEquals(expected, arrays.rotateByTimes(input, 4));
    }

    @Test
    void rotateByTimes_kZero_arrayUnchanged() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, arrays.rotateByTimes(input, 0));
    }

    @Test
    void rotateByTimes_kGreaterThanLength_wrapsAround() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {4, 5, 1, 2, 3}; // k=7 is same as k=2
        assertArrayEquals(expected, arrays.rotateByTimes(input, 7));
    }

    @Test
    void rotateByTimes_singleElement_arrayUnchanged() {
        int[] input = {9};
        int[] expected = {9};
        assertArrayEquals(expected, arrays.rotateByTimes(input, 3));
    }

    @Test
    void rotateByTimes_emptyArray_throwsException() {
        int[] input = {};
        assertThrows(ArithmeticException.class, () -> arrays.rotateByTimes(input, 2));
    }

    @Test
    void rotateByTimes_nullArray_throwsException() {
        assertThrows(NullPointerException.class, () -> arrays.rotateByTimes(null, 2));
    }
}
