import java.util.*;

public class oddeven {
	public static boolean IsEven(int a) {
	return a%2==0;
	
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n;
		
		System.out.println("Enter a Number");
		n=sc.nextInt();
		if(IsEven(n)) {
			System.out.println("EVEN");
		}else {
			System.out.println("ODD");
		}
	}

}
