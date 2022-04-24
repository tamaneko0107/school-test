import java.util.*;
import static java.lang.System.*;
public class main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    while(sc.hasNextInt()){
    	int day=sc.nextInt();
    	float temp[]=new float[day*3];
    	int i=-1;
    	while(++i!=day*3){
    		float a=sc.nextFloat();
    		temp[i]=a;
    	}
    	int d=-1;
    	while(++d!=day){
	    	float max=0,min=temp[d*3],avg=0;
	    	int count=0;
	    	for (int j=d*3;j<d*3+3;j++){
	    		avg+=temp[j];
	   			if (max<temp[j])
	   				max=temp[j];
	   			if (min>temp[j])
	   				min=temp[j];
	   			if (temp[j]>=20)
	   				count++;
	   		}
	   		out.printf("day  %d: %.2f, %.2f, %.2f, %d",d+1,avg/3,max,min,count);
	   		out.println();
	   	}
    }
  }
};