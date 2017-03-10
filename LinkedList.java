public class LinkedList
{
  public Node head = null;
  public Node tail = null;
  public int size;
  
  public static void main(String args[])
  {
    LinkedList list = new LinkedList();
    Node node = new Node("James");
    list.add(node);
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
  public void add(String name)
  {
    Node n = new Node(name);
    if(head == null)
    {
      head = n;
      tail = n;
    }
    else if(head == tail)
    {
      if(n.getName().compareTo(head.getName()) < 0)
      {
        n.next = tail;
        tail.prev = n;
        head = n;
      }
      else
      {
        n.prev = head;
        head.prev = n;
        tail = n;
      }
    }
    else
    {
      Node temp = head;
      while(temp != null)
      {
        if(n.getName().compareTo(temp.getName()) < 0)
        {
          if(temp == head)
          {
            n.next = temp;
            temp.prev = n;
            head = n;
          }
          else if(temp == tail)
          {
            tail.getPrev().setNext(n);
            n.setPrev(temp.getPrev())
            temp.prev = n;
            n.next = tail;
          }
          else
          {
            temp.getPrev.setNext(n);
            n.setPrev(temp.getPrev);
            n.next = temp;
            temp.prev = n;
          }
        }
        else if(n.getNext().compareTo(temp.getNext()) > 0)
        {
          if(temp == tail)
          {
            n.prev = temp;
            temp.next = n;
            tail = n;
          }
          if(temp == head)
          {
            
          }
          else
          {
            n.prev = temp;
            temp.next = n;
          }
        }
        else
        {
          if(temp == tail)
          {
            n.next = temp;
            temp.prev = temp;
            tail = n;
          }
          else if(temp = head)
          {
            
          }
          else
          {
            n.next = temp;
            temp.prev = temp;
          }
        }
        temp = temp.getNext();
      }
    }
  }
  public void remove()
  {
    
  }
  public void deleteNode()
  {
    
  }
  public boolean isEmpty()
  {
      return head == null;
  }
  public void delete()
  {
    head = null;
    tail = null;
  }
  public void iterateFoward()
  {
    Node current = head;
    while(current != null)
    {
      System.out.println(current.toString());
      current = current.getNext();
    }
  }
  public void iterateReverse()
  {
    Node current = tail;
    while(current != null)
    {
      System.out.println(current.toString());
      current = current.getPrev();
    }
  }
}