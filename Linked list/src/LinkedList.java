public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList(){
        this.size = 0;
    }

    //Node class
    public class Node {
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
        }

        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    //to insert element at first
    public void insertFirst(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    //to insert the element at last
    public void insertLast(int data){
        if(tail == null){
            insertFirst(data);
            return;
        }
        Node node = new Node(data);
        tail.next = node;
        tail = node;
        size++;
    }

    //to display
    public void display(){
        Node temp =head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("End");
    }

    //insert element at the given index
    public void insert(int data , int index){
        if(index == 0){
            insertFirst(data);
            return;
        }
        if(index == size){
            insertLast(data);
            return;
        }
        Node temp = head;

        for(int i =1; i<index; i++){
            temp = temp.next;
        }
        Node node = new Node(data, temp.next);
        temp.next = node;
        size++;
    }
    public void insertRec(int index, int data){
        head = insertRec(index,data,head);
    }
    private Node insertRec(int index,int data, Node node){
        if(index == 0){
            Node temp = new Node(data,node);
            size++;
            return temp;
        }
        node.next = insertRec(index-1,data,node.next);
        return node;
    }
    //to get the node by its index;
    public Node get(int index){
        Node temp = head;
        for(int i=0; i<index; i++){
            temp = temp.next;
        }
        return temp;
    }

//delete first element from the singly linked list
    public int deleteFirst(){
        int val = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    //delete the last element from the signly list;
    public int deletelast(){
        if (size <= 1) {
            return deleteFirst();
        }
        Node node = get(size-2);
        tail = node;
        node.next = null;
        size--;
        return node.data;
    }

    //delete with index
    public int delete(int index){
        if (index == 0) {
            return deleteFirst();
        }
        if(index == size-1){
           return  deletelast();
        }

        Node prev = get(index - 1);
        int val = prev.next.data;

        prev.next = prev.next.next;
        size--;
        return val;
    }

    //merge two sorted list

}

