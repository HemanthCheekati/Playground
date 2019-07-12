import java.util.Scanner;
class Main{
	public static void main (String[] args){
        Scanner A=new Scanner (System.in);
      int n=A.nextInt();
      int r,s=0;
      int t=n;
      while(n>0)
      {
        r=n%10;
        int f=1;
        while(r>0)
        {
          f=f*r;
          r--;
        }
        s=s+f;
        n=n/10;
      }
      if(s==t)
      {
	          System.out.println("Yes");
      }
      else
        
        System.out.println("No");
      
	}
}