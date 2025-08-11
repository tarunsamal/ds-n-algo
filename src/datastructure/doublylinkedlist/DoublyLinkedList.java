package datastructure.doublylinkedlist;

public class DoublyLinkedList {

    class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
        }
    }

    private int length;
    private Node head;
    private Node tail;

    public DoublyLinkedList(int value) {
        Node node = new Node(value);
        head = node;
        tail = node;
        length = 1;
    }

    public Node remove(int index) {
        if (length == 0 || index < 0 || index > length) {
            return null;
        }
        if (index == 0) {
            return removeFirst();
        }
        if (index == 1) {
            return removeLast();
        }
        Node curr = get(index);
        curr.prev.next = curr.next;
        curr.next.prev = curr.prev;
        length--;
        curr.prev = null;
        curr.next = null;
        return curr;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > length) {
            return false;
        }
        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == length) {
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node indexNode = get(index);
        newNode.prev = indexNode.prev;
        newNode.next = indexNode;
        indexNode.prev.next = newNode;
        indexNode.prev = newNode;
        length++;
        return true;
    }

    /*
       get the element from particular index from the list, index starts from 0
    */
    public Node get(int index) {
        if (length == 0) {
            return null;
        }
        if (index < 0) {
            return null;
        }
        if (index >= length) {
            return null;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    /*
        set the element of particular index from the list, index starts from 0
        returns true if element is set and false if not set
     */
    public boolean set(int index, int value) {
        Node node = get(index);
        if (node == null) {
            return false;
        }
        node.value = value;
        return true;
    }

    public Node removeLast() {
        if (length == 0) {
            return null;
        }
        if (length == 1) {
            Node temp = tail;
            head = null;
            tail = null;
            length--;
            return temp;
        }

        Node temp = tail;
        tail = tail.prev;
        tail.next = null;
        temp.prev = null;
        length--;

        return temp;

    }

    public void append(int value) {
        Node node = new Node(value);
        if (length == 0) {
            head = node;
            tail = node;
            length++;
            return;
        }
        tail.next = node;
        node.prev = tail;
        tail = node;
        length++;
    }

    public void prepend(int value) {
        if (length == 0) {
            append(value);
            return;
        }
        Node node = new Node(value);
        head.prev = node;
        node.next = head;
        head = node;
        length++;
    }

    public Node removeFirst() {
        if (length < 2) {
            return removeLast();
        }
        Node temp = head;
        head = head.next;
        head.prev = null;
        temp.next = null;
        length--;
        return temp;

    }

    public void print() {
        System.out.println("##########################");
        System.out.println("Length : " + length);
        if (length == 0) {
            System.out.println("-");
            return;
        }
        System.out.println("Head : " + head.value);
        System.out.println("Tail : " + tail.value);
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value);
            System.out.print("<->");
            temp = temp.next;
        }
        System.out.println();
    }

}
