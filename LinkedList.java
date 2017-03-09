public class LinkedList
{
  public Node head = null;
  public Node tail = null;
  public static void main(String args[])
  {
    
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