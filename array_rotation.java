import java.util.*;
class array_rotation
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,r,i,count=0;
System.out.println("enter n:");
n=sc.nextInt();
System.out.println("enter no. of rotations:");
r=sc.nextInt();
int a[]=new int[n];
int b[]=new int[n];
System.out.println("enter "+n+" elements:");
for(i=0;i<n;i++)
   a[i]=sc.nextInt();
for(i=0;i<n;i++)
{
if((i-r)<0)
     b[i]=a[n+i-r];
else
     b[i]=a[i-r];
}
for(i=0;i<n;i++)
System.out.print(b[i]+" ");
}}

/*
output:
enter n:
5
enter no. of rotations:
2
enter 5 elements:
1 2 3 4 5
4 5 1 2 3
output:
enter n:
7
enter no. of rotations:
4
enter 7 elements:
1 2 3 4 5 6 7
4 5 6 7 1 2 3
*/