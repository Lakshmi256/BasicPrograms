package com.BridgeLabz.LogicalPrograms;
import java.util.Scanner;
public class TicTacToe {
	
public static void print(char[][] ar) {
System.out.println(ar[0][0]+" "+ar[0][1]+" "+ar[0][2]);
System.out.println(ar[1][0]+" "+ar[1][1]+" "+ar[1][2]);
System.out.println(ar[2][0]+" "+ar[2][1]+" "+ar[2][2]);
System.out.println("------");


}

public static char[][] userinput(int row , int column, char[][] a){
a[row][column]='x';
return a;

}
public static char[][] compinput(int row , int column, char[][] a){
a[row][column]='o';
return a;


}


public static void main(String[] args) {
// TODO Auto-generated method stub
	TicTacToe ab=new TicTacToe();
int turn=0, row=0,col=0;
boolean win=false;
char[][] a={{' ',' ',' '},{' ',' ',' ',},{' ',' ',' ',}};

Scanner v=new Scanner(System.in);
while((turn!=9)||(win))
{
if((turn!=9)&&(!win))
{
System.out.println("enter your move");
System.out.println("enter the row 0-2");
row=v.nextInt();
System.out.println("enter the column 0-2");
col=v.nextInt();

while((a[row][col]=='x')||(a[row][col]=='o')) {
System.out.println("invalid move");
System.out.println("enter the row 0-2");
row=v.nextInt();
System.out.println("enter the column 0-2");
col=v.nextInt();
}
a=ab.userinput(row,col, a);

ab.print(a);
}
if((a[0][0]=='x' && a[0][1]=='x' && a[0][2]=='x') || (a[1][0]=='x' && a[1][1]=='x' && a[1][2]=='x') || (a[2][0]=='x' && a[2][1]=='x' && a[2][2]=='x') || (a[0][0]=='x' && a[1][0]=='x' && a[2][0]=='x') || (a[0][1]=='x' && a[1][1]=='x' && a[2][1]=='x') || (a[0][2]=='x' && a[1][2]=='x' && a[2][2]=='x') || (a[0][0]=='x' && a[1][1]=='x' && a[2][2]=='x') || (a[0][2]=='x' && a[1][1]=='x' && a[2][0]=='x'))
{ 
System.out.println("you win");
win=true;
break;
}
turn++;
if((turn!=9)&&(!win))
{
row=(int)(Math.random()*3);
col=(int)(Math.random()*3);
while((a[row][col]=='x')||(a[row][col]=='o')) {
row=(int)(Math.random()*3);
col=(int)(Math.random()*3);
}
a=ab.compinput(row,col, a);
ab.print(a);
if((a[0][0]=='o' && a[0][1]=='o' && a[0][2]=='o') || (a[1][0]=='o' && a[1][1]=='o' && a[1][2]=='o') || (a[2][0]=='o' && a[2][1]=='o' && a[2][2]=='o') || (a[0][0]=='o' && a[1][0]=='o' && a[2][0]=='o') || (a[0][1]=='o' && a[1][1]=='o' && a[2][1]=='o') || (a[0][2]=='o' && a[1][2]=='o' && a[2][2]=='o') || (a[0][0]=='o' && a[1][1]=='o' && a[2][2]=='o') || (a[0][2]=='o' && a[1][1]=='o' && a[2][0]=='o'))
{
System.out.println("computer wins");
win=true;
break;
}
turn++;
}

}
if((!win)||(turn==9))
{
System.out.println("draw");
}
}
}