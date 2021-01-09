public class MyLinkedList{
 private int size;
 private Node start,end;
 public MyLinkedList(){
   size=0;
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
   if(index<0 || index>=size){
     throw new IndexOutOfBoundsException();
   }
String out="";
if(size==1){
  out=start.getData();
  start=null;
  end=null;
}
   else if(index==0){
     out=start.getData();
     start=start.getNext();
     start.setPrev(null);
   }
  else if(index==size-1){
     out=end.getData();
     end=end.getPrev();
     end.setNext(null);
   }
    else{
     Node r=findNode(index);
   r.getPrev().setNext(r.getNext());
   r.getNext().setPrev(r.getPrev());
  out=r.getData();
 }
 size--;
 return out;
 }

 public void extend(MyLinkedList other){
   end.setNext(other.start);
   other.start.setPrev(this.end);
   other.start=null; other.end=null; other.size=0;
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
 if(size != 0){
 out=out.substring(0,out.length()-2);
}
  out+="]";

 return out;
}
 //Any helper method that returns a Node object MUST BE PRIVATE!

}
