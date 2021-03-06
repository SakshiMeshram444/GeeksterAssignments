package LinkedList10Jan;
import java.util.*;
public class InsertionIndexValue {
    Node head;
  static  class Node{
    	int data;
    	Node next;
    	Node(int data){
    		this.data=data;
    		next=null;
    	}
    }


  static InsertionIndexValue insert(InsertionIndexValue l1,int data){
      Node new_node=new Node(data);
      if(l1.head==null){
          l1.head=new_node;
      }
      else{
          Node curr=l1.head;
          while(curr.next!=null){
              curr=curr.next;
          }
          curr.next=new_node;
      }
      return l1;
  }
  public static void GetNth(InsertionIndexValue l1, int index) {
	  Node curr=l1.head;
	  int count=0;
	  while(curr!=null) {
		  if(count==index) {
			  System.out.println(curr.data);
		  }
//		  System.out.println(curr.data);
		  count++;
		  curr=curr.next;
	  }
  }
    
	public static void main(String[] args) {
		InsertionIndexValue l1=new InsertionIndexValue();
		insert(l1,1);
		insert(l1,2);
		insert(l1,3);
		insert(l1,4);
		insert(l1,5);
		insert(l1,6);
		insert(l1,7);
		insert(l1,8);
	GetNth(l1,3);

	}

}
