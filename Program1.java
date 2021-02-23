
public class Program1 
{
public static void main(String[] args)
{
System.out.println("main method started");
int a=24;
if(a%2==0)
{
	System.out.println("even number");
}
else
{
	System.out.println("odd number");
}
int b=35;
int c=45;
int d=55;
if(b>c && b>d)
{
	System.out.println("b="+b);
}
else if(c>d)
{
	System.out.println("c="+c);
}
else
{
	System.out.println("d="+d);
}
for(int i=0;i<=50;i++)
{
	if(i%2!=0)
	{
	System.out.println("i="+i);
	}
}
char ch1='A';
System.out.println("character="+ch1);
for(char ch='a';ch<='z';ch++)
{
	System.out.println("ch="+ch++);
}
System.out.println("main method ended");
}
}
