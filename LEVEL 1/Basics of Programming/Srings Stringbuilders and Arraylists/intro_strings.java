import java.util.*;
public class intro_strings{
    public static void main(String[] args)throws Exception{
        Scanner sc= new Scanner(System.in);
        String s1=sc.nextLine();
        System.out.println(s1);
        System.out.println(s1.length()+" is the length of the first string i.e "+s1);
        for(int i=0;i<s1.length();i++){
            System.out.println(s1.charAt(i));
        }
        String s2=sc.nextLine();
        sc.close();
        String words[]= s2.split(" ");
        for(int i=0;i<words.length;i++){
            System.out.println(words[i]);
        }
        String s3="abcd";
        for(int i=1;i<=s3.length();i++){
            System.out.println(s3.substring(0,i));
        }

    }
}