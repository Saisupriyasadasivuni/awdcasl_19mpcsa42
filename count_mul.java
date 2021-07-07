import java.util.*;
class count_mul
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,i,even_count=0,odd_count=0,mul;
System.out.println("enter n:");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("enter "+n+" elements:");
for(i=0;i<n;i++)
   a[i]=sc.nextInt();
for(i=0;i<n;i++)
{
if(a[i]%2==0)
     even_count++;
else
     odd_count++;
}
mul=even_count*odd_count;
if(mul%2==0)
System.out.println("the product of even and odd num count is: EVEN");
else
System.out.println("the product of even and odd num count is: ODD");
}}

/*
output:
enter n:
7
enter 7 elements:
2 3 4 5 6 7 8
the product of even and odd num count is: EVEN
*/

/*
output:
enter n:
5
enter 5 elements:
45 67 63 29 23
the count of prime numbers is:3
*/