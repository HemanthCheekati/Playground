import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int l[]=new int[n];
    int i,s=0,k=0;
    for(i=0;i<n;i++)
    {
      l[i]=in.nextInt();
    }
    k=l[0];
    for(i=0;i<n-1;i++)
    {
      if(k<l[i+1])
      {
        k=l[i+1];
        s=i;
      }
    }
    System.out.println(s+1);
                
  }
}