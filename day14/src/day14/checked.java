package day14;

public class checked {
	public static void main(String[] args) {
		System.out.println("main sgarts");
		System.out.println(20/0);
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("main ends");
	}

}
