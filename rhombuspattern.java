import java.util.*;
class rhombuspattern{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i,j,k,p;
        System.out.println("enter n:"); 
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
          for(k=1;k<=(n-i);k++)
          System.out.print("  ");
          for(j=1;j<=(2*i-1);j++)
          System.out.print(" *");
         System.out.println();
        }
        for(i=n-1;i>=1;i--)
        {
          for(k=n-1;k>=i;k--)
          System.out.print("  ");
          for(j=2*i-1;j>=1;j--)
          System.out.print(" *");
         System.out.println();
        }
    }
}

/*
output:
enter n:
4
       *
     * * *
   * * * * *
 * * * * * * *
   * * * * *
     * * *
       *
*/