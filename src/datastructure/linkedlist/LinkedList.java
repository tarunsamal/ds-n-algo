package datastructure.linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    /*
        Creates the linked list
     */
    public LinkedList(int value) {
        Node node = new Node(value);
        head = node;
        tail = node;
        length = 1;
    }

    public int length() {
        return length;
    }

    /*
        print head tail length and list element structure
     */
    public void print() {
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
            System.out.print("->");
            temp = temp.next;
        }
        System.out.println();
        System.out.println("#####################");
    }

    /*
        Add the element to end of the list
     */
    public void append(int value) {
        Node node = new Node(value);
        if (length == 0) {
            head = node;
            tail = node;
            length = 1;
            return;
        }
        tail.next = node;
        tail = node;
        length++;
    }

    /*
        removes the last element of the node
        1. traverse to end of list
        2. make previous element as last element
        3. if no element is present , make head and tail as null
     */
    public Node removeLast() {
        if (length == 0) {
            return null;
        }
        Node temp = head;
        Node prev = head;
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        // we are at the end of the list, prev.next is last node
        tail = prev;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    /*
    Add node at the beginning of list
     */
    public void prepend(int value) {
        Node node = new Node(value);
        if (length == 0) {
            head = node;
            tail = node;
            length = 1;
            return;
        }
        node.next = head;
        head = node;
        length++;
    }

    /*
        removes the first element from the list
     */
    public Node removeFirst() {
        if (length == 0) {
            return null;
        }
        Node removedNode = head;
        head = head.next;
        length--;
        if (length == 0) {
            tail = head;
        }
        removedNode.next = null;
        return removedNode;
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

    /*
        insert the value at specified index in the list
     */
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
        Node prev = get(index - 1);
        Node curr = get(index);

        Node node = new Node(value);
        node.next = curr;
        prev.next = node;
        length++;
        return true;
    }

    /*
        remove the value from list at any given index
     */
    public Node remove(int index) {
        if (index < 0 || index >= length) {
            return null;
        }
        if (index == 0) {
            return removeFirst();
        }
        if (index == length - 1) {
            return removeLast();
        }
        Node prev = get(index - 1);
        Node curr = get(index);
        prev.next = curr.next;
        length--;
        return curr;
    }

    /*
        reverse the given list
            1. fist swap head and tail
            2. correct link direction
     */
    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;

        Node before = null;
        Node after = temp.next;

        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
