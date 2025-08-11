package datastructure.stack;

public class Stack {
    private Node top;
    private int height;
    class Node {
        int value;
        Node next;
        public Node(int value){
            this.value = value;
        }
    }

    public Stack(int value){
        Node node = new Node(value);
        top = node;
        height = 1;
    }

    public void push(int value){
        Node node = new Node(value);
        if (height == 0) {
            top = node;
            height = 1;
            return;
        }
        node.next = top;
        top = node;
        height++;
    }

    public Node pop() {
        if (height == 0) {
            return null;
        }
        Node temp = top;
        top = top.next;
        temp.next = null;
        height--;
        return temp;
    }

    public void print() {
        if (height == 0) {
            System.out.print("TOP - BOTTOM");
            return;
        }
        System.out.println("######");
        Node temp = top;
        System.out.print("TOP << ");
        while (temp != null) {
            System.out.print(temp.value);
            System.out.print(" << ");
            temp = temp.next;
        }
        System.out.print("BOTTOM");
        System.out.println();
        System.out.println("######");
    }


}
