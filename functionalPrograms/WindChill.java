package functionalPrograms;
import java.util.Scanner;
import java.lang.Math;
public class WindChill {
public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the t and v");
Scanner a=new Scanner(System.in);
double t=a.nextDouble();
double v=a.nextDouble();
if ((t>50)&&(v<120)&&(v>3))
{
double w=(35.74+0.6215*t+(0.4275*t-35.75))*Math.pow(v,0.6);
System.out.println("the whind s=chill is :"+w);
a.close();
}
else
{
System.out.println("invalid inputs");
}
}
}