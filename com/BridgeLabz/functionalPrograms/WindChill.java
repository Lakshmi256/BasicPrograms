package com.BridgeLabz.functionalPrograms;
//purpose:to find the windchill using the equation.


import com.BridgeLabz.utility.Util;
public class WindChill {
public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the t and v");
double t=Util.readdouble();
double v=Util.readdouble();
Util.wind(t, v);
}
}