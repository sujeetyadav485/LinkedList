// import AddFirst.Node;

public class ReverseList2 {
  static  Node head ;

    public static class Node{

        int data; 

        Node next ;
        Node(int data)
        {
            this.data = data;

            this.next = null ;
        }

    }
  Node reverseList()

   {

    if(head==null || head.next==null)
    {
     return  head;
    }
    Node  previous = null ;
    Node  current = head ;

    Node forword = null ;

   
    while(current!=null)
    {
        forword = current.next;
          current.next=previous;
        previous = current ;
        current = forword ;
    }
    head = previous;
    return head ;

   }
 /* Function to reverse the linked list */
//  Node reverse()
//  {
//     // Node node = head ;
//      Node prev = null;
//      Node current = head;
//      Node forword = null;
//      while (current != null) {
//          forword = current.next;
//          current.next = prev;
//          prev = current;
//          current = forword;
//      }
//      head = prev;
//      return head;
//  }
   public void printList()
   {
    if(head==null)
    {
        System.out.println("List is Empty");
        return ;
    }

    Node curr =  head ;

    while(curr!=null)
    {
        System.out.print(curr.data+"-->");

        curr = curr.next ;
    }
    System.out.println("null");
   }
    public static void main(String[] args) {

        ReverseList2 list =  new ReverseList2();

        list.head = new Node(1);

        list.head.next = new Node(2);

        list.head.next.next = new Node(3);

        list.head.next.next.next =  new Node(5);

        System.out.println("Given list");

        list.printList();

        System.out.println("Reverse list ");

        // list.printList();

       list.reverseList();

        list.printList();
        
    }
}
