public class TestDLL {
    public static void main(String[] args){
        DoublyLinkedList<Integer> intDList = new DoublyLinkedList<>();
        DoublyLinkedList<String> stringDList = new DoublyLinkedList<>();

        System.out.println("Initial size of intDList: " + intDList.length());
        System.out.println("Initial size of stringDList: " + stringDList.length());

        System.out.println("intDList: " + intDList);
        System.out.println("stringDList: " + stringDList);

        intDList.addLast(10);
        stringDList.addLast("Rohit");
        intDList.addLast(20);
        stringDList.addLast("Kumar");
        intDList.addLast(30);
        stringDList.addLast("Agrawal");

        System.out.println("intDList: " + intDList);
        System.out.println("stringDList: " + stringDList);

        System.out.println("intDList size: " + intDList.length());
        System.out.println("stringDList size: " + stringDList.length());

        intDList.addFirst(9);
        stringDList.addFirst("Kumar");
        intDList.addFirst(8);
        stringDList.addFirst("Amit");

        System.out.println("intDList: " + intDList);
        System.out.println("stringDList: " + stringDList);

        System.out.println("intDList size: " + intDList.length());
        System.out.println("stringDList size: " + stringDList.length());

        intDList.addAt(100, 100);
        stringDList.addAt("Duggal", 100);

        System.out.println("intDList: " + intDList);
        System.out.println("stringDList: " + stringDList);

        System.out.println("intDList size: " + intDList.length());
        System.out.println("stringDList size: " + stringDList.length());

        intDList.addAt(11, 3);
        stringDList.addAt("Sahu", 2);

        System.out.println("intDList: " + intDList);
        System.out.println("stringDList: " + stringDList);

        System.out.println("intDList size: " + intDList.length());
        System.out.println("stringDList size: " + stringDList.length());

        intDList.removeFirst();
        stringDList.removeFirst();

        System.out.println("intDList: " + intDList);
        System.out.println("stringDList: " + stringDList);

        System.out.println("intDList size: " + intDList.length());
        System.out.println("stringDList size: " + stringDList.length());
        
        intDList.removeLast();
        stringDList.removeLast();

        System.out.println("intDList: " + intDList);
        System.out.println("stringDList: " + stringDList);

        System.out.println("intDList size: " + intDList.length());
        System.out.println("stringDList size: " + stringDList.length());

        intDList.removeAt(2);
        stringDList.removeAt(2);

        System.out.println("intDList: " + intDList);
        System.out.println("stringDList: " + stringDList);

        System.out.println("intDList size: " + intDList.length());
        System.out.println("stringDList size: " + stringDList.length());

    }
}
