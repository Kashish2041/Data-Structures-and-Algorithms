package ds;
import java.util.*;

public class basic_Stack 
{
	int MAX=5;
	int top=0;
	int stack[]=new int[5];
	public void push(int ele)
	{
		if(top>=MAX)
		{
			System.out.println("stack is full");
		}
		else {
			stack[top++]=ele;
		}
	}
	public void show()
	{
		for(int i=0;i<top;i++)
		{
			System.out.println(stack[i]);
		}
	}
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("stack is empty");
		}
		
		int data;
		top--;
			data=stack[top];
			return data;
	}
	public int size()
	{
		return top;
	}
	public boolean isEmpty()
	{
		return top<=0;
	}
	
	public static void main(String[] args)
	{
		basic_Stack stk=new basic_Stack ();
		stk.push(10);
		stk.push(20);
		stk.push(30);
		stk.push(40);
		stk.show();
		System.out.println("size of stack "+stk.size());
		System.out.println();
		stk.pop();
		stk.show();
		System.out.println("size of stack "+stk.size());
		System.out.println();
		stk.pop();
		stk.show();
		System.out.println("size of stack "+stk.size());
		System.out.println();
		stk.pop();
		stk.show();
		System.out.println("size of stack "+stk.size());
		
		
	}

}
