
public class Strings 
{
public static void main(String[] args)
{
System.out.println("amin method started");
String s1="Rahul Kumar Erugurala";
char[]ch=s1.toCharArray();
for(int i=0;i<ch.length/2;i++)
{
	char temp=ch[i];
	ch[i]=ch[ch.length-1-i];
	ch[ch.length-1-i]=temp;
}
String s2=new String(ch);
System.out.println(ch);
System.out.println("main method ended");
}
}
