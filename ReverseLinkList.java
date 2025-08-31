// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Node{
     int  data;
     Node next;
    
    Node(int data)
    {
        
        this.data=data;
        this.next=null;
    }
 public static void findMiddle(Node node)
    {
        Node head =node;
        Node temp=node;
        int len=0;
        while(head!=null)
        {
           head= head.next;
           len++;
        }
       System.out.println("\\n");
        int midlen=len/2;
        
        while(midlen>0)
        {
            temp=temp.next;
            midlen--;
            
        }
        
        System.out.println("mid is "+ temp.data);
        
        
    }
    
    public static Node ReverseLinklist(Node node)
    {
        Node curr =node;
      Node  prev=null;
     Node Next=null;
        while(curr!=null)
        {
            Next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
            
            
        }
        
        
        return prev;
        
    
    }
    
    
    public static void displayed(Node node)
    {
       Node temp=node;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
            
        }
        System.out.print("NULL");
    }
    
    
     public static void main(String[] args)
     {
        Node node=new Node(10);
        node.next=new Node(30);
        node.next.next=new Node(40);
        node.next.next.next=new Node(50);
        node.next.next.next.next=new Node(60);
        node.next.next.next.next.next=new Node(70);

        displayed(node);
        findMiddle(node);
      Node reHead=  ReverseLinklist(node);
      System.out.println("displayed reverse node");
      
              displayed(reHead);

         
     }
    
}

