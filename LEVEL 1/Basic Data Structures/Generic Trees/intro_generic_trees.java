import java.util.*;

public class Main {
  public static class node{
    int data;
    ArrayList<node> children= new ArrayList<>();
    node(int data){
      this.data=data;
    }
  }

  public static void main(String[] args) {
    node root=new node(10);
    node twenty= new node(20);
    root.children.add(twenty);
    node thirty= new node(30);
    root.children.add(thirty);
    node forty= new node(40);
    twenty.children.add(forty);
    node fifty= new node(50);
    twenty.children.add(fifty);
    node sixty= new node(60);
    thirty.children.add(sixty);
    node seventy= new node(70);
    thirty.children.add(seventy);

  }
}