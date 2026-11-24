public class TaskProgram {
    public static void main(String[] args ) {




        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();

        arrayQueue.enqueue(10);
        arrayQueue.enqueue(20);
        arrayQueue.enqueue(30);

        System.out.println("=== ArrayQueue<Integer> ===");
        System.out.println("Queue: " + arrayQueue.toString());
        System.out.println("First: " + arrayQueue.first());
        System.out.println("Dequeue: " + arrayQueue.dequeue());

        arrayQueue.enqueue(40);
        arrayQueue.enqueue(50);

        System.out.println("Queue after enqueue: " + arrayQueue.toString());
        System.out.println("Size: " + arrayQueue.size());
        System.out.println("Is empty? " + arrayQueue.isEmpty());

        //Next task Strings
        LinkedListQueue<String> linkedListQueue = new LinkedListQueue<>();

        linkedListQueue.enqueue("Sara");
        linkedListQueue.enqueue("Nora");
        linkedListQueue.enqueue("Lama");

        System.out.println();
        System.out.println("=== LinkedListQueue<String> ===");
        System.out.println("Queue: " + linkedListQueue.toString());
        System.out.println("First: " + linkedListQueue.first());
        System.out.println("Dequeue: " + linkedListQueue.dequeue());

        System.out.println("Queue after dequeue: " + linkedListQueue.toString());
        System.out.println("Size: " + linkedListQueue.size());
        System.out.println("Is empty? " + linkedListQueue.isEmpty());

    }

}
