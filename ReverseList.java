public class ReverseList {
    static Node head;
 
    static class Node {
 
        int data;
        Node next;
 
        Node(int d)
        {
           this.data = d;
            this.next = null;
        }
    }
     /* Function to reverse the linked list */
     Node reverse()
     {
        // Node node = head ;
         Node prev = null;
         Node current = head;
         Node forword = null;
         while (current != null) {
             forword = current.next;
             current.next = prev;
             prev = current;
             current = forword;
         }
         head = prev;
         return head;
     }
      // prints content of double linked list
    void printList()
    {
        Node temp = head ;
        while (temp != null) {
            System.out.print(temp.data + "--> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        ReverseList list = new ReverseList();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);
 
        System.out.println("Given Linked list");
        list.printList();
        head = list.reverse();
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList();
        
    }
}
