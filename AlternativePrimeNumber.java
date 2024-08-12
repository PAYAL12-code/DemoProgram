package Demo.com;

public class AlternativePrimeNumber {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 50;
		
		for(int i=num1; i<=num2;i++) {
			int count = 0;
			for(int j=2;j<=i-1;j++) {
				if(i%j==0) {
					count=count+1;
				}
			}
			
			if(count==0) {
				System.out.print(i+",");
			}
		}
	}
}
