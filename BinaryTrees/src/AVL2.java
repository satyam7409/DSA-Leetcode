public class AVL2 {

    public class Node{
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value){
            this.value = value;
        }
    }

    private Node root;

    public AVL2(){}

    public int returnHeight(Node node){
        if(root == null){
            return -1;
        }
        return node.height;
    }

    public Node insert(int value){
        root = insert(root, value);
        return root;
    }

    private Node insert(Node node, int value){
        if(node == null){
            new Node(value);
        }
        if(value<node.val){
            node.left = insert(node.left, value);
        }
        if(value>node.val){
            node.right = insert(node.right, value);
        }

        node.height = Math.max(returnHeight(node.left) , returnHeight(node.right));
        return rotate(node);
    }

    private Node rotate(Node node){
        
    }
}
