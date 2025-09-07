public class DoublyLinkedList {
    private Node head;
    private int size;

    public DoublyLinkedList(){
        size = 0;
    }

    public class Node{
        int data;
        Node next;
        Node prev;


        public Node(int val){
            this.data = val;
        }
        public Node(int val, Node next, Node prev){
            this.data = val;
            this.next = next;
            this.prev = prev;
        }
    }
    public void insertAtFirst(int data){
        Node node = new Node(data);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
        size++;
    }
    public void inserAtLast(int data){
        Node node = new Node(data);
        node.next = null;

        Node last = head;
        if (head == null){
            node.prev = null;
            head = node;
            return;
        }

        while(last != null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
        size++;
    }

    public Node get(int index){
        Node temp = head;
        for(int i=0; i<index; i++){
            temp = temp.next;
        }
        return temp;
    }

    public void insert(int index , int data){
        if(index == 0){
            insertAtFirst(data);
            return;
        }
        if(index == size){
            inserAtLast(data);
            return;
        }
        Node temp = head;
        for(int i = 1; i<index; i++){
            temp = temp.next;
        }
        Node node = new Node(data);

        node.next = temp.next;
        node.prev = temp;

        temp.next.prev = node;
        temp.next=node;

    }
}
