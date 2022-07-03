package Stack;

import java.util.Scanner;
import java.util.*;
import java.util.Stack;

public class MovieList {
	TableInsertion tb=new TableInsertion();
	Scanner sc=new Scanner(System.in);
	static Stack<Integer> stacklist=new Stack<>();
	
	public void display() {
	
		
		boolean flag=true;
		int language=0;
		while(flag)
		{
			int stackValue=0;
			int stacksize=stacklist.size();
			if(stacksize==0)
			{
				tb.datadisplay(0,0,0);
				System.out.println("ENTER YOUR CHOICE");
				int choice=sc.nextInt();
				if(choice==0)
				{
					flag=false;
				}
					else if(choice<4&&choice>0)
				{
					stacklist.push(choice);
					language=choice;
				}
				else
				{
					System.out.println("INVALID CHOICE..PLEASE ENTER A VALID CHOICE");
				}
				
			}
			
			else
			{
				stackValue=stacklist.peek();
				stacksize=stacklist.size();
			
				tb.datadisplay(stackValue,stacksize,language);
				System.out.println("ENTER 0 FOR EXIT");
				System.out.println("ENTER 9 FOR BACK");
				int choice=sc.nextInt();
				if(choice==0)
				{
					flag=false;
				}
				else if(choice==9)
				{
					stacklist.pop();
				}
			 else if(choice>=1&&choice<=4)
				{
					stacklist.push(choice);
				language=choice;
			
				}
				System.exit(0);
			}
			if(stacklist.size()==3) {
			System.out.println("Movie Booked SuccessFully");
				System.exit(0);
			}
			
		}
		
		
	}
}



