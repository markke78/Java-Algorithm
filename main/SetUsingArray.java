package main;

public class SetUsingArray<T> implements SetInterface<T> {
    private T[] arr;
    private int numberOfElements;
    public final static int ARR_SIZE = 11;
    final int MAX_CAPACITY = ARR_SIZE - 1;

    public SetUsingArray() {
        arr = (T[]) new Object[ARR_SIZE];
        numberOfElements = 0;
    }

    public int getCurrentSize() {
        return numberOfElements;
    }

    public boolean isEmpty() {
        return numberOfElements == 0;
    }

    public boolean add(T newEntry) {
        if (numberOfElements == MAX_CAPACITY)
            return false;
        if (contains(newEntry))
            return false;
        arr[numberOfElements] = newEntry;
        numberOfElements++;
        return true;
    }

    public boolean remove(T anEntry) {
        if (isEmpty())
            return false;

        if (!contains(anEntry)) {
            return false;
        } else {
            int count = 0;
            T[] temp = (T[]) new Object[ARR_SIZE];
            for (int i = 0; i < numberOfElements; i++) {
                if (arr[i] != anEntry) {
                    temp[count] = arr[i];
                    count++;
                }
            }
            arr = temp;
            numberOfElements = arr.length;
            return true;
        }

    }

    public void clear() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = null;
        }
        numberOfElements = 0;
    }

    public boolean contains(T anEntry) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == anEntry) {
                return true;
            }
        }
        return false;
    }

    public T[] toArray() {
        return arr;
    }

    public static void main(String[] args) {
        SetUsingArray<Integer> set = new SetUsingArray<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        System.out.println(set.add(2));
        System.out.println(set.getCurrentSize());
        System.out.println(set.isEmpty());
        System.out.println(set.remove(5));
        System.out.println(set.contains(2));
        System.out.println(set.contains(2));
        System.out.println(set.toArray());
        set.clear();
        System.out.println(set.getCurrentSize());
        System.out.println(set.isEmpty());

    }

}
