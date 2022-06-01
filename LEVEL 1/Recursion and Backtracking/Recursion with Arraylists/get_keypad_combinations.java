import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        ArrayList<String> ans= getKPC(str);
        System.out.println(ans);
    }
    static String[] code={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static ArrayList<String> getKPC(String str) {
        if(str.length()==0){
            ArrayList<String> baslist = new ArrayList<>();
            baslist.add("");
            return baslist;
                   }
        char ch= str.charAt(0);
        String substr=str.substring(1);
        ArrayList<String> fans=getKPC(substr);
        ArrayList<String> finans = new ArrayList<>();
        String codstr=code[ch-'0'];
        for(int i=0;i<codstr.length();i++){
            char codchar=codstr.charAt(i);
            for(String sttr:fans){
                finans.add(codchar+sttr);
            }
        }
        return finans;
    }
    }
