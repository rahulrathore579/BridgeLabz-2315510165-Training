package array;
import java.util.*;

public class multi_dim {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		int columns=sc.nextInt();
		int[][] arr=new int[rows][columns];
		int[] new_arr=new int[rows*columns];
		int k=0;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				arr[i][j]=sc.nextInt();
				new_arr[k]=arr[i][j];
				k++;
			}
		}
		for(int x:new_arr) {
			System.out.print(x+" ");
		}
		
		
	}
}
