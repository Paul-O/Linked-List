public class TestList
{
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
}