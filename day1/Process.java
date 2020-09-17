package hcl;

public class Process {
//qn2 binary operations
	public int addition(int num1,int num2)
	{
		return num1+num2;
	}
	public int subtract(int num1,int num2)
	{
		return num1-num2;
	}
	public int multiply(int num1,int num2)
	{
		return num1*num2;
	}
	public int remainder(int num1,int num2)
	{
		return num1%num2;
	}
	public int divide(int num1,int num2)
	{
		return num1/num2;
	}
	
//qn3 average of 3 numbers
	public float average(int num1,int num2,int num3)
	{
		return (num1+num2+num3)/3;
	}
//qn4 swapping of 2 numbers
	public void swap(int num1,int num2)
	{
		System.out.println("before swapping:");
		System.out.println("num1 = "+num1+"\nnum2 = "+num2);
		int temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("After swapping:");
		System.out.println("num1 = "+num1+"\nnum2 = "+num2);
	}
//qn5 Given number is prime or not
	public String primeOrNot(int num)
	{
		if(num==0)
		{
			return "0 is neither prime nor composite";
		}
		else if(num==1)
		{
			return "1 is non-prime";
		}
		else if(num==2)
		{
			return "2 is non-prime";
		}
		else
		{
		int flag=1;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=0;
				break;
			}		
		}
		if(flag==1)
		
          return "Given num is prime";
		
		else
			return "Given num is non-prime";
		
		}
		
	}
//For multiples of 3 print "Fizz" and for multiples of 5 print "Buzz"	
	public void iteration()
	{
		for(int i=1;i<=100;i++)
		{
			if(i%3==0&&i%5==0)
				System.out.println(i+" : Fizz Buzz");
			else if(i%3==0)
			    System.out.println(i+" : Fizz");
			else if(i%5==0)
				System.out.println(i+" : Buzz");
			
		}
	}
}
