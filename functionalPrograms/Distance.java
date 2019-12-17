package functionalPrograms;
import java.util.Scanner;
import java.lang.Math;
public class Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner a=new Scanner(System.in);
double x=a.nextDouble();
double y=a.nextDouble();
a.close();
double sum=Math.sqrt((x*x)-(y*y));
System.out.println(sum);
	}

}
