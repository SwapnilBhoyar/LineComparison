import java.io.*;
import java.lang.*;
public class lineComparisonMaster{
	public static void main(String args[]){
		System.out.println("Wellcome To Line Comparison Computation Program On Master Branch");
		lineFunction lf=new lineFunction();
		int x1=lf.getLineValue();
		int x2=lf.getLineValue();
		int y1=lf.getLineValue();
		int y2=lf.getLineValue();
		int x11=lf.getLineValue();
                int x12=lf.getLineValue();
                int y11=lf.getLineValue();
                int y12=lf.getLineValue();
		double length=lf.getLineLength(x1,x2,y1,y2);
		double length1=lf.getLineLength(x11,x12,y11,y12);

		if(String.valueOf(length).equals(String.valueOf(length1))){
			System.out.println("Lines are equal");
		}
		else
			System.out.println("Lines are not equal");
	}
}
class lineFunction{

	int getLineValue(){
        	int value=(int)(Math.random()*10);
        	return value;
        }

	double getLineLength(int x1,int x2, int y1,int y2){
		double x=Math.pow((x2-x1), 2);
		double y=Math.pow((y2-y1), 2);
		return Math.sqrt(x+y);
	}

}
