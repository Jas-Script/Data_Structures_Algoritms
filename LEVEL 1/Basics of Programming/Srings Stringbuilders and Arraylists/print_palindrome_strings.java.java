import java.io.*;
import java.util.*;

public class Main {

  public static void solution(String str) {
    for (int i = 0; i <= str.length() - 1; i++) {
      for (int j = i + 1; j <= str.length(); j++) {
        if (ispal(str.substring(i, j)) == true) {
          System.out.println(str.substring(i, j));
        }
      }
    }

  }
  public static boolean ispal(String str) {
    int beg = 0;
    int end = str.length() - 1;
    int ctr = 0;
    while (beg <= end) {
      if (str.charAt(beg) != str.charAt(end)) {
        ctr++;
        break;
      }
      else {
        beg++;
        end--;
      }
    }
    if(ctr==0){
        return true;
    }
    else{
        return false;
    }
  }


  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    solution(str);
  }

}