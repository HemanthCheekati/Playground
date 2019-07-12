import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int l[]=new int[n];
    int i,t=0,s=0,k=0;
    for(i=0;i<n;i++)
    {
      l[i]=in.nextInt();
    }
    for(i=0;i<n;i++)
    {
      if (i<3)
      s=s+l[i];
      else if((i>=3)&&(i<6))
      {
        k=k+l[i];
      }
      else
        t=t+l[i];
    }
    if(s==k)
    {
      if(s==t)
      {
      System.out.println("Perfect Batch");
      }
      else
        System.out.println("Not a Perfect Batch");
    }
      else
      System.out.println("Not a Perfect Batch");
  }
}