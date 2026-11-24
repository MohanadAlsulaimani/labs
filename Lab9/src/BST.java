public class BST {
    private static class Node {
        int key;
        String value;
        Node left;
        Node right;

        Node(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private Node root;

    public void insert(int key, String value) {
        if (value == null) {
            throw new IllegalArgumentException("Student name cannot be null.");
        }
        root = insertRecursively(root, key, value);
    }

    private Node insertRecursively(Node current, int key, String value) {
        if (current == null) return new Node(key, value);
        if (key < current.key) {
            current.left = insertRecursively(current.left, key, value);
        } else if (key > current.key) {
            current.right = insertRecursively(current.right, key, value);
        } else {
            // A duplicate ID updates the name; no duplicate node is created.
            current.value = value;
        }
        return current;
    }

    /** Returns the student's name or null when the ID is absent. */
    public String search( int key) {
        Node found = searchRecursively(root, key);
        return found == null ? null : found.value;
    }

    private Node searchRecursively(Node current, int key) {
        if (current == null || current.key == key) return current;
        if (key < current.key) return searchRecursively(current.left, key);
        return searchRecursively(current.right, key);
    }

    public void delete(int key) {
        root = deleteRecursively(root, key);
    }

    private Node deleteRecursively(Node current, int key) {
        if (current == null) return null;
        if (key < current.key) {
            current.left = deleteRecursively(current.left, key);
        } else if (key > current.key) {
            current.right = deleteRecursively(current.right, key);
        } else {
            if (current.left == null) return current.right;
            if (current.right == null) return current.left;
            Node successor = findMin(current.right);
            current.key = successor.key;
            current.value = successor.value;
            current.right = deleteRecursively(current.right, successor.key);
        }
        return current;
    }

    private Node findMin(Node current) {
        while (current.left != null) current = current.left;
        return current;
    }

    /** Prints all records in ascending order of student ID. */
    public void inorder() {
        inorderRecursively(root);
    }

    private void inorderRecursively(Node current) {
        if (current == null) return;
        inorderRecursively(current.left);
        System.out.println(current.key + " - " + current.value);
        inorderRecursively(current.right);
    }
}