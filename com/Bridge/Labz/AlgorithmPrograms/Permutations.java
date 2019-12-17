package com.Bridge.Labz.AlgorithmPrograms;

public class Permutations {
		// TODO Auto-generated method stub
		public static void swap(char[] ch, int i, int j)
		{
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
		}
		public static void permutations(char[] c, int currentIndex)
		{
		if (currentIndex == c.length - 1) {
		System.out.println(String.valueOf(c));
		}
		for (int i = currentIndex; i < c.length; i++)
		{
		swap(c, currentIndex, i);
		permutations(c, currentIndex + 1);
		swap(c, currentIndex, i);
		}}
	
	
		public static void main(String[] args) {
			String x="abcd";
				permutations(x.toCharArray(),0);
	

	}
	}

