package Demo.com;

import java.util.Arrays;

public class Demo1 {
static public void main(String[] args) {
	
	
		 int arr [] = {1,3,5,6,7};
		 int len = arr.length;
		 Arrays.sort(arr);
		 System.out.println(arr[len-2]);
		 int num = arr[0];
		 for(int i = 1;i<arr.length;i++){
		      num++;
		      if(num == arr[i]){
		          continue;
		      }
		      
		      System.out.print(num + " ");
		      num = arr[i];
		     }
		     
		 }}
		 
	
