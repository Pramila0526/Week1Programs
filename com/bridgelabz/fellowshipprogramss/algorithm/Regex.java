package com.bridgelabz.fellowshipprogramss.algorithm;
import java.io.IOException;
import java.util.*;
/**
 * @author Pramila0526
 * Date   :21/11/2019
 *
 */
public class Regex
{
	public static void main(String args[]) throws IOException
	{
		
		RegexUtility utility=new RegexUtility();
		UserDetails userDetails=new UserDetails();

		System.out.println("Enter FirstName:");
		userDetails.setfName(utility.inputWord());
		
		System.out.println("Enter LastName:");
		userDetails.setlName(utility.inputWord());

		System.out.println("Enter MobileNumber:");
		userDetails.setmobileNo(utility.inputWord());
		
		//Setting Currrent date
		userDetails.setdate(utility.getFormatedDate(new Date()));

		System.out.println(utility.convertString(userDetails,utility.getFileText("/home/admin94/Desktop/Text1.txt")));

		
	}

}
