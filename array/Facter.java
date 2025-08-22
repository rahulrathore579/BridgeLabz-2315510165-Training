package array;

public class Facter {
    public static void main(String[] args) {
        int num = 25;
        int[] arr =+;  
        int k = 0;

        for (int i = 1; i <= num; i++) {   
            if (num % i == 0) {
                arr[k] = i;
                k++;
            }
        }

        
        for (int x = 0; x < k; x++) {
            System.out.print(arr[x] + " ");
        }
    }
}
