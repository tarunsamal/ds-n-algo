package datastructure.doublylinkedlist;

public class Main {
    public static void main(String[] args) {
        //Doubly Linked List Creation
        DoublyLinkedList list = new DoublyLinkedList(10);
        list.print();

        //attach new value to Doubly Linked List at the end
        list.append(20);
        list.append(30);
        list.print();

        //Delete Last Element from  Doubly Linked List
        System.out.println(list.removeLast().value);
        list.print();
        System.out.println(list.removeLast().value);
        list.print();
        System.out.println(list.removeLast().value);
        list.print();
        //System.out.println(list.removeLast().value); will generate NPE since empty list

        list.prepend(10);
        list.print();
        list.prepend(20);
        list.print();
        list.prepend(30);
        list.print();

        System.out.println(list.removeFirst().value);
        list.print();
        System.out.println(list.removeFirst().value);
        list.print();
        System.out.println(list.removeFirst().value);
        list.print();
        //System.out.println(list.removeFirst().value); // will throw NPE as list is empty

        list.append(10);
        list.append(20);
        list.append(30);
        list.print();

        System.out.println(list.get(1).value);
        list.print();
        System.out.println(list.set(1, 25));
        list.print();

        System.out.println(list.insert(1, 15));
        list.print();
        System.out.println(list.insert(0, 5));
        list.print();
        System.out.println(list.insert(5, 40));
        list.print();
        System.out.println(list.insert(5, 35));
        list.print();

        System.out.println(list.remove(2).value);
        list.print();
        System.out.println(list.remove(4).value);
        list.print();
    }
}
