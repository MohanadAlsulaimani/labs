import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {




        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> map = new HashMap();
        int choice;

        do {

            System.out.println("===== Menu =====");
            System.out.println("1. Insert an element (Key, Value)");
            System.out.println("2. Update existing element");
            System.out.println("3. Deleta an element");
            System.out.println("4. Print elements");
            System.out.println("5. Exit");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter integer key: ");
                    int key = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter string value: ");
                    String value = sc.nextLine();
                    map.put(key, value);
                    System.out.println("Element inserted successfully.");
                    break;

                case 2:
                    System.out.println("Enter key value: ");
                    int updatekey = sc.nextInt();
                    sc.nextLine();

                    if (map.containsKey(updatekey)) {
                        System.out.println("Enter new value: ");
                        String newvalue = sc.nextLine();
                        map.put(updatekey, newvalue);
                        System.out.println("Element updated successfully.");
                    } else {
                        System.out.println("Key not found.");
                    }
                    break;

                case 3:
                    System.out.println("enter key to delete: ");
                    int deletekey = sc.nextInt();
                    if (map.containsKey(deletekey)) {
                        map.remove(deletekey);
                        System.out.println("Element deleted successfully.");
                    } else {
                        System.out.println("Key not found.");
                }
                    break;

                case 4:
                    if (map.isEmpty()) {
                        System.out.println("HashMap is empty.");
                    } else {
                        System.out.println("HashMap elements: ");
                        for (Map.Entry<Integer, String> entry : map.entrySet()) {
                            System.out.println("Key - " + entry.getKey() + ", Value - " + entry.getValue());
                        }
                    }
                    break;

                case 5:
                   // Exit
                    break;

                default:
                    System.out.println("Invalid choice! please try again. ");

            }



        }
        while(choice !=5);

        sc.close();
    }
}
