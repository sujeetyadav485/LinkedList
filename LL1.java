import java.util.*;
public class LL1{

Node head ;
public class Node
{
   
    int data ;
    Node next ;

    Node(int data){
        this.data = data ;
        this.next = null ;

    }
}
    public void InsertAtHead(int data)
    {
        Node temp = new Node(data);

        // Node temp  = head ;
        
        temp.next = head;
        head = temp ;

        temp = temp.next ;

    }
    public void  printList()
    {
        if(head==null)
        {
          System.out.println("List is Empty :");
          return ;
        }

        Node curr = head ;

        while(curr!=null)
        {
            System.out.print(curr.data+"---> ");
            curr = curr.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {

        LL1 list  = new LL1();

       list.InsertAtHead(12);
       
        list.printList();
        list.InsertAtHead(45);
        list.InsertAtHead(33);
        list.InsertAtHead(20);

        list.printList(); 
        
    }

}