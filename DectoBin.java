import java.util.*;
public class DectoBin {
	
	static int decimaltobinary(int n) {
		if(n==0) return 0;
		return n%2+(10*decimaltobinary(n/2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(decimaltobinary(n));
	}

}
