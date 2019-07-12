import java.util.Scanner;
class Main{
	public static void main (String[] args){
	 Scanner A=new Scanner (System.in);
      int n=A.nextInt();
      int m=n,tr=n,r;
      int i,k=0,s=0;
      while(n>0)
      {
        n=n/10;
        k++;
      }
     
      while(m>0)
      {
        r=m%10;
        int f=1;
        for(i=1;i<=k;i++)
        {
          f=f*r;
        }
       
        s=s+f;
        m=m/10;
       
      }
      if(tr==s)
      System.out.println("Armstrong Number");
      else
         System.out.println("Not a Armstrong Number");
	}
}