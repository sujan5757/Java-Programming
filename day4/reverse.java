import java.util.Scanner;
class reverse{
public static void main(String [] args)
{
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the numbers :");
	int x,temp=0;
	
	int num=sc.nextInt();
	int pal=num;
	while(num!=0)
	{
	x=num%10;
	temp=(temp*10)+x;
	num=num/10;
	}
	System.out.println("reverse of the Number is : "+temp);
	if(pal==temp)
	System.out.println("it is a palindrome");
		else
	System.out.println("it is not a palindrome");
}
}
