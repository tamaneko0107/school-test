import java.util.*;
import static java.lang.System.*;
class Triangle{
	int a,b,c;
	void setSide(int x,int y,int z){
  		a=x;
  		b=y;
  		c=z;
	}
	void show(){
		if (a+b>c && b+c>a && a+c>b){
			if ((a*a)==(c*c)+(b*b) || (b*b)==(a*a)+(c*c) || (c*c)==(a*a)+(b*b))
				out.println("Right Triangle");
			else if ((a==b) && (b==c) && (a==c))
				out.println("Equilateral Triangle");
			else if ((a==b) || (b==c) || (a==c))
				out.println("Isosceles Triangle");
			else
				out.println("Triangle");
		}
		else
			out.println("Non-Triangular");
	}
}

public class main{
  public static void main(String[] args) {
  	Scanner sc=new Scanner(System.in);
  	Triangle tra=new Triangle();
  	while(sc.hasNextInt()){
  		int x,y,z;
  		try{
		    x=sc.nextInt();
		    y=sc.nextInt();
		    z=sc.nextInt();
		}
		catch(Exception e){
			out.println("Please enter a value");
			continue;
		}
	    tra.setSide(x,y,z);
	    tra.show();
	    out.println();
    }
  }
};