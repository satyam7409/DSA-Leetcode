import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        BinaryTree tree = new BinaryTree();
//        Scanner scanner = new Scanner(System.in);
//        tree.populate(scanner);
//        tree.display();

        BST tree = new BST();
        int[] nums = {4,23,5,2,5,25,64,22};
        tree.populate(nums);
        tree.display();
    }
}