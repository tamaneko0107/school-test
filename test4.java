import java.util.*;
import static java.lang.System.*;
public class main{
 public static void main(String[] args) {
 
		char c[]={'C','D','H','S'}; // 1 to 13
		char p[]={'A','2','3','4','5','6','7','8','9','T','J','Q','K'};
		
		Scanner scr=new Scanner(System.in);
		int poker[]=new int[52];
		for (int i=0;i<poker.length;i++){
			poker[i]=scr.nextInt();
		}
		
		out.println("Before:");
		for (int i=0; i<4; i++){
			out.print("player "+(i+1)+":");
			for (int j=0+13*i; j<13*(i+1); j++){
				out.print("  "+c[poker[j]%4]+p[poker[j]/4]);
			}
			out.println(" ");
		}
		
		out.println("After:");
		for (int i=0; i<4; i++){
			out.print("player "+(i+1)+":");
			for (int j=0+13*i; j<13*(i+1); j++){
				for(int n=j+1; n<13*(i+1); n++){
					if (poker[j]>poker[n]){
						int temp=poker[j];
						poker[j]=poker[n];
						poker[n]=temp;
					}
				}	
				out.print("  "+c[poker[j]%4]+p[poker[j]/4]);
			}
			out.println(" ");
		}
	}
};