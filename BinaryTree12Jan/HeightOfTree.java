package BinaryTree12Jan;

public class HeightOfTree {
    static class Node {
        int key;
        Node left, right;
        Node (int key) {
            this.key=key;
            left=right=null;
        }
    }
    static int getHeight(Node node) {
        if(node==null) {
        return -1;
    }
    else {
        int leftHeight=getHeight(node.left);
        int rightHeight=getHeight(node.right);
        if(leftHeight >= rightHeight) {
            return (leftHeight+1);
        }
        else
        return (rightHeight+1);
    }
}

    
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(7);
        root.right = new Node(8);
        root.left.left = new Node(4);
        root.left.right = new Node(6);
        root.right.right = new Node(9);
        System.out.println(getHeight(root));


    
        

    }
}
