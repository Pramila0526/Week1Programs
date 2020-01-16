package com.bridgelabz.fellowshipprogramss.junit;
import com.bridgelabz.fellowshipprogramss.utility.Utility;
/**
 * @author Pramila0526 
 * Date :21/11/2019
 *
 */
public class SquareNewton 
{
    public static void main(String[] args)
    {
        System.out.println("Enter the  Number");
        double c=Utility.doubleInput();
        System.out.println(Utility.sqrtNewton(c));
       
    }
}