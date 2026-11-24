public class TestSinglyLinkedList {
    public static void main(String[] args) {
        // 1. طباعة الاسم الكامل


        // 2. إنشاء قائمتين من نوع Integer
        SinglyLinkedList<Integer> list1 = new SinglyLinkedList<>();
        SinglyLinkedList<Integer> list2 = new SinglyLinkedList<>();

        // 3. استخدام addFirst مع list1 وإدخال العناصر (100, 200, 300, 400)
        list1.addFirst(100);
        list1.addFirst(200);
        list1.addFirst(300);
        list1.addFirst(400);

        System.out.println("List 1:");
        list1.forwardTraversal();

        // 4. استخدام addLast مع list2 وإدخال نفس العناصر (100, 200, 300, 400)
        list2.addLast(100);
        list2.addLast(200);
        list2.addLast(300);
        list2.addLast(400);

        System.out.println("List 2:");
        list2.forwardTraversal();

        // 6. اختبار دالة contains مع list2 (البحث عن 900 ثم 100، وكذلك 300 و 500 كأمثلة إضافية)
        System.out.println("Does list2 contain 900? " + list2.contains(900));
        System.out.println("Does list2 contain 100? " + list2.contains(100));
        System.out.println("Does list2 contain 300? " + list2.contains(300));
        System.out.println("Does list2 contain 500? " + list2.contains(500));

        // 7. إنشاء قائمة إضافية من نوع String واختبارها (List 3)
        SinglyLinkedList<String> list3 = new SinglyLinkedList<>();
        list3.addLast("ABC");
        list3.addLast("DEF");
        list3.addLast("GHI");
        list3.addLast("JKL");

        System.out.println("List 3:");
        list3.forwardTraversal();
        System.out.println("Does list3 contain ABC? " + list3.contains("ABC"));
    }
}