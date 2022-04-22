import java.util.*;
import static java.lang.System.*;
class nxn{
	int odd;
	public nxn(int a){
		odd=a;
	}
	public void show(){
		out.println("Output: "+odd);
	}
}
class nxns extends nxn{

	public nxns(int a){
		super(a);
		super.show();
		show();
	}
	public void show(){
			if (odd>9)
				out.print("    ");
			else
				out.print("   ");
			for (int i=1;i<=odd;i++)
				if (odd>9)
					out.printf("%4d",i);
				else
					out.printf("%3d",i);
			out.println();
			for (int i=1;i<=odd;i++){
				if (odd>9)
					out.printf("%4d",i);
				else
					out.printf("%3d",i);
				for (int j=1;j<=odd;j++){
					if (i<(odd+1)/2-1 && j<=(odd+1)/2 && (i+j)>(odd+1)/2)
						if (odd>9)
							out.printf("%4d",i*j);
						else
							out.printf("%3d",i*j);
					else if (i<(odd+1)/2-1 && j>(odd+1)/2 && (j-i)<(odd+1)/2)
						if (odd>9)
							out.printf("%4d",i*j);
						else
							out.printf("%3d",i*j);
					else if (i>(odd+1)/2+1 && j<=(odd+1)/2 && (i-j)<(odd+1)/2)
						if (odd>9)
							out.printf("%4d",i*j);
						else
							out.printf("%3d",i*j);
					else if (i>(odd+1)/2+1 && j>(odd+1)/2 && (i+j)<=odd+(odd+1)/2)
						if (odd>9)
							out.printf("%4d",i*j);
						else
							out.printf("%3d",i*j);
					else
						if (odd>9)
							out.print("    ");
						else
							out.print("   ");
				}
				out.println();
			}
			out.println();
	}
}
		 
public class main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    while(sc.hasNextInt()){
    	int a=sc.nextInt();
    	if (a!=0 && a%2!=0 && (8<=a && a<=20)){
    		nxns input=new nxns(a);
    	}
    	else
    		out.println("Input Error! ");
    }
  }
};