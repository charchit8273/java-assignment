import java.util.*;
public class string_capital {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String g=" ";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(0);
            if(c>=97 && c<=122 ){
                g=g+(char)(c-32);
                
            }
            else{
                g=g+s.charAt(i);
            }
        }
        System.out.println(g);
        
    }
    
}
