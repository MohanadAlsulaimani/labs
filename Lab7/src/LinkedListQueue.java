import java.util.LinkedList;

/** Queue implemented with Java's LinkedList. */
public class LinkedListQueue<E> implements Queue<E> {
    private final LinkedList<E> data = new LinkedList<>();

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public void enqueue(E e) {
        data.addLast(e);
    }

    @Override
    public E first() {
        return data.peekFirst();
    }

    @Override
    public E dequeue() {
        return data.removeFirst();
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
