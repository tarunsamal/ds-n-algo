package datastructure.recursion;

public class CallStack {
    public static void main(String[] args) {
        one();
        System.out.println("end");
    }

    public static void one(){
        two();
        System.out.println("one");
    }
    public static void two(){
        three();
        System.out.println("two");
    }
    public static void three(){
        System.out.println("three");
    }
}
