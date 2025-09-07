
public class FirstLinkedList {
    public static void main(String[] args) {
//        LinkedList list = new LinkedList();
//        list.insertFirst(1);
//        list.insertLast(9);
//        list.insert(2,1);
//        list.display();
//        System.out.println(list.delete(1));
//        list.display();
        LinkedList list = new LinkedList();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertRec(2,9);
        list.display();
    }
}
