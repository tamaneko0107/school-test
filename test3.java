import java.util.*;
import static java.lang.System.*;
public class main{
  public static void main(String[] args) {
    Scanner scr=new Scanner(System.in);
    int months[]={31,28,31,30,31,30,31,31,30,31,30,31};
    while(scr.hasNextInt()){
    	int year=scr.nextInt();
	    	if (year<1920){
	    		System.out.println("Input Error");
	    		continue;
	    	}
    	int month=scr.nextInt();
	    	if (month>12){
	    		System.out.println("Please enter the correct format");
	    		continue;
	    	}
    	int day=3; //start
    	if ((year-1920)>0){
    		for (int j=1920;j<year;j++)
	    		if (j%4!=0 || (j%100==0 && j%400!=0)){
	    			day+=365;
	    		}
	    		else if ((j%4==0 && j%100!=0) || j%400==0)
	    			day+=366;
    	}
    	if (year%4!=0 || (year%100==0 && year%400!=0))
    		months[1]=28;
    	else if ((year%4==0 && year%100!=0) || year%400==0)
    		months[1]=29;
    	day%=7;
    	int i;
    	for (int m=0;m<(month-1);m++)
    		day+=months[m];
    	System.out.println("============================");
    	System.out.println("Sun Mon Tus Wed Thu Fri Sat ");
    	System.out.println("============================");
    	int space=(day+1)%7;
    	for (int s=space-1;s>=0;s--)
    		System.out.printf("%3d ",months[month-2]-s);
    	for (i=1;i<=months[month-1];i++){
    		System.out.printf("%3d ",i);
    		if((i+space)%7==0)
    			System.out.println();
    	}
    	
    	if ((i+space)%7==0)
    		for (int j=1;j<=(i+space)%7+1;j++){
    			System.out.printf("%3d ",j);
    		}
    	else
    		for (int j=1;j<=(7-(i+space)%7)+1;j++)
    			System.out.printf("%3d ",j);
    	System.out.println();
    	System.out.println();
    }
  }
};