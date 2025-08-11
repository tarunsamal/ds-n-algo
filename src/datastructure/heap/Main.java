package datastructure.heap;

public class Main {
    public static void main(String[] args) {
        Heap heap = new Heap();
        heap.print();

        heap.insert(99);
        heap.insert(72);
        heap.insert(61);
        heap.insert(58);
        heap.print();

        heap.insert(100);
        heap.print();

        heap.insert(75);
        heap.print();

        heap = new Heap();
        heap.insert(99);
        heap.insert(78);
        heap.insert(80);
        heap.insert(58);
        heap.insert(60);
        heap.insert(50);
        heap.insert(66);
        heap.print();

        System.out.println(heap.remove());
        heap.print();
        System.out.println(heap.remove());
        heap.print();
        System.out.println(heap.remove());
        heap.print();
    }
}
