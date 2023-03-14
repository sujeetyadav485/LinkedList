import java.io.*;
import java.util.*;
import java.lang.*;
 
public class DeleteNodeNewConcept {
  
// public class Main{
 
        public static class Node{
                int data;
                Node next;
                Node(int value)
                {
                        this.data=value;
                        this.next=null;
                }
        }
 
        public static void print(Node head)
        {
                Node t=head;
                while(t!=null)
                        {
                                System.out.print(t.data+" ");
                                t=t.next;
                        }
                return ;
        }
 
        public static void main(String[] args)
        {
                Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                Node head=null;
                Node t=null;
                for(int i=0;i<n;i++)
                        {
                                int v=sc.nextInt();
                                if(head==null)
                                {
                                        head=new Node(v);
                                        t=head;
                                } else
                                {
                                        t.next=new Node(v);
                                        t=t.next;
                                }
                        }
 
                int pos=sc.nextInt();
 
                if(pos==0)
                {
                        t=head;
                        head=head.next;
                        t.next=null;
                        t=null;
                }
                else
                {
                        t=head;
                        Node prev=null;
                        int cur_pos=0;
 
                        while(t!=null && cur_pos<pos)
                                {
                                        prev=t;
                                        t=t.next;
                                        cur_pos++;
                                }
                        if(t!=null)
                        {
                                prev.next=t.next;
                                t.next=null;
                        }
                        t=null;
                }
 
                print(head);
                return ;
        }
}
    

