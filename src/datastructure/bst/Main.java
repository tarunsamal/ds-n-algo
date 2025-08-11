package datastructure.bst;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        System.out.println(bst.root);

        bst.insert(47);
        bst.insert(21);
        bst.insert(76);
        bst.insert(18);
        bst.insert(27);
        bst.insert(52);
        bst.insert(82);

        System.out.println(bst.root.right.left.value);
        System.out.println(bst.contains(52));
        System.out.println(bst.contains(10));
        System.out.println(bst.contains(82));


    }
}
