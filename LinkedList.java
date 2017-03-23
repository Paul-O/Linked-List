public class LinkedList
{
  private Node head;
  private Node tail;
  public static void main(String args[])
  {
    LinkedList list = new LinkedList();
    list.add("Paul");
    list.add("Edward");
    list.add("Gregory");
    list.add("Michael");
    list.add("Miriam");
    
    list.print();
    System.out.println(list.find("Michael"));
    System.out.println(list.find("Zach"));
  }
  public LinkedList()
  {
    
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
        head = n;
        head.setNext(tail);
        tail.setPrev(head);
      }
      else
      {
        tail = n;
        tail.setPrev(head);
        head.setNext(tail);
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
            n.setNext(head);
            head.setPrev(n);
            head = n;
          }
          else if(temp == tail)
          {
            tail.getPrev().setNext(n);
            n.setPrev(tail.getPrev());
            n.setNext(tail);
            tail.setPrev(n);
          }
          else
          {
            temp.getPrev().setNext(n);
            n.setPrev(temp.getPrev());
            n.setNext(temp);
            temp.setPrev(n);
          }
        }
       /*
        else if(n.getName().compareTo(temp.getName()) > 0)
        {
          if(temp == tail)
          {
            n.prev = temp;
            temp.next = n;
            tail = n;
          }
          if(temp == head)
          {
            head.getNext().setPrev(n);
            n.setNext(head.getPrev());
            n.setPrev(head);
            head.next = n;
          }
          else
          {
            temp.getNext().setPrev(n);
            n.setNext(temp.getNext());
            n.prev = temp;
            temp.next = n;
          }
        }
        */
        /*
        else
        {
          if(temp == tail)
          {
            n.next = temp;
            temp.prev = temp;
            tail = n;
          }
          else if(temp == head)
          {
            n.next = temp;
            temp.prev = n;
            head = n;
          }
          else
          {
            temp.getPrev().setNext(n);
            n.setPrev(temp.getPrev());
            n.next = temp;
            temp.prev = temp;
          }
        }
        */
        temp = temp.getNext();
      }
    }
  }
  public void remove(int index)
  {
    Node tmp = this.head;
    int i = 0;
    if (index == 0) {
      this.head = this.head.getNext();
    }
    while (tmp.getNext() != null && i < index-1)
    {
      tmp = tmp.getNext();
      i++;
    }
    if (tmp.getNext() != null && index > 0)
    {
      tmp.setNext(tmp.getNext().getNext());
    }
  }
  public Node find(String s)
  {
    Node v = head;
    while(v.getNext() != null && v.getName().compareTo(s) != 0)
    {
      v = v.getNext();
    }
    if(v.getName().compareTo(s) == 0)
    {
      return v;
    }
    else
    {
      return null;
    }
  }
  public void print()
  {
    Node temp = head;
    while(temp != null)
    {
      System.out.println(temp.getName());
      temp = temp.getNext();
    }
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