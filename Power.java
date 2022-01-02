import java.util.*;
public class Power {
	
	static int power(int base,int exponent) {
		if(exponent==0) return 1;
		return base*power(base,exponent-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int base=sc.nextInt();
		int exponent=sc.nextInt();
		
		System.out.println(power(base,exponent));
	}

}
