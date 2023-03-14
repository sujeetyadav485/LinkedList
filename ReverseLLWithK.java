import java.util.*;
public class ReverseLLWithK {
    Node head; // head of list
  
    /* Linked list Node*/
    class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    Node reverse(Node head, int k)
    {
        if(head == null)
          return null;
        Node current = head;
        Node next = null;
        Node prev = null;
  
        int count = 0;
  
        /* Reverse first k nodes of linked list */
        while (count < k && current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }
  
        /* next is now a pointer to (k+1)th node
           Recursively call for the list starting from
           current. And make rest of the list as next of
           first node */
        if (next != null)
            head.next = reverse(next, k);
  
        // prev is now head of input list
        return prev;
    }
    void insert(int data)
        {
                Node NewNode = new Node(data);
                if(head ==null)
                {
                        head =  NewNode;
                        return;
                }
                // if LL is not empty 
                Node temp = head;
                while(temp.next!=null)
                        {
                                temp = temp.next;
                        }
                temp.next = NewNode;
                return;
        }
        void printList()
        {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        public static void main(String args[])
    {   
        Scanner sc = new Scanner(System.in);

                int n = sc.nextInt();
                int k = sc.nextInt();
                LinkedList llist = new LinkedList();
  
        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
         for(int i=0; i<n; i++)
                {
                        llist.insert(sc.nextInt());
                } 
                      
                System.out.println("Given Linked List");
                llist.printList();
          
                llist.head = llist.reverse(llist.head, 3);
          
                System.out.println("Reversed list");
                llist.printList();
            }
}
