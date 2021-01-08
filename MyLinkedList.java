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
   Node x=new Node(value);
   Node y=new Node(end.getData());
   if(size==0){
     start.setData(value);
   }
 else if (size==1){
   start.setNext(x);
 }else{
   end.setPrev(y);
 }
 end.setData(value);
 size++;
   return true;
 };

 /*
 public void add(int index, String value){
 };
 public String get(int index);
 public String set(int index, String value);
 */
 public String toString(){
   return start.toString()+" "+end.toString(); //just for preliminary testing
 };
 //Any helper method that returns a Node object MUST BE PRIVATE!

}
