public class Node{
  private String data;
  private Node next,prev;
 public Node(String value){
 /*create a constructor*/
 data=value;
}

public String getData(){
  return data;
}

public Node getNext(){
  return next;
}

public Node getPrev(){
  return prev;
}

public void setData(String x){
  data=x;
}

public void setNext(Node x){
  next=x;
}

public void setPrev(Node x){
  prev=x;
}

public String toString(){
  return "data: "+ data+" prev: "+prev.getData()+" next: "+next.getData();
}
 //write get/set methods for all three instance variables.
}
