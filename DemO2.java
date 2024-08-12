package Demo.com;

public class DemO2 {
public static void main(String[] args) {
	//print sub array sum equal to k
	int arr[] = {1,2,3};
	int k = 3;

  int result =0;
	for(int i=0;i<=arr.length;i++) {
		int sum = 0;
		for(int j=i;j<arr.length;j++) {
		 sum = sum+arr[j];
		 if(sum==k) {
			 result++;
		 }
			
			
			
		}
		
	}
	System.out.println(k+"is"+result);
	
}
}
