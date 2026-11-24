public class SinglyLinkedList<E> {

    // Nested Node class
    private static class Node<E> {
        private E element;
        private Node<E> next;

        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> n) {
            next = n;
        }
    }

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public SinglyLinkedList() {
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E first() {
        if (isEmpty())
            return null;
        return head.getElement();
    }

    public E last() {
        if (isEmpty())
            return null;
        return tail.getElement();
    }

    public void addFirst(E e) {
        Node<E> newest = new Node<>(e, head);
        head = newest;
        if (size == 0)
            tail = head;
        size++;
    }

    public void addLast(E e) {
        Node<E> newest = new Node<>(e, null);
        if (isEmpty())
            head = newest;
        else
            tail.setNext(newest);
        tail = newest;
        size++;
    }

    public E removeFirst() {
        if (isEmpty())
            return null;
        E answer = head.getElement();
        head = head.getNext();
        size--;
        if (size == 0)
            tail = null;
        return answer;
    }

    // --- الإضافات المطلوبة في الجزء 1 ---

    // 1. الدالة للطباعة بشكل تسلسلي من البداية للنهاية
    public void forwardTraversal() {
        Node<E> current = head;
        while (current != null) {
            System.out.print(current.getElement());
            if (current.getNext() != null) {
                System.out.print(" -> ");
            }
            current = current.getNext();
        }
        System.out.println();
    }

    // 2. الدالة للبحث عن عنصر معين
    public boolean contains(E value) {
        Node<E> current = head;
        while (current != null) {
            if (current.getElement().equals(value)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }
}