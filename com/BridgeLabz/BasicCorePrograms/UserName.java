package com.BridgeLabz.BasicCorePrograms;
import com.BridgeLabz.utility.Util;
public class UserName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String x=Util.readString();
String y="Hello <<UserName>>, How are you? "; 
	y=y.replace("<<UserName",x);
	
	}

}
