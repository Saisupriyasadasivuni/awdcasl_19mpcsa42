import java.util.*;
class automorphic
{
public static void main(String args[])
{
int n,sq;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
n=sc.nextInt();
sq=n*n;
if(sq%100==n)
System.out.println("Automorphic number");
else
System.out.println("Not an Automorphic number");
}}
**************************************
output:
enter a number
76
Automorphic number
