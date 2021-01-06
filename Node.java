public class Node{
  private String data;
  private Node next,prev;
 public Node(String value){
 /*create a constructor*/
 data=value;
}

String getData(){
  return data;
}

Node getNext(){
  return next;
}

Node getPrev(){
  return prev;
}

void setData(String x){
  data=x;
}

void setNext(Node x){
  next=x;
}

void setPrev(Node x){
  prev=x;
}
 //write get/set methods for all three instance variables.
}
