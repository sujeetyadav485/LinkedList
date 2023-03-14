import java.util.List;

// import AddFirst.Node;

public class AddMiddle {

    Node  head ;
    public  class Node{
        int data ; 

        Node next ;
        Node(int data)
        {
            this.data = data ;

            this.next = null ;

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
    public  void AddMid( int posi, int data)
    {
        
        if(posi==1)
        {
            AddHead(data);
            return ;
        }
        
        Node  temp =  head ;
        int count  = 1 ; 
        while(count < (posi-1))
        {
            temp =  temp.next;
            count ++;
        }
        Node nodeToInsertNode =  new Node(data);
        nodeToInsertNode.next = temp.next; 
         temp.next = nodeToInsertNode ;

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
        System.out.print(curr.data+"-->");

        curr = curr.next ;
    }
    System.out.println("null");
   }

    public static void main(String[] args) {

        AddMiddle list = new AddMiddle();
        list.AddHead(20);
        list.AddHead(30);
        list.AddHead(45);
        list.AddHead(87);
        list.AddHead(98);
        list.AddHead(12);
         list.AddMid(7, 20);

        list.printList();
        
    }
}
