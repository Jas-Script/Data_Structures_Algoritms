import java.util.*;

public class Main {
  public static class Node{
    int data;
    ArrayList<Node> children= new ArrayList<>();
  }

  public static void main(String[] args) {
    int[] a= {10,20,40,-1,50,-1,-1,30,60,-1,-1,-1};
    Node root;
    Stack<Node> st= new Stack<>();
    for(int i=0;i<a.length;i++){
      if(a[i]==-1){
        st.pop();
      }
      else{
        Node t= new Node();
        t.data=a[i];
        if(st.size()>0){
          st.peek().children.add(t);
        st.push(t);
        }
        else{
         root= t;
        st.push(t); 
        }
      }

    }

  }
}