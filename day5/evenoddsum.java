import java.util.*;
class  evenoddsum
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the Number");
		Scanner sc=new Scanner(System.in);
		int num,x,sum=0,product=1;
		num=sc.nextInt();
		while(num!=0)
		{
			x=num%10;
			sum=sum+x;
			product=product*x;
			num=num/10;
		
	}
	if(sum==product)
		{
			System.out.println("It is Spy Number");
		}
			else
		{
			System.out.println("It is not a Spy Number");
			
			
		}
	}
}