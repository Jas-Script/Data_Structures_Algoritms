import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        ArrayList<String> list=gss(str);
        System.out.println(list);
    }

    public static ArrayList<String> gss(String str) {
        if(str.length()==0){
            ArrayList<String> base = new ArrayList<String>();
            base.add("");
            return base;
       }
        char ch=str.charAt(0);
        String substr=str.substring(1);
        ArrayList<String> newlistgss=gss(substr);
        ArrayList<String> res= new ArrayList<>();
        for(String stri:newlistgss){
            res.add(stri);
        }
        for(String stri:newlistgss){
            res.add(ch+stri);
        }
        return res;
    }

}