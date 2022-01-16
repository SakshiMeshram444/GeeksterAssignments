package BinaryTree12Jan;

 class Node {
int key;
Node left, right;
 Node(int key) {
 this.key=key;
 left=right=null;
 }
 
 public static void Inorder(Node root){
   if(root==null){
       return;
   }
   Inorder(root.left);
    System.out.print(root.key+" ");
    Inorder(root.right);
 } 
  public static void Preorder(Node root){
    if(root==null){
        return;
    }
        System.out.print(root.key+" ");
        Preorder(root.left);
        Preorder(root.right);
    }
    public static void Postorder(Node root){
        if(root==null){
            return;
        }
            Postorder(root.left);
            Postorder(root.right);  
            System.out.print(root.key+" "); 
    }
    public static void main(String[] agrs){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);
        System.out.print( "Inorder Tree : ");
        Inorder(root);
        System.out.println();
        System.out.print( "Preorder Tree : ");
        Preorder(root);
        System.out.println();
        System.out.print( "Postorder Tree : ");
        Postorder(root);
        System.out.println();
    }

    
}
