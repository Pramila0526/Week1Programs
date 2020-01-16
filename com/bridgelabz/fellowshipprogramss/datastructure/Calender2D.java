package com.bridgelabz.fellowshipprogramss.datastructure;

import com.bridgelabz.fellowshipprogramss.utility.Utility;

public class Calender2D 
{
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub	
			System.out.println("please enter year");
			int year = Utility.integerInput();
			
			System.out.println("please enter the Month");
			int month = Utility.integerInput();

			//months array
			String[] months= {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sept","Oct","Nov","Dec"};

			//create day array
			int[] days = {0,31,28,31,30,31,30,31,31,30,31,30,31};

			//check for leap year
			if(month==2 && Utility.isLeapYear(year))
			{
				days[month]=29;
			}

			//print headings
			System.out.println("  "+ months[month]+year+ " ");
			System.out.println("S	M	T	W	Th	F	S");

			//starting day
			int d= Utility.dayOfWeek1(month, 1, year);

			//printing calendar
			for(int i=0;i<d;i++)
			{
				System.out.print("	");
			}
			for(int i=1;i<=days[month];i++)
			{
				System.out.printf("%d	",i);
				if(((i+d)%7==0)||(i==days[month]))
				{
					System.out.println();
				}
			}		
		}

	

}