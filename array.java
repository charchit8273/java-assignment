import java.util.*;
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int arr[]= new int[s];
        for(int i=0;i<s;i++){
         arr[i] = sc.nextInt();
        }
        for(int i=0;i<s;i++){
            System.out.print(arr[i]);
        } 
    }
    

}
