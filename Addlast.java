// import LL1.Node;

public class Addlast {
    Node head ;
    public class Node{
        int  data ;
        Node next ;
        Node(int data)
        {
            this.data = data ;

            this.next  = null;
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
public static void main(String[] args) {

    Addlast list = new Addlast();

    list.AddTail(12);
    list.AddTail(1);
    list.AddTail(2);
    list.AddTail(11);
    list.AddTail(16);
    list.printList();
}    
}
