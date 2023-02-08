import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import main.SetUsingLinkedList;

public class SetUsingLinkedListTest<T> {
    @Test
    public void testForGetCurrentSize() {
        SetUsingLinkedList<Integer> set = new SetUsingLinkedList<Integer>();
        assertEquals(0, set.getCurrentSize());
        set.add(1);
        assertEquals(1, set.getCurrentSize());
    }

    @Test
    public void testForIsEmpty() {
        SetUsingLinkedList<Integer> set = new SetUsingLinkedList<Integer>();
        assertEquals(true, set.isEmpty());
        set.add(1);
        assertEquals(false, set.isEmpty());
    }

    @Test
    public void testForAdd() {
        SetUsingLinkedList<Integer> set = new SetUsingLinkedList<Integer>();
        assertEquals(true, set.add(1));
        assertEquals(false, set.add(1));
    }

    @Test
    public void testForRemove() {
        SetUsingLinkedList<Integer> set = new SetUsingLinkedList<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        assertEquals(true, set.remove(4));
        assertEquals(true, set.remove(2));
        assertEquals(false, set.remove(2));
    }

    @Test
    public void testForClear() {
        SetUsingLinkedList<Integer> set = new SetUsingLinkedList<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.clear();
        assertEquals(true, set.isEmpty());
    }

    @Test
    public void testForContains() {
        SetUsingLinkedList<Integer> set = new SetUsingLinkedList<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        assertEquals(true, set.contains(2));
        assertEquals(false, set.contains(5));
    }

    @Test
    public void testForToArray() {
        SetUsingLinkedList<Integer> set = new SetUsingLinkedList<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        Integer[] array = { 4, 3, 2, 1 };
        assertArrayEquals(array, set.toArray());
    }

}
