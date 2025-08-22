package array;
public class Leader{
	public static void main(String[] args) {
		int[] arr= {16,17,4,3,5,2};
		int num=arr[arr.length-1];
		System.out.print(num+" ");
		for(int i =arr.length-2;i>=0;i--) {
			if(arr[i]>=num) {
				num=arr[i];
				System.out.print(num+" ");
			}
			
		}
	}
}



//public class Leader {
//	public static void main(String[] args) {
//		int[] arr= {16,17,4,3,5,2};
//		int[] ans=new int[arr.length];
//		int n=0;
//		int k=0;
//		for(int i=0;i<arr.length;i++) {
//			boolean a=true;
//			for(int j=i;j<arr.length;j++) {
//				if(arr[i]<arr[j]) {
//					a=false;
//				}
//			}
//			if(a){
//				ans[k]=arr[i];
//				k++;
//				n++;
//			}
//		}
//		
//		for(int m=0;m<n;m++) {
//			System.out.print(ans[m]+" ");
//		}
//	}
//	
//}
