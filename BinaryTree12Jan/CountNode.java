package BinaryTree12Jan;
import java.util.*;
public class CountNode {
    static class Node{
        int key;
        Node left,right;
        Node(int key){
            this.key=key;
            left=right=null;
        }
    }
public static int countNode(Node root) {
  if(root==null) {
      return 0;
  }
  else {
      int leftCount=countNode(root.left);
      int rightCount=countNode(root.right);
      return 1+leftCount+rightCount;
  }
  }
  
  public static void main(String[] args) {
      Node root=new Node(1);
      root.left=new Node(4);
      root.right=new Node(3);
      root.left.left=new Node(6);
      root.left.right=new Node(8);
      root.right.right=new Node(9);
System.out.println("Total number of Node: "+ countNode(root));
  }


}
