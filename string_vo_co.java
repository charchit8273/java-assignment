import java.util.*;
public class string_vo_co {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=new String();
         s=sc.next();
        s=s.toUpperCase();
        int co=0,vo=0;
        for(int i=0;i<s.length();i++){
            char c;
            c=s.charAt(i);
            if(c!=' '){
                if(c=='A'|| c=='E' || c=='I' || c=='O' || c=='U' ){
                    vo++;
                }
                else{
                    co++;
                }

            }
            
            }
            System.out.println(vo);
            System.out.println(co);

        }
        
    }
    

