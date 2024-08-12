package Demo.com;

import java.util.HashSet;

public class NewPreactice {
	
public static void main(String args[]) {
String s = "javaoow jwork as vback boneo";
int[] fre= new int[s.length()];
char minCh=s.charAt(0),maxCh=s.charAt(0);

int min=0,max=0;

char[] ch=s.toCharArray();

for(int i=0;i<ch.length;i++) {
	fre[i]=1;
	for(int j=i+1;j<ch.length;j++) {
		if(ch[i]==ch[j]&&ch[i]!=' ' && ch[i]!='0') {
			fre[i]++;
			ch[j]='0';
			
			
		}
		
	}
}
	min=max=fre[0];
	for(int k=0;k<fre.length;k++) {
		if(min>fre[k]&&ch[k]!='0') {
			min=fre[k];
			minCh=ch[k];
		}
		if(max<fre[k]) {
			max=fre[k];
			maxCh=ch[k];
		}
	}
	

System.out.println(minCh + "-"+maxCh);


 
}
	
}
