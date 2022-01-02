import java.util.*;
public class TargetOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] a=new int[10];
		int start=0;
		int end=a.length-1;
		int first=-1;
		int last=-1;
		int target=sc.nextInt();
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("haunt begins...");
		int m=start+(end-start)/2;
		
		while(start<=end) {
			m=start+(end-start)/2;
			if(target==a[m]) {
				first=m;
				start=m+1;
				System.out.println(first);
//				System.out.println(start);
//				System.out.println(end);
				
			}
			else if(target<a[m]) {
				
				end=m-1;
			//	System.out.println(first);
//				System.out.println(start);
//				System.out.println(end);
			}
			else if(target>a[m]) {
				
				start=m+1;
				
				System.out.println(first);
//				System.out.println(start);
//				System.out.println(end);
			}
		}
		
//		System.out.println(first);
//		System.out.println(start);
//		System.out.println(end);
		
	}

}
