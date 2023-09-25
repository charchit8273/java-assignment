import java.util.*;
public class area{
    void area_of_cir(double r)
    {
        double ar=3.14*r*r;
        System.out.println(ar);

    }
    void area_of_rect(int a,int b){
        int ar=a*b;
        System.out.println(ar);
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double r=sc.nextDouble();
        int a=sc.nextInt();
        int b=sc.nextInt();
        area area=new area();
        area.area_of_cir(r);
        area.area_of_rect(a,b);
    }
}