package datastructure.queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(10);
        queue.print();
        queue.enqueue(20);
        queue.print();
        queue.enqueue(30);
        queue.print();
        queue.enqueue(40);
        queue.print();

        System.out.println(queue.dequeue().value);
        queue.print();
        System.out.println(queue.dequeue().value);
        queue.print();
        System.out.println(queue.dequeue().value);
        queue.print();
        queue.dequeue();
        queue.print();
        
    }
}
