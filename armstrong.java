import java.util.Scanner;
class armstrong
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		int no=s.nextInt();
		int t1=no;
		int length=0;
		
		while(t1!=0)
		{
			t1=t1/10;
			length=length+1;
		}
			int t2=no;
			int rem;
			int arms=0;
			while(t2!=0)
				{
					rem=t2%10;
					int mult=1;
					for(int i=1;i<=length;i++)
						{
							mult=rem*mult;
						}
					arms=arms+mult;
					t2=t2/10;
					
				}
				if(no==arms)
				{
					System.out.println(no+"is a armstrong number");
				}
				else
				{
					System.out.println(no+"is not a armstong number");
				}
	}
}