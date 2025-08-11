package datastructure.hashtable;


public class Main {

    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
        hashTable.print();
        System.out.println(hashTable.keys());
        hashTable.set("abcd", 123);
        hashTable.set("dcba", 456);
        hashTable.set("efgh",789);
        hashTable.set("hefg",780);
        hashTable.print();
        System.out.println(hashTable.get("abcd"));
        System.out.println(hashTable.get("hefg"));
        System.out.println(hashTable.keys());



        //System.out.println(HashTable.hash("testing"));
    }

}
