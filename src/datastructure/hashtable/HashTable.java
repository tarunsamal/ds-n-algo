package datastructure.hashtable;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HashTable {
    private static int SIZE = 7;
    private Node[] table;

    class Node {
        String key;
        int value;
        Node next;

        public Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public HashTable() {
        table = new Node[SIZE];
    }
    
    public void print(){
        for (int i = 0; i< table.length; i++) {
            System.out.print("#" + i + "= [");
            Node temp = table[i];
            while (temp != null) {
                System.out.print("{" + temp.key + ", " + temp.value + "}");
                System.out.print("->");
                temp = temp.next;
            }
            System.out.print( " ]");
            System.out.println();
        }
        System.out.println("------------------------------");
    }

    public static int hash(String key) {
        return key.chars().reduce(0, (x, y) -> x + (y * 23)) % SIZE;
    }

    public boolean set(String key, int value) {
        if (key == null) {
            return false;
        }
        int hash = hash(key);
        Node node = table[hash];
        Node newNode = new Node(key, value);
        if (node == null) {
            table[hash] = newNode;
            return true;
        }
        Node temp = node;
        while (temp.next != null) {
            if (temp.key.equals(key)) {
                temp.value = value;
                return false;
            }
            temp = temp.next;
        }
        temp.next = newNode;
        return true;
    }

    public Integer get(String key) {
        int index = hash(key);
        if (table[index] == null){
            return null;
        }
        Node temp = table[index];
        while (temp != null){
            if (temp.key.equals(key)) {
                return temp.value;
            }
            temp = temp.next;
        }
        return null;
    }

    public List<String> keys() {
        List<String> keyList = new ArrayList<>();
        Arrays.stream(table).forEach(node -> {
            while (node != null){
                keyList.add(node.key);
                node = node.next;
            }
        });
        return keyList;
    }

}
