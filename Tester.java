import java.util.*;
public class Tester{
  public static void main (String[] args){
    Node a=new Node("aaaaa");
    System.out.println(a);
a.setData("bbbb"); a.setPrev(a); a.setNext(a);
System.out.println(a);

  MyLinkedList b = new MyLinkedList();
  System.out.println(b.size());
  b.add("h"); b.add("a"); b.add("C"); b.add("d");
  System.out.println(b.size());
  //b.print();
  b.add(2,"2");
  b.add(0,"0");
//  b.print();

System.out.println(b.get(2));
System.out.println(b.set(2,"2"));
//b.print();
LinkedList<String> c= new LinkedList<String>();
//c.add("dfa"); c.add("ere"); c.add("po");
System.out.println(c);
System.out.println(b);
MyLinkedList d=new MyLinkedList();
d.add(0, "hello");
d.add(0, "world");
d.add(2, "foo");
d.add(1, "bar");
System.out.println(d);
c.add(0, "hello");
c.add(0, "world");
c.add(2, "foo");
c.add(1, "bar");
//System.out.println(c);
d.remove(2);
d.remove(0);
d.remove(d.size()-1);
//d.remove(0);
//d.remove(0);
//System.out.println(d);

/*
d.extend(b);

System.out.println(d);
System.out.println(b);

d.extend(b);
System.out.println(d);
System.out.println(b);

b.extend(d);
System.out.println(b);
System.out.println(d);
*/
MyLinkedList e=new MyLinkedList();
//d.extend(e);
e.extend(b);
System.out.println(e);
System.out.println(d);
}

}
