package com.BridgeLabz.JunitTesting;
//purpose: To find the day of a week with the day month and year taken as input.

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
