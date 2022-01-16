package BinaryTree12Jan;
import java.util.*;
public class SumAllNodes {
    static int sum=0;
    static class Node {
        int key;
        Node left, right;
         Node(int key) {
         this.key=key;
         left=right=null;
         }
        }
        public static int SumOfNodes(Node root) {
            if(root==null)
             return 0;
             System.out.print(root.key+" ");
             sum=sum+root.key;
             SumOfNodes(root.left);
            SumOfNodes(root.right);
            return sum;
        }
        public static void main(String[] agrs){
            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.right.right = new Node(6);
            System.out.println("\nSum of all Nodes : "+ SumOfNodes(root));
    }
}
