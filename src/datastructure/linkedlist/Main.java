package datastructure.linkedlist;

public class Main {
    public static void main(String[] args) {
        /*Test : Create*/
        LinkList list = new LinkList(10);
        list.print();

        /*Test : Append*/
        list.append(20);
        list.print();
        list.append(30);
        list.print();

        /*Test : Remove from list end */
        System.out.println(list.removeLast().value);
        list.print();
        System.out.println(list.removeLast().value);
        list.print();
        System.out.println(list.removeLast().value);
        list.print();
        //System.out.println(list.removeLast().value); This will throw NullPointerException Since we don't have any element in list

        /*Test : Add in the beginning of list*/
        list.prepend(10);
        list.print();
        list.prepend(20);
        list.print();
        list.prepend(30);
        list.print();

        /*Test : Remove from the beginning of list*/
        System.out.println(list.removeFirst().value);
        list.print();
        System.out.println(list.removeFirst().value);
        list.print();
        System.out.println(list.removeFirst().value);
        list.print();
        //System.out.println(list.removeFirst().value); - will rsult in NPE since no value left in list

        /*Test : Add to the beginning of list*/
        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);
        list.append(50);
        list.print();

        /*Test : Fetch Node based on list index*/
        System.out.println(list.get(4).value);
        System.out.println(list.get(0).value);
        //System.out.println(list.get(5).value); - will return NPE as we are accessing index which not exist

        /*Test : Set Node value based on list index*/
        list.print();
        list.set(2, 35);
        System.out.println(list.set(0, 15)); //first element
        System.out.println(list.set(list.length()-1, 55)); //last element
        System.out.println(list.set(10, 15)); //not exists
        list.print();

        /*Test : insert new Node based on list index*/
        System.out.println(list.insert(0, 5));
        list.print();
        System.out.println(list.insert(list.length(), 65));
        list.print();
        System.out.println(list.insert(3, 25));
        list.print();

        /*Test : remove exiting Node present on list index*/
        System.out.println(list.remove(0).value);
        list.print();
        System.out.println(list.remove(2).value);
        list.print();
        System.out.println(list.remove(list.length()-1).value);
        list.print();

        /*Test : reverse the list*/
        list.reverse();
        list.print();
        list.reverse();
        list.print();
    }

}
