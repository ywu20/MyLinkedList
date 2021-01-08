import java.util.*;
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
  String p=" prev:";
  String n=" next:";
  try{
    p+=prev.getData();
  }catch(NullPointerException e){
    p+="null";
  }

  try{
    n+=next.getData();
  }catch(NullPointerException e){
    n+="null";
  }
  return "data:"+ data+p+n;
 //write get/set methods for all three instance variables.
}
}
