public class LinkedList
{
  public Node head = null;
  public Node tail = null;
  public int size;
  public static void main(String args[])
  {
    
  }
  public LinkedList()
  {
    this.size = 0;
  }
  public int getSize()
  {
    return this.size;
  }
  public void setSize(int value)
  {
    this.size = value;
  }
  public Node getHead()
  {
    return this.head;
  }
  public void setHead(Node c)
  {
    this.head = c;
  }
  public Node getTail()
  {
    return this.tail;
  }
  public void setTail(Node d)
  {
    this.tail = d;
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