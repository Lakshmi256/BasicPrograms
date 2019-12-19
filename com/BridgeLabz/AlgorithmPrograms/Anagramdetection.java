package com.BridgeLabz.AlgorithmPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Anagramdetection {

	
		// TODO Auto-generated method stub
		static boolean areAnagram(char[] str1, char[] str2) 
		{ 
		    int n1 = str1.length; 
		    int n2 = str2.length; 
		    if (n1 != n2) 
		        return false; 
		    Arrays.sort(str1); 
		    Arrays.sort(str2); 
		    for (int i = 0; i < n1; i++) 
		        if (str1[i] != str2[i]) 
		            return false; 
		    return true; 
		} 
		public static void main(String[] args) {
	Scanner a=new Scanner(System.in);
	String st=a.nextLine();
	String st1=a.nextLine();
	 char[] str1 = st.toCharArray(); 
	 char[] str2= st1.toCharArray();
	 a.close();
		boolean b=areAnagram(str1,str2);
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
