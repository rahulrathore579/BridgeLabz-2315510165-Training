package array;

public class remove_all_occurr {
	public static void main(String[] args) {
		int[] arr= {0,1,3,0,2,2,4,2};
		int ele=2;
		int count=0;
		for(int i=0; i<arr.length;i++) {
			if(arr[i]!=ele) {
				
				count++;
			}
		}
		System.out.println(count);
		int[] ans=new int[count];
		int k=0;
		for(int j=0;j<arr.length;j++) {
			if(arr[j]!=ele) {
				System.out.print(arr[j]+" ");
				ans[k]=arr[j];
			}
		}
	}
}
