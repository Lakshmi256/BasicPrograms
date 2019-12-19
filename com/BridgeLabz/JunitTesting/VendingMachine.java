package com.BridgeLabz.JunitTesting;
import com.BridgeLabz.utility.Util;
public class VendingMachine {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the cash required");
int cash=Util.readInt();
Util.vend(cash);
}
}