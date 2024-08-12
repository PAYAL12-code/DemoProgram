package Demo.com;

import java.util.HashSet;

public class FindMissingElment {
public static void main(String[] args) {
	int[] ar = {1,3,6,7,5};
	
	HashSet<Integer> set = new HashSet<>();
	
	for(int i: ar) {
		set.add(i);
	}
	
	int n = ar.length+1;
	
	for(int i=1;i<n;i++) {
		if(!set.contains(i)) {
			System.out.println(" "+i);
		}
	}
	
}
}
