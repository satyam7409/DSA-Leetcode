import java.sql.SQLOutput;
import java.util.Scanner;

public class BinaryTree {

    //Default constructor.
    public BinaryTree(){

    }

    //node class
    private static  class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }

    private Node root;

    public void populate(Scanner scanner){
        System.out.println("Enter the value of root:");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(root, scanner);
    }

    private void populate(Node root, Scanner scanner){
        System.out.println("Do u want to put on left of" + root.value);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value to add on left of:" + root.value);
            int value = scanner.nextInt();
            root.left = new Node(value);
            populate(root.left, scanner);
        }
        System.out.println("Do u want to put on right of" + root.value);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value to put on the righgt of" + root.value);
            int value = scanner.nextInt();
            root.right = new Node(value);
            populate(root.right, scanner);
        }
    }

//display tress
    public void display(){
        display(root, "");
    }

    private void display(Node node, String intend){
        if(node == null){
            return;
        }
        System.out.println(node.value);
        display(node.left, intend+ "/t");
        display(node.right, intend+ "/t");
    }

}
