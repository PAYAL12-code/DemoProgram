package Demo.com;

public class ForLoop {
	public static void main(String[] args) {
	 int n = 3;// Number of lines to print
     for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
             if (i == j) {
                 System.out.print(1);
             } else {
                 System.out.print(0);
             }
         }
         System.out.println(); // Move to the next line after each row is printed
     }
}
}
