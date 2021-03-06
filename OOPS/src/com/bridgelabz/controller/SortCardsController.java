package com.bridgelabz.controller;

import com.bridgelabz.implementation.CardsImplementation;
import com.bridgelabz.utillity.Queue;

public class SortCardsController extends CardsImplementation {
	public static String[] sort(String[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j - 1].compareTo(arr[j]) > 0) {
					String st = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = st;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		SortCardsController obj = new SortCardsController();
		String[] deck = obj.addCards();
		sort(deck);
		Queue<String> queue1 = new Queue<String>();
		for (String s : deck) {
			queue1.enqueue(s);
		}
		queue1.show();
		Queue<String> p1 = new Queue<String>();
		p1.enqueue("Player-1 ");
		Queue<String> p2 = new Queue<String>();
		p2.enqueue("Player-2 ");
		Queue<String> p3 = new Queue<String>();
		p3.enqueue("Player-3 ");
		Queue<String> p4 = new Queue<String>();
		p4.enqueue("Player-4 ");
		String str1 = queue1.toString();
		String[] array1 = str1.split(" ");
		String[][] array2 = obj.distribute(array1);
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 9; j++) {
				if (i == 0)
					p1.enqueue(array2[i][j]);
				else if (i == 1)
					p2.enqueue(array2[i][j]);
				else if (i == 2)
					p3.enqueue(array2[i][j]);
				else if (i == 3)
					p4.enqueue(array2[i][j]);
			}
		}
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
	}
}
