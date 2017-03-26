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
    System.out.println(" ");
    System.out.print(list.isEmpty());
    System.out.println(" ");
    list.remove("Miriam");
    System.out.println(" ");
    list.print();
    System.out.println(" ");
    list.iterateForward();
    System.out.println(" ");
    list.iterateReverse();
    System.out.println(" ");
    System.out.println(list.find("Michael"));
    System.out.println(" ");
    list.delete();
    System.out.print(list.isEmpty());
  }
  public LinkedList()
  {
    
  }
  public void add(String name) // adds new Node to list alphabetically
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
      if(n.getName().compareTo(head.getName()) <0)
      {
        n.setNext(head);
        head.setPrev(n);
        head = n;
      }
      else if(n.getName().compareTo(tail.getName()) > 0)
      {
        n.setPrev(tail);
        tail.setNext(n);
        tail = n;
      }
      else
      {
        Node temp = head;
        while(temp != null)
        {
          if(n.getName().compareTo(temp.getName()) > 0 && n.getName().compareTo(temp.next.getName()) < 0)
          {
            temp.getNext().setPrev(n);
            n.setNext(temp.getNext());
            n.setPrev(temp);
            temp.setNext(n);
          }
          temp = temp.getNext();
        }
      }
    }
  }
  public void remove(String s) // removes Node from list
  {
    Node v = head;
    while(v != null && v.getName().compareTo(s) != 0)
    {
      v = v.getNext();
    }
    if(v.getName().compareTo(s) == 0)
    {
      v.getPrev().setNext(v.getNext());
      v.getNext().setPrev(v.getPrev());
      v = null;
    }
  }
  public Node find(String s) // finds Node that matches a String
  {
    Node v = head;
    while(v != null && v.getName().compareTo(s) != 0)
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
  public void print() // prints list
  {
    Node temp = head;
    while(temp != null)
    {
      System.out.println(temp.getName());
      temp = temp.getNext();
    }
  }
  public boolean isEmpty() // checks if list is empty;
  {
    return head == null;
  }
  public void delete()
  {
    head = null;
    tail = null;
  }
  public void iterateForward() // prints list of all Nodes from head to tail
  {
    Node current = head;
    while(current != null)
    {
      System.out.println(current.toString());
      current = current.getNext();
    }
  }
  public void iterateReverse() // prints list of all Nodes from tail to head
  {
    Node current = tail;
    while(current != null)
    {
      System.out.println(current.toString());
      current = current.getPrev();
    }
  }
}