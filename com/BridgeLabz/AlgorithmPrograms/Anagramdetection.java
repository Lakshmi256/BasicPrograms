package com.BridgeLabz.AlgorithmPrograms;
import com.BridgeLabz.utility.Util;
public class Anagramdetection {
		// TODO Auto-generated method stub
		public static void main(String[] args) {
	String st=Util.readString();
	String st1=Util.readString();
	 char[] str1 = st.toCharArray(); 
	 char[] str2= st1.toCharArray();
		boolean b=Util.areAnagram(str1,str2);
		if (b==true)
		{
			System.out.println("given string are anagram");
		}
		else
		{
			System.out.println("given strings are not anagram");
		}
		}
}
