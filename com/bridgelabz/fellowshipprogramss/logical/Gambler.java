package com.bridgelabz.fellowshipprogramss.logical;

import com.bridgelabz.fellowshipprogramss.utility.Utility;

public class Gambler 
{

	public static void main(String[] args)
	{
		int stake = 100;
		int goal = 500;
		int trials = 50;
		int bets=0;
		int win=0;
		System.out.println(Utility.gambler(stake,goal,trials,bets,win));
		
	}}