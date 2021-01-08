public class MyLinkedList{
 private int size;
 private Node start,end;
 public MyLinkedList(){
   size=0;
   start=new Node("");
   end=new Node("");
 }
 public int size(){
   return size;
 };
 public boolean add(String value){
   Node newEnd=new Node(value);
   if(size==0){
     start=newEnd;
     end=newEnd;
   }
   else{
   newEnd.setPrev(end);
   end.setNext(newEnd);
   end=newEnd;
}

 size++;
   return true;
 }

private Node findNode(int index){
  Node current=start;
  for(int i=0; i<index;i++){
    current=current.getNext();
  }
  return current;
}

 public void add(int index, String value){
   if(index >size || index<0){
     throw new IndexOutOfBoundsException();
   }
    Node insert=new Node(value);
if(index==size){
     add(value);
   }
   else if(index==0){
     insert.setNext(start);
     start.setPrev(insert);
     start=insert;
     size++;
   }
   else{
    Node current=findNode(index);
     Node p=current.getPrev();
     p.setNext(insert);
     insert.setPrev(p);
     current.setPrev(insert);
     insert.setNext(current);
     size++;
   }
 }

 public String remove(int index){
   Node r=findNode(index);
   r.getPrev().setNext(r.getNext());
   r.getNext().setPrev(r.getPrev());
   return r.getData();
 }
 public String get(int index){
   if(index >=size || index<0){
     throw new IndexOutOfBoundsException();
   }
   return findNode(index).getData();
 }

 public String set(int index, String value)
{
  if(index >=size || index<0){
    throw new IndexOutOfBoundsException();
  }
  Node current=findNode(index);
  String out=current.getData();
  current.setData(value);
  return out;
}

/*
public void print(){
  Node current = start;
while (current != null){
 System.out.println(current);
 current = current.getNext();
}
}
*/
 public String toString(){
   String out="[";
   Node current = start;
 while (current != null){
  out+=current.getData()+", ";
  current = current.getNext();
 }
 out=out.substring(0,out.length()-2)+"]";
 return out;
}
 //Any helper method that returns a Node object MUST BE PRIVATE!

}
