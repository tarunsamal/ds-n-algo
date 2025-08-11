package datastructure.queue;

public class Queue {
    private Node first;
    private Node last;
    private int length;

    public Queue(int value) {
        Node node = new Node(value);
        first = node;
        last = node;
        length = 1;
    }

    public void print() {
        if (length == 0) {
            System.out.print("First - Last");
            return;
        }
        System.out.println("######");
        Node temp = first;
        System.out.print("FIRST << ");
        while (temp != null) {
            System.out.print(temp.value);
            System.out.print(" << ");
            temp = temp.next;
        }
        System.out.print("LAST");
        System.out.println();
        System.out.println("######");
    }

    public void enqueue(int value) {
        Node node = new Node(value);
        if (length == 0) {
            first = node;
            last = node;
            length = 1;
            return;
        }
        last.next = node;
        last = node;
        length++;
    }

    public Node dequeue() {
        if (length == 0) {
            return null;
        }
        Node temp = first;
        first = first.next;
        temp.next = null;
        length--;
        if (length == 0) {
            first = null;
            last = null;
        }
        return temp;
    }

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

}
