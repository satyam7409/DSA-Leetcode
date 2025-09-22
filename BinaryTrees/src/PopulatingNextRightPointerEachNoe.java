//class PopulatingNextRightPointerEachNoe {
//    public Node connect(Node root) {
//        if(root == null){
//            return root;
//        }
//
//        Deque<Node> queue = new LinkedList<>();
//        queue.addLast(root);
//
//        while(!queue.isEmpty()){
//            int levelHeight = queue.size();
//            Node prev = null;
//            for(int i = 0; i<levelHeight; i++){
//                Node currentNode = queue.removeFirst();
//                if(prev != null){
//                    prev.next = currentNode;
//                }
//                prev = currentNode;
//                if(currentNode.left != null){
//                    queue.addLast(currentNode.left);
//                }
//                if(currentNode.right != null){
//                    queue.addLast(currentNode.right);
//                }
//            }
//        }
//        return root;
//    }
//}