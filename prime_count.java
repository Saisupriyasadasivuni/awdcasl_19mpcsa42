import java.util.*;
class prime_count
{
public static Boolean isPrime(int x)
{
int flag=0;
for(int i=1;i<=x;i++)
{
if(x%i==0)
   flag++;
}
if(flag==2)
   return true;
else 
   return false;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,i,count=0;
System.out.println("enter n:");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("enter "+n+" elements:");
for(i=0;i<n;i++)
   a[i]=sc.nextInt();
for(i=0;i<n;i++)
{
if(isPrime(a[i])==true)
     count++;
}
System.out.println("the count of prime numbers is:"+count);
}}

/*
output:
enter n:
5
enter 5 elements:
45 67 63 29 23
the count of prime numbers is:3
*/