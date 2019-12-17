package com.BridgeLabz.LogicalPrograms;

public class CouponNum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
char[] chars="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
int max=100000000;
int random=(int)(Math.random()*max);
StringBuffer sb=new StringBuffer();
while(random>0)
{
	sb.append(chars[random%chars.length]);
	random/=chars.length;
}
String c=sb.toString();
System.out.println("coupon number= "+c);
	}

}

