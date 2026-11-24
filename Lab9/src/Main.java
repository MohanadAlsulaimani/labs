/** Student starter file: complete the tasks in main(). */
public class Main {


    public static void main(String[] args) {


        BST students = new BST();
        // Task 1: Insert the given student records in the specified order.
        students.insert(50, "Sara");
        students.insert(30, "Mona");
        students.insert(70, "Amal");
        students.insert(20, "Nora");
        students.insert(40, "Reem");
        students.insert(60, "Huda");
        students.insert(80, "Lama");

        // Task 2: Search for IDs 40 and 90; print suitable messages.
        System.out.println("\nTask 2");
       String res40 = students.search(40 );
       if (res40 != null) {
           System.out.println("Search for 40: " + res40);
       } else {
           System.out.println("Search for 40: not found");
       }
       // 50 root ->30 left ->40 right

       String res90 = students.search(90);
if (res90 != null) {
    System.out.println("Search for 90: " + res90);
} else {
    System.out.println("Search for 90: not found");
}

        // It doesn't go threw every node because it's sorted so it doesn't have to.


        // Task 3: Delete 20, 30, and 50.
        students.delete(20);
        students.delete(30);
        students.delete(50);
/*
Deleting 20 every thing else stays the same
Deleting 30 makes 40 take its place
Deleting 50 makes 60 become the root
 */

        // Task 4: Print the final student records using inorder().

        // It will print 40Reem , 60Huda , 70Amal ,at last 80Lama.
        System.out.println("\nTask 4");
        students.inorder();

        // Task 5: Create two new BST objects and insert the two sequences.
        System.out.println("\nTask 5");
        BST A = new BST();
        A.insert(10, "S10");
        A.insert(20, "S20");
        A.insert(30, "S30");
        A.insert(40, "S40");
        A.insert(50, "S50");

        System.out.println("BST A: ");
        A.inorder();

        BST B = new BST();
        B.insert(30, "S30");
        B.insert(20, "S20");
        B.insert(40, "S40");
        B.insert(10, "S10");
        B.insert(50, "S50");
        System.out.println("\nBST B: ");
        B.inorder();

    }
}
