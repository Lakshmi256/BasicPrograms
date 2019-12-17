package com.BridgeLabz.LogicalPrograms;

import java.util.Scanner;

public class Gambler {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	int win=0,loss=0,i=0;
Scanner v=new Scanner(System.in);
System.out.println("enter stake and goal");
int stake=v.nextInt();
int goal=v.nextInt();
System.out.println("enter number of times");
int n=v.nextInt();
while((i!=n)&&(stake!=goal))
{
if(Math.random()<0.5)
{
	win++;
	stake++;
}
else
{
	loss++;
	stake--;
}
i++;
}
int wp=(win*100)/n;
int lp=(loss*100)/n;
System.out.println("number of wins ="+win);
System.out.println("percentage wins ="+wp+"%");
System.out.println("percentage loss ="+lp+"%");

}

}