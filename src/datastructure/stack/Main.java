package datastructure.stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(10);
        stack.print();
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.print();

        System.out.println(stack.pop().value);
        System.out.println(stack.pop().value);
        stack.print();
        System.out.println(stack.pop().value);
        System.out.println(stack.pop().value);
        stack.print();
        System.out.println(stack.pop().value);
        stack.print();
    }
}
