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
      int n1=in.nextInt();
      int n2=in.nextInt();
       for (i=0;i<n;i++)
      {
        if(a[i]==n1)
          k1=i;
       }
        for (i=0;i<n;i++)
      {
        if(a[i]==n2)
          k2=i;
       }
       if(k2==0)
         k2=-1;
         
     
       System.out.println(k1);
        System.out.println(k2);
      
   }
}