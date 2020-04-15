import java.util.Arrays;

public class Sortintstr {
public static void main(String[] args) {
	int[] intarr = {11,15,2,4,20,18};
	//sorting Integer by using pre-built function:
	System.out.println("Integer array before sorting "+ Arrays.toString(intarr));
	Arrays.sort(intarr);
	System.out.println("Integer array after sorting "+ Arrays.toString(intarr));
	//sorting String by using pre-built function:
	String[] str = {"Dipesh","Kushwaha","James","Bond","Thor" };
	System.out.println("String array before sorting "+ Arrays.toString(str));
	Arrays.sort(str);
	System.out.println("String array after sorting "+ Arrays.toString(str));
	for(int i=0;i<intarr.length;i++) {
		for(int j=i;j<intarr.length-2;j++) {
			if(intarr[i]>intarr[j+1]) {
				int temp=0;
				temp =intarr[i];
				intarr[i] =intarr[j+1];
				intarr[j+1]=temp;
				
			}
		}System.out.print(intarr[i]+" ");
		
	}System.out.println();
	
	for(int i=0;i<str.length;i++) {
		for(int j=i;j<str.length-2;j++) {
			if(str[i].compareToIgnoreCase(str[j+1])>0) {
				String temp="";
				temp =str[i];
				str[i] =str[j+1];
				str[j+1]=temp;
				
			}
		}
		System.out.print(str[i]+" ");
	}
	
}
}
