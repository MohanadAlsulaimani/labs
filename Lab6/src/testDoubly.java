
public class testDoubly {
    public static void main(String[] args) {
        // 1. Create a DoublyLinkedList<Integer>[cite: 2]
        DoublyLinkedList<Integer> intList = new DoublyLinkedList<>();


        // 2. Insert 100, 200, 300, and 400 using the provided methods[cite: 2]
        intList.addLast(100);
        intList.addLast(200);
        intList.addLast(300);
        intList.addLast(400);

        // 3. Print the list using forwardTraversal()[cite: 2]
        System.out.println("Integer List (Forward):");
        intList.forwardTraversal();

        // 4. Print the list using backwardTraversal()[cite: 2]
        System.out.println("Integer List (Backward):");
        intList.backwardTraversal();
        System.out.println();

        // 5. Create another list of type String and test both traversal methods[cite: 2]
        DoublyLinkedList<String> stringList = new DoublyLinkedList<>();
        stringList.addLast("ABC");
        stringList.addLast("DEF");
        stringList.addLast("GHI");
        stringList.addLast("JKL");

        System.out.println("String List (Forward):");
        stringList.forwardTraversal();

        System.out.println("String List (Backward):");
        stringList.backwardTraversal();
    }
}