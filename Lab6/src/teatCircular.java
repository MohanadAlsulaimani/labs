
public class teatCircular {
    public static void main(String[] args) {
        // 1. Create an empty circular linked list[cite: 1]
        CircularSinglyLinkedList<Integer> list = new CircularSinglyLinkedList<>();

        System.out.println("1) Traverse empty list:");
        list.traverse();
        System.out.println();

        // 2. Insert several elements using the provided addLast() method[cite: 1]
        System.out.println("2) addLast: 10, 20, 30, 40");
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        System.out.print("List: ");
        list.traverse();
        System.out.println();

        // إضافات إضافية مطلوبة في الخطوة 3 (addFirst: 5, 3)[cite: 1]
        System.out.println("3) addFirst: 5, 3");
        list.addFirst(5);
        list.addFirst(3);
        System.out.print("List: ");
        list.traverse();
        System.out.println();

        // 4. removeFirst()[cite: 1]
        System.out.println("4) removeFirst()");
        System.out.println("Removed: " + list.removeFirst());
        System.out.print("List: ");
        list.traverse();
        System.out.println();

        // 5. Apply rotate() more than once and observe how the order changes[cite: 1]
        System.out.println("5) rotate() x3 (print after each rotation)");

        list.rotate();
        System.out.print("After rotate 1: ");
        list.traverse();

        list.rotate();
        System.out.print("After rotate 2: ");
        list.traverse();

        list.rotate();
        System.out.print("After rotate 3: ");
        list.traverse();
    }
}