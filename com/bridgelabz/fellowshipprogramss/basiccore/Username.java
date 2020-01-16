package com.bridgelabz.fellowshipprogramss.basiccore;
import com.bridgelabz.fellowshipprogramss.utility.Utility;
/**
 * @author Pramila0526
 * Date   :21/11/2019
 *
 */
public class Username {

	
		public static void main(String[] args) {
			
			int n = 1;
			String user = "Hello <<UserName>>, How are you?";
			String userName=" ";
			System.out.println("Enter Username");
			while (n > 0) 
			{
				userName = Utility.stringInput();
				
				if (userName.length() < 3)
					System.out.println("Please Ensure UserName has \nminimum 3 characters ");
				else
					n--;
			}
			System.out.println(Utility.replaceUsername(userName,user));
		}
	}

