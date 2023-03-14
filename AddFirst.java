// import Addlast.Node;

public class AddFirst {
    Node  head ;

    public class Node{
        int data ; 
        Node next ;
        Node(int data)
        {
            this.data = data ;
            this.next  = null ;
        }
    }
    public void AddHead(int data)
    {
        Node newnode1 = new Node(data);

        if(head == null)
        {
            head = newnode1 ;
            return ;

        }
        newnode1.next = head ;

        head = newnode1 ;
    }
    public  void printList()
    {
        if(head == null)
        {
            System.out.println("List is Empaty");
            return ;

        }
        Node curr = head ;

        while(curr!=null)
        {
            System.out.print(curr.data+"-->");

            curr = curr.next;
        }
        System.out.println("null");
    }
   
    public static void main(String[] args) {

        AddFirst list = new AddFirst();

        list.AddHead(12);
        list.AddHead(30);
        list.AddHead(58);
        list.AddHead(57);

        list.printList();

        // list.reverseList(null);

       

      
        
    }
    
}
