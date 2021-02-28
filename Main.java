import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner cin=new Scanner(System.in);
	System.out.println("plzz Enter Integer Type Number :- ");
    int N=cin.nextInt();
int n=N;
    for(int i=1;i<=N;i++)
    { char ch='A';
      for(int j=i;j<=N;j++)
      {
        System.out.print(ch);
        ch++;
      }
       for (int k=1; k<i;k++) 
            {
               System.out.print("  "); 
            }
      ch--;
      for(int j=N;j>=i;j--)
      {
      System.out.print(ch);
      ch--;
      }
      System.out.println("");
    }
    for(int i=N;i>=1;i--)
    {
      char ch='A';
      for(int j=i;j<=N;j++)
      {
        System.out.print(ch);
        ch++;
      }
      for(int k=i;k>1;k--)
      {
        System.out.print("  ");
      }
      ch--;
      for(int j=N;j>=i;j--)
      {
      System.out.print(ch);
      ch--;
      }
      System.out.println("");
    }
  }
}