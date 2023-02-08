package main;

public class SetUsingLinkedList<T> implements SetInterface<T> {
    Node<T> front;
    int numberOfElements;

    public SetUsingLinkedList() {
        front = null;
        numberOfElements = 0;
    }

    public int getCurrentSize() {
        return numberOfElements;
    }

    public boolean isEmpty() {
        return numberOfElements == 0;
    }

    public boolean add(T newEntry) {
        if (contains(newEntry))
            return false;
        Node<T> newNode = new Node<T>();
        newNode.data = newEntry;
        newNode.next = front;
        front = newNode;
        numberOfElements++;
        return true;
    }

    public boolean remove(T anEntry) {
        if (isEmpty())
            return false;

        Node<T> tmp = front;
        if (tmp.data == anEntry) {
            front = tmp.next;
            tmp.next = null;
            numberOfElements--;
            return true;
        } else {
            Node<T> prev = null;
            for (int i = 0; i < numberOfElements; i++) {
                if (tmp.data == anEntry) {
                    prev.next = tmp.next;
                    tmp.next = null;
                    numberOfElements--;
                    return true;
                }
                prev = tmp;
                tmp = tmp.next;
            }

        }
        return false;
    }

    public void clear() {
        front = null;
        numberOfElements = 0;
    }

    public boolean contains(T anEntry) {
        Node<T> tmp = front;
        for (int i = 0; i < numberOfElements; i++) {
            if (tmp.data == anEntry) {
                return true;
            }
            tmp = tmp.next;
        }
        return false;
    }

    public T[] toArray() {
        T[] arr = (T[]) new Object[numberOfElements];

        Node<T> tmp = front;
        for (int i = 0; i < numberOfElements; i++) {
            arr[i] = tmp.data;
            tmp = tmp.next;
        }
        return arr;
    }

    public static void main(String[] args) {
        SetUsingLinkedList<Integer> set = new SetUsingLinkedList<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        System.out.println(set.add(2));
        System.out.println(set.getCurrentSize());
        System.out.println(set.isEmpty());
        System.out.println(set.remove(2));
        System.out.println(set.contains(2));
        System.out.println(set.contains(2));
        System.out.println(set.toArray());
        set.clear();
        System.out.println(set.getCurrentSize());

        System.out.println(set.isEmpty());

    }
}
