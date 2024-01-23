public class TestSLL{
    public static void main(String[] args){
        SinglyLinkedList<Integer> intList = new SinglyLinkedList<>();
        SinglyLinkedList<String> stringList = new SinglyLinkedList<>();

        System.out.println(intList.isEmpty());
        System.out.println(stringList.isEmpty());
        
        System.out.println("intList size: " + intList.length());
        System.out.println("stringList size: " + stringList.length());

        intList.add(10);
        intList.add(9);
        intList.add(8);

        System.out.println("intList contains 5: " + intList.contains(5));
        System.out.println("intList contains 9: " + intList.contains(9));

        stringList.add("Aman");
        stringList.add("Rohan");
        stringList.add("Sumit");

        System.out.println("stringList contains Rohit " + stringList.contains("Rohit"));
        System.out.println("stringList contains Rohan " + stringList.contains("Rohan"));

        System.out.println("intList: " + intList);
        System.out.println("stringList: " + stringList);

        System.out.println("intList size: " + intList.length());
        System.out.println("stringList size: " + stringList.length());

        System.out.println("First element of intList: " + intList.peekFirst());
        System.out.println("Last element of intList: " + intList.peekLast());

        System.out.println("First element of stringList: " + stringList.peekFirst());
        System.out.println("Last element of stringList: " + stringList.peekLast());

        System.out.println("index of 8 in inList: " + intList.indexOf(8));
        System.out.println("index of 12 in inList: " + intList.indexOf(12));

        System.out.println("index of Aman in stringList: " + stringList.indexOf("Aman"));
        System.out.println("index of Raju in stringList: " + stringList.indexOf("Raju"));

        intList.addFirst(11);
        stringList.addFirst("Suman");

        System.out.println("intList: " + intList);
        System.out.println("stringList: " + stringList);

        intList.addAt(11, 2);
        stringList.addAt("Vanshi", 3);

        System.out.println("intList: " + intList);
        System.out.println("stringList: " + stringList);

        intList.removeFirst();
        stringList.removeFirst();

        System.out.println("intList: " + intList);
        System.out.println("stringList: " + stringList);

        intList.removeLast();
        stringList.removeLast();

        System.out.println("intList: " + intList);
        System.out.println("stringList: " + stringList);

        intList.removeAt(1);
        stringList.removeAt(1);

        System.out.println("intList: " + intList);
        System.out.println("stringList: " + stringList);

        intList.clear();
        stringList.clear();

        System.out.println("intList: " + intList);
        System.out.println("stringList: " + stringList);

        System.out.println("intList size: " + intList.length());
        System.out.println("stringList size: " + stringList.length());
    }
}