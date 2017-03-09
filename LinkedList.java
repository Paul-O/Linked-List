public class LinkedList
{
  public Node head = null;
  public Node tail = null;
  public static void main(String args[])
  {
    Node z = new Node("Jimmy");
    System.out.println(z.getPrev());
    System.out.println(z.getNext());
    System.out.println(z.getName());
    z.setName("mark");
    System.out.println(z.getPrev());
    System.out.println(z.getNext());
    System.out.println(z.getName());
  }
  public LinkedList()
  {
    
  }
  public void add(Node n)
  {
    if(head == null)
    {
      head = n;
      tail = n;
    }
    else if(head == tail)
    {
      tail = n;
      head.next = tail;
      tail.prev = head;
    }
    else
    {
      n.prev = tail;
      tail.next = n;
      tail = n;
    }
  }
  public void remove()
  {
    
  }
  public boolean isEmpty()
  {
    if(head == null && tail == null)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
}