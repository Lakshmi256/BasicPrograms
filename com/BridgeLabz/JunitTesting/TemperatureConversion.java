package com.BridgeLabz.JunitTesting;
//purpose:to convert the given temperature from degree to farhenhiet and vice versa.


import com.BridgeLabz.utility.Util;

public class TemperatureConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.out.println("enetr the temperature");
double T=Util.readdouble();
System.out.println("if c type 1 else 0");
int x=Util.readInt();
Util.temp(x, T);
	}

}
