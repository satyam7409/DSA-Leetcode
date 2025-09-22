public class AVLTree {
    public class Node {
        private int value;
        private AVLTree.Node left;
        private AVLTree.Node right;
        private int height;


        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private AVLTree.Node root;

    public AVLTree() {
    }

    public int height(AVLTree.Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int value) {
        root = insert(value, root);
    }

    public void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }

    private AVLTree.Node insert(int value, AVLTree.Node node) {
        if (node == null) {
            node = new AVLTree.Node(value);
            return node;
        }

        if (value < node.value) {
            node.left = insert(value, node.left);
        } else if (value > node.value) {
            node.right = insert(value, node.right);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return rotate(node);
    }

    private Node rotate(Node node){
        if(height(node.left) - height(node.left) > 0){
            //left heavy
            if(height(node.left.left) - height(node.left.right) > 0){
//                left left heavy
                rightRotate(node);
            }
            if(height(node.left.left) - height(node.left.right) < 0){
                //left right heavy
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }


        if(height(node.left) - height(node.left) < 0){
            //right heavy
            if(height(node.right.left) - height(node.right.right) < 0){
//                right right heavy
                leftRotate(node);
            }
            if(height(node.right.left) - height(node.right.right) > 0){
                //left right heavy
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
    }

    public Node rightRotate(Node p) {
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.height = Math.max(height(p.left), height(p.right) + 1);
        c.height = Math.max(height(c.left), height(c.right) + 1);

        return c;
    }

    public Node leftRotate(Node c) {
        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;

        p.height = Math.max(height(p.left), height(p.right) + 1);
        c.height = Math.max(height(c.left), height(c.right) + 1);

        return p;
    }

    public boolean isBalanced() {
        return isBalanced(root);
    }

    private boolean isBalanced(AVLTree.Node node) {
        if (node == null) return true;

        return Math.abs(height(node.left) - height(node.right)) <= 1
                && isBalanced(node.left)
                && isBalanced(node.right);
    }

    public void display() {
        display(this.root, "Root Node: ");
    }

    private void display(AVLTree.Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.value);
        display(node.left, "Left child of " + node.value + " : ");
        display(node.right, "Right child of " + node.value + " : ");
    }
}
