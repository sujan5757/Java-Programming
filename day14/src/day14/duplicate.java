package day14;
import java.util.Scanner;
public class duplicate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		
		String st=sc.nextLine();
		String[] s=st.split(" ");
		String temp="";
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].equals(s[j]))
				{
					s[j]="";
				}
			}
		}
		for(int i=0;i<s.length;i++)
		{
			temp=temp+s[i]+" ";
			}
			System.out.println(temp);
		}
	}

