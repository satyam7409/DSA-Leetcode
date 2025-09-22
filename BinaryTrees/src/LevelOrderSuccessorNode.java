//import java.util.LinkedList;
//import java.util.Queue;
//
//public class LevelOrderSuccessorNode {
//    //for the given node value , we have to return the next node to it level wise
//    public Node findSuccessor(Node root, int key) {
//        if (root == null) return null;
//
//        Queue<Node> queue = new LinkedList<>();
//        queue.offer(root);
//
//        while (!queue.isEmpty()) {
//            Node current = queue.poll();
//
//            // add children first
//            if (current.left != null) queue.offer(current.left);
//            if (current.right != null) queue.offer(current.right);
//
//            // if current is the target node, break
//            if (current.val == key) {
//                break;
//            }
//        }
//
//        return queue.peek(); // the next node in BFS
//    }
//}
