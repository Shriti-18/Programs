import java.util.ArrayList;
import java.util.Scanner;

public class l001{

    public static Scanner scn = new Scanner(System.in);

    public static void main(final String[] args) {
        solve();

    }

    public static void solve() {
        // set1();
        // set2();
        set3();

        // a=Fact(n);
        // System.out.println(a);

    }

    public static void set1() {
        int a, b, c;
        a = scn.nextInt();
        b = scn.nextInt();
        c = Power(a, b);
        System.out.println(c);
    }

    public static int Fact(final int n) {

        return n <= 1 ? 1 : Fact(n - 1) * n;

    }

    public static int Power(final int a, final int b) {

        return b == 0 ? 1 : Power(a, b - 1) * a;
    }

    public static int PowBtr(final int a, final int b) {
        if (b == 0)
            return 1;

        int smallAns = PowBtr(a, b / 2);
        smallAns *= smallAns;

        return b % 2 == 0 ? smallAns : smallAns * a;
    }

    public static int calls(final int n) {
        if (n <= 1) {
            System.out.println("base : " + n);
            return n + 1;
        }
        int count = 0;
        System.out.println("pre: ");
        count += calls(n - 1);

        System.out.println("In: ");
        count += calls(n - 2);

        System.out.println("post: ");

        return count + 3;
    }
    // set2-------------------------------------------------------------------------------------------

    public static void display(final int[] arr, final int vidx) {
        if (vidx == arr.length)
            return;

        System.out.println(arr[vidx] + " ");
        display(arr, vidx + 1);

    }

    public static boolean find_01(final int[] arr, final int vidx, final int data) {

        if (vidx == arr.length)
            return false;

        if (arr[vidx] == data) // work in pre area
            return true;

        return find_01(arr, vidx + 1, data);

    }

    public static boolean find_02(final int[] arr, final int vidx, final int data) {
        if (vidx == arr.length)
            return false;

        final boolean ans = find_02(arr, vidx + 1, data);// work iin post area
        if (ans)
            return true;
        else
            return arr[vidx] == data;
    }

    public static int maximum(final int[] arr, final int vidx) {
        if (vidx == arr.length - 1)
            return arr[vidx];
        final int maxele = maximum(arr, vidx + 1);
        return Math.max(arr[vidx], maxele);
    }

    static int max_ = -1;

    public static void maximum_02(final int[] arr, final int vidx) {

        if (vidx == arr.length - 1)
            return;
        max_ = Math.max(arr[vidx], max_);
        maximum_02(arr, vidx);

    }

    public static int minimum(final int[] arr, final int vidx) {
        if (vidx == arr.length - 1)
            return arr[vidx];

        final int minele = minimum(arr, vidx + 1);
        return Math.min(minele, arr[vidx]);
    }

    public static void set2() {

        final int[] arr = { 1, 234, 34, 7, 2, 1, 23, 4, 5, 6, 2, 3, 4, 7, 32 };
        display(arr, 0);
    }


    // set 3========================================================
    public static ArrayList<String> subseq_ret(final String str) {
        if (str.length() == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        char ch = str.charAt(0);
        String nstr = str.substring(1);

        ArrayList<String> smallAns = subseq_ret(nstr);
        ArrayList<String> myans = new ArrayList<>();
        for (String s : smallAns) {
        myans.add(s);
        myans.add(ch+s);
    }
    return myans;

}   
    public static int subseq_void(String str,String ans){
        if(str.length()==0)
        {System.out.println(ans);
        return 1;
        }
    int count = 0;
    char ch=str.charAt(0);
    count+=subseq_void(str.substring(1),ans);
    count+=subseq_void(str.substring(1),ans+ch);
    return count;
}

    public static ArrayList<String> permutation_with_Duplicates_01(String str){
        if(str.length()==0){
            ArrayList<String>base=new ArrayList<>();
            base.add(" ");
            return base;
        }
        char ch=str.charAt(0);
        ArrayList<String>smallans=permutation_with_Duplicates_01(str.substring(1));
        ArrayList<String>myans=new ArrayList<>();

        for(String s: smallans){
            for(int i=0;i<s.length();i++){
                myans.add(s.substring(0,i)+ch+s.substring(i));
            }
        }
        return myans;
    }
    public static int  permutation_with_Duplicates_02(String str, String ans){
        if(str.length()==0)
        {
            System.out.println(ans);
            return 1;
        }
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String rem=str.substring(0,i)+str.substring(i+1);
            count+=permutation_with_Duplicates_02(rem, ans+ch);
        }
        return count;
    }
      public static int permutation_without_duplicates(String str,String ans){
          if(str.length()==0){
             System.out.println(ans);
             return 1;
          }
          boolean [] vis=new boolean[26];
          int count=0;
          for(int i=0;i<str.length();i++){
              char ch=str.charAt(i);
              if(!vis[ch-'a']){
                vis[ch-'a']=true;
                String nstr=str.substring(0,i)+str.substring(i+1);
                count+=permutation_without_duplicates(nstr, ans+ch);
              }
          }
          return count;
      }
    
public static void set3(){
   // System.out.println(subseq_ret("abcd"));
   //System.out.println(subseq_void("abcd", ""));
 //  System.out.println(permutation_with_Duplicates_01("abcd"));
   // System.out.println(permutation_with_Duplicates_02("abcd",""));
   System.out.println(permutation_without_duplicates("abaab", ""));
}
}