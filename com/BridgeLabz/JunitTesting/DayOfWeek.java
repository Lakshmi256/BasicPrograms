package com.BridgeLabz.JunitTesting;

import com.BridgeLabz.utility.Util;

public class DayOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the d m and y values");

int d=Util.readInt();
int m=Util.readInt();
int y=Util.readInt();
Util.dayofweek(d,m,y);
	}

}
