package com.BridgeLabz.LogicalPrograms;

import com.BridgeLabz.utility.Util;

public class Gambler {

	public static void main(String[] args) {
	// TODO Auto-generated method stub


System.out.println("enter stake and goal");
int stake=Util.readInt();
int goal=Util.readInt();
System.out.println("enter number of times");
int n=Util.readInt();
Util.gambler(stake, goal, n);

}

}