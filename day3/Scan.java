/* Scanner Class  creating steps------------
import --> import java.util.Scanner;
create a object --> Scanner objectname =new Scanner(System.in);
use the methods -->
nextInt();
nextdouble();
nextlong();
nextshort();
next.......
etc
*/
import java.util.Scanner;
class Scan
{
	public static void main(String [] args)
	{
	//create a object
	Scanner sc= new Scanner(System.in);
	//giving numbers
	System.out.println("enter a number:");
	int a=sc.nextInt();
	System.out.println(a);
	//giving character
	System.out.println("enter the character");
	System.out.println(sc.next().charAt(0));
// giving string
	System.out.println("enter the string :");
	String s=sc.next();
	System.out.println(s);
	}
}
	