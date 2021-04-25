import java.io.*;
import java.lang.Math;
public class lineComparisonMaster{
	public static void main(String args[]){
		System.out.println("Wellcome To Line Comparison Computation Program On Master Branch");
		lineFunction lf=new lineFunction();
		int x1=lf.getLineValue();
		int x2=lf.getLineValue();
		int y1=lf.getLineValue();
		int y2=lf.getLineValue();
		double length=lf.getLineLength(x1,x2,y1,y2);
		System.out.println("length:"+length);
	}
}
class lineFunction{

	int getLineValue(){
        	int value=(int)(Math.random()*100);
        	return value;
        }

	double getLineLength(int x1,int x2, int y1,int y2){
		double x=Math.pow((x2-x1), 2);
		double y=Math.pow((y2-y1), 2);
		return Math.sqrt(x+y);
	}

}
