package array;
import java.util.*;
public class FizzBuzz {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			if(i%3==0 && i%5!=0) {
				System.out.print("FIZZ ");
			}
			else if(i%5==0 && i%3!=0) {
				System.out.print("BUZZ ");
			}
			else if(i%(3*5)==0) {
				System.out.print("FIZZBUZZ ");
			}
			else {
				System.out.print(i+" ");
			}
		}
	}
}
