import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        int n1=1,n2=1,c1=0,c2=2;
        System.out.print(n1+ " " +n2);
        for(int i=2;i<n;++i)
        {
            int n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
            if(n3%2==0)
            {
                c1++;
            }
            else{
                c2++;
            }
        }
        System.out.println("\neven="+c1);
        System.out.println("odd="+c2);
    }
}
