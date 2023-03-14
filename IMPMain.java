import java.util.*;
import java.lang.*;
import java.io.*;
class Node {
        int data;
        Node next;
        Node (int data){
                this.data = data;
                this.next = null;
        }
}
class LinkedList{
        Node head;
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
        void printLL(){
                while(head!=null){
                        System.out.print(head.data+" ");
                        head = head.next;
                }
        }
        void deleteInMidOfLL(){
                if(head==null)
                        return ;
 
                if(head.next==null){
                        Node temp = new Node(-1);
                        // temp.insert(-1);
                        head = temp;
                        return;
                }
                Node fast = head;
                Node slow  = head;
                Node pre = null;
                while(fast!=null && fast.next !=null){
                           fast = fast.next.next;
                           pre = slow;
                           slow  = slow.next;
                }
                pre.next = slow.next;
                return;
 
        }
}
public class IMPMain{
        public static void main(String[] args) throws  java.lang.Exception
        {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                LinkedList l1 = new LinkedList();
                for(int i=0; i<n; i++)
                {
                        l1.insert(sc.nextInt());
                }
               l1.deleteInMidOfLL();
               l1.printLL();
        }
}