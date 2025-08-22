package array;
import java.util.*;

public class Grade_System {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		int c=sc.nextInt();
		int m=sc.nextInt();
		double per=((p+c+m)/300)*100;
		if(per>=80) {
			System.out.print("A");
		}
		else if(per>=70 && per<79) {
			System.out.print("B");
		}
		else if(per>=60 && per<69) {
			System.out.print("C");
		}
		else if(per>=50 && per<59) {
			System.out.print("D");
		}else if(per>=40 && per<49) {
			System.out.print("E");
		}
		else{
			System.out.print("R");
		}
	}
}
