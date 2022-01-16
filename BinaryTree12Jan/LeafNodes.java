package BinaryTree12Jan;

public class LeafNodes {
    static class Node {
        int key;
        Node left, right;
         Node(int key) {
         this.key=key;
         left=right=null;
         }
        }
        public static void leafNode(Node root){
            if(root==null) return;
            if(root.left==null && root.right==null){
                System.out.print(" Leaf Node : "+ root.key);
            }
            leafNode(root.left);
            leafNode(root.right);
        }
        public static void main(String[] agrs){
            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.right.right = new Node(6);
            leafNode(root);
    }
}
