import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
      int n=in.nextInt();
       int i,k1=0,k2=0;
      int a[]=new int[n];
      for (i=0;i<n;i++)
      {
        a[i]=in.nextInt();
      }
      int m;
      if(a[0]>a[1])
        m=a[0];
      else
          m=a[1];
        for (i=1;i<n-1;i++)
      {
        if(m<a[i+1])
           {
             m=a[i+1];
           }
      }
           System.out.println(m);
    }
}