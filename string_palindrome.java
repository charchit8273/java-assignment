import java.util.*;
public class string_palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int i=0;
        int j=s.length()-1;
        int flag=0;
        while(i<j && flag==0){
            if(s.charAt(i)!= s.charAt(j)){
                flag=1;
            }
            i++;
            j--;
        }
        
        if(flag==0){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }



        
    }
    
}
