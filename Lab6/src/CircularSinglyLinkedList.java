public class CircularSinglyLinkedList<E> {

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

    private Node<E> tail = null;
    private int size = 0;

    public CircularSinglyLinkedList() {
    }

    public int size() {
        return size;
    }
    // added traverse and rotate

    public void traverse() {
        if (isEmpty()) {
            System.out.println("List is empty.");
            return;
        }
        Node<E> current = tail.getNext();
        do {
            System.out.print(current.getElement()); // استخدام print بدلاً از println لتبقى في نفس السطر
            current = current.getNext();
            if (current != tail.getNext()) {
                System.out.print("->"); // طباعة السهم بين العناصر
            }
        } while (current != tail.getNext());
        System.out.println(); // للنزول سطر جديد فقط بعد انتهاء طبع القائمة كاملة
    }

    public void rotate() {
        if (tail != null){
            tail = tail.next;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E first() {
        if (isEmpty()) {
            return null;
        }

        return tail.getNext().getElement();
    }

    public E last() {
        if (isEmpty()) {
            return null;
        }

        return tail.getElement();
    }

    public void addFirst(E e) {
        if (isEmpty()) {
            tail = new Node<>(e, null);
            tail.setNext(tail);
        } else {
            Node<E> newest = new Node<>(e, tail.getNext());
            tail.setNext(newest);
        }

        size++;
    }

    public void addLast(E e) {
        addFirst(e);
        tail = tail.getNext();
    }

    public E removeFirst() {
        if (isEmpty()) {
            return null;
        }

        Node<E> head = tail.getNext();

        if (head == tail) {
            tail = null;
        } else {
            tail.setNext(head.getNext());
        }

        size--;
        return head.getElement();
    }
}