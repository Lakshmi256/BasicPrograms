package com.BridgeLabz.functionalPrograms;
//purpose: to find the distance between two points in x-y plane.



import com.BridgeLabz.utility.Util;
public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

double x=Util.readInt();
double y=Util.readInt();

double sum=Util.distance(x,y);
System.out.println(sum);
	}

}
