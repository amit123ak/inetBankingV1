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
    public static void displayed(Node node)
    {
        temp=node;
        while(temp.next!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
            
        }
    }
    
    
     public static void main(String[] args)
     {
        Node node=new node(10);
        node.next=new Node(30);
        node.next.next=new Node(40);
        displayed(node);
         
     }
    
}

