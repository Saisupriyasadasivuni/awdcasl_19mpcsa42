import java.util.*;
class EditingZero
{
public static void main(String args[])
{
int n,count=0;
Scanner sc=new Scanner(System.in);
System.out.print(" enter n:");
n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
a[i]=sc.nextInt();
for(int i=0;i<n;i++)
{
if(a[i]!=0)
{
System.out.print(a[i]+" "); 
count++;
}
}
for(int i=n-count;i>0;i--)
{
System.out.print("0"+" "); 
}
}
}
/*
output:
enter n:8
12 0 8 0 9 12 25 16
12 8 9 12 25 16 0 0
*/