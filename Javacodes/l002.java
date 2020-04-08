import java.util.ArrayList;
import java.util.Scanner;

public class l002{

    public static ArrayList<String> subseq_ret(String str){

        char ch=str.charAt(0);
        System.out.println(str);
        String nstr=str.substring(1);

        ArrayList<String> small_ans = subseq_ret(nstr); 
        ArrayList<String> myAns = new ArrayList<>();
        myAns.addAll(small_ans);
        for(String s: small_ans){
            myAns.add(ch+s);
        }
       
        return myAns;
    }

    
    public static void main(String[] args){
        String str="abcd";
        ArrayList<String>ans = subseq_ret(str);
        for(String s : ans){
         System.out.println(s);
       }
    }
    
    

}