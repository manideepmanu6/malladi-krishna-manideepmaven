package samplecalc;
import java.util.Scanner;
class Operation
{
	void operation()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers");
		double first=sc.nextDouble();
		double second=sc.nextDouble();
		System.out.println("1.addition,2.subtraction,3.multiplication,4.division");
		System.out.println("enter the operator of your choice");
		int o=sc.nextInt();
		if(o==1)
		{
			System.out.println(" "+(first+second));
		
		}
		else if(o==2)
		{
			System.out.println(" "+(first-second));
		}
		else if(o==3)
		{
			System.out.println(" "+(first*second));
		}
		else if(o==4)
		{
			System.out.println(" "+(first/second));
		}
		else
		{
			System.out.println("enter coorect choice");
		}
	}
}
class calc
{
	public static void main(String args[])
	{
		Operation m=new Operation();
		m.operation();
	}
}


