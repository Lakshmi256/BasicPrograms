package functionalPrograms;
import java.util.Scanner;
import java.lang.Math;
public class Qadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner x=new Scanner(System.in);
	System.out.println("enter ab c values");
	
	double a=x.nextDouble();
	double b=x.nextDouble();
	double c=x.nextDouble();
	double delta=(b*b)-(4*a*c);
	double x1=(-b)+ Math.sqrt(delta)/2*a;
	double x2=(-b)- Math.sqrt(delta)/2*a;
	
	System.out.println(x1+" "+x2);}

}
