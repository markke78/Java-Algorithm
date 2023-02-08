
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.SetUsingArray;

public class SetUsingArrayTest<T> {
    @Test
    public void testForGetCurrentSize() {
        SetUsingArray<Integer> set = new SetUsingArray<Integer>();
        assertEquals(0, set.getCurrentSize());
        set.add(1);
        assertEquals(1, set.getCurrentSize());
    }

    @Test
    public void testForIsEmpty() {
        SetUsingArray<Integer> set = new SetUsingArray<Integer>();
        assertEquals(true, set.isEmpty());
        set.add(1);
        assertEquals(false, set.isEmpty());
    }

    @Test
    public void testForAdd() {
        SetUsingArray<Integer> set = new SetUsingArray<Integer>();
        assertEquals(true, set.add(1));
        assertEquals(false, set.add(1));
    }

    @Test
    public void testForRemove() {
        SetUsingArray<Integer> set = new SetUsingArray<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        assertEquals(true, set.remove(2));
        assertEquals(false, set.remove(2));
    }

    @Test
    public void testForClear() {
        SetUsingArray<Integer> set = new SetUsingArray<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.clear();
        assertEquals(true, set.isEmpty());
    }

    @Test
    public void testForContains() {
        SetUsingArray<Integer> set = new SetUsingArray<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        assertEquals(true, set.contains(2));
        assertEquals(false, set.contains(5));
    }

    @Test
    public void testForToArray() {
        SetUsingArray<Integer> set = new SetUsingArray<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        Integer[] array = new Integer[SetUsingArray.ARR_SIZE];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        assertArrayEquals(array, set.toArray());
    }

}
