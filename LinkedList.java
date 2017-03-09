public class LinkedList
{
  public Node head = null;
  public Node tail = null;
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
}