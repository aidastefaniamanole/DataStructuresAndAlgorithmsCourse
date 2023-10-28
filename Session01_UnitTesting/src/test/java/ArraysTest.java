import org.example.W03_Arrays;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ArraysTest {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void noExceptionIsThrown() {
        int[] array = { 1, 2, 1, 2, 5 };
//        expectedException.expect(ArrayIndexOutOfBoundsException.class);
        boolean result = W03_Arrays.containsDuplicate(array);
        assertTrue(result);

    }

    @Test
    public void testEmptyArray() {
        int[] emptyArray = {};
        boolean result = W03_Arrays.containsDuplicate(emptyArray);
        assertFalse(result);
    }

    @Test
    public void testOneElementArray() {
        int[] oneElementArray = {1};
        boolean result = W03_Arrays.containsDuplicate(oneElementArray);
        assertFalse(result);
    }

    @Test
    public void testOnlyOneDuplicate() {
        int[] array = { 1, 2, 1 };
        boolean result = W03_Arrays.containsDuplicate(array);
        assertTrue(result);
    }

    @Test
    public void testMultipleDuplicates() {
        int[] array = { 1, 2, 1, 2, 5 };
        boolean result = W03_Arrays.containsDuplicate(array);
        assertTrue(result);
    }

}
