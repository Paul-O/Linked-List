public class Node
{
  private String name;
  private Node prev = null;
  private Node next = null;
  public Node(String name)
  {
    this.name = name;
  }
  public String getName()
  {
    return this.name;
  }
  public void setName(String x)
  {
    this.name = x;
  }
  public Node getPrev()
  {
    return this.prev;
  }
  public void setPrev(Node a)
  {
    this.prev = a;
  }
  public Node getNext()
  {
    return this.next;
  }
  public void setNext(Node b)
  {
    this.next = b;
  }
}