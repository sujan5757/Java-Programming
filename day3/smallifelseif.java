//largest of numbers usinng ifelseif statement
import java.util.Scanner;
class smallifelseif
{
	public static void main(String [] args)
	{
	 int a,b,c,d;
       Scanner sc =new Scanner(System.in);
	 System.out.println("enter the four numbers");
	 a=sc.nextInt();
	 b=sc.nextInt();
	 c=sc.nextInt();
	 d=sc.nextInt();
	if((a<b)&&(a<c)&&(a<d))
	{
	System.out.println("smaller number is: "+a);
	}
	if((b<a)&&(b<c)&&(b<d))
	{
	System.out.println("smnaller number is: "+b);
	}
	if((c<a)&&(c<b)&&(c<d))
	{
	System.out.println("smaller number is: "+c);
	}
	else
	{
	System.out.println("smalletr number is :"+d);
}
}
}
