import java.util.*;
public class DeleteMiddle {
    Node head ;

    public class Node{
      int data ;

      Node next ;
      Node (int data)
      {
        this.data = data ;
        this.next = null ;
      }
    }
    public void AddTail(int data)
    {
        Node newnode1 = new Node(data);

        if(head == null)
        {
            head = newnode1 ;

            return ;

        }
        Node current = head ;

        while(current.next!=null)
        {
            current  = current.next ;
        }
        current.next = newnode1 ;
    }

   public void  printList()
   {
    if(head==null)
    {
        System.out.println("List is empty");
        return ;
    }
    Node curr = head;

    while(curr!=null)
    {
        System.out.print (curr.data+"-->");

        curr = curr.next ;
    }
    System.out.println("null");
   }
   public void deleteMid(int position)
   {
    Node temp =  head ;
    // Delete first or Stsrt node

    if(position==1)
    {
        head = head.next ;
    }
    else{
        Node curr = head ;

        Node previousNode = null ;

        int count = 1; 
        while(count<position-1)
        {
            previousNode = curr;
            curr = curr.next ;

            count++ ;

        }
        previousNode.next = curr.next;
    }
   }
    public static void main(String[] args) {

        DeleteMiddle list =  new DeleteMiddle();

        list.AddTail(12);
        list.AddTail(10);
        list.AddTail(35);
        list.AddTail(56);
        list.AddTail(65);
        list.printList();

        list.deleteMid(4);
        list.printList();
        list.deleteMid(1);
        list.deleteMid(4);
        list.printList();
        
    }
}
