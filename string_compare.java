import java.util.*;
public class string_compare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        s1=s1.toLowerCase();
        String s2=sc.next();
        s2=s2.toLowerCase();
        int a=s1.compareTo(s2);
        System.out.println(a);

        
    }
    
}
