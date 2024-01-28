package biginteger;

import java.math.BigInteger;
import java.math.BigDecimal;

public class _BigInteger {

	public static void main(String[] args) {
		BD();
	}
	
	static void BD() {
		double x = 0.03;
		double y = 0.04;
		double ans = y - x;
		System.out.println(ans);
		
		BigDecimal X = new BigDecimal("0.03");
		BigDecimal Y = new BigDecimal("0.04");
		BigDecimal answer = Y.subtract(X);
		System.out.println(answer);
		
		BigDecimal a = new BigDecimal("45624789427.29849249873489");
		BigDecimal b = new BigDecimal("14938532981.34598239825823");
		
		//operations
		System.out.println(b.add(a));
		System.out.println(a.subtract(b));
		System.out.println(b.multiply(a));
		System.out.println(b.pow(2));
		System.out.println(b.negate());
		
		// constants
		BigDecimal cons = BigDecimal.ONE;
		System.out.println(cons);
	}
	
	static void BI() {
		int a = 30;
		int b = 67;
		
		BigInteger A = BigInteger.valueOf(5);
		BigInteger B = BigInteger.valueOf(6);
		BigInteger C = new BigInteger("87534654754357373445734347455735765");
		BigInteger X = new BigInteger("87534654754337473445734347455735765");
		int c = C.intValue(); // convert BI to integer
		
		
		// constants
		BigInteger D = BigInteger.TEN;
		
		//addition
		BigInteger s = A.add(B);
		BigInteger sum = C.add(X);
		
		System.out.println(s);
		System.out.println(C);
		System.out.println(D);
		System.out.println(sum);
		System.out.println(c);
		
		BigInteger m = C.multiply(X);
		System.out.println(m);
		
		BigInteger sub = C.subtract(X);
		System.out.println(sub);
		
		BigInteger div = X.divide(C);
		System.out.println(div);
		
		BigInteger rem = X.remainder(C);
		System.out.println(rem);
		
		if(X.compareTo(C) < 0) {
			System.out.println("Yes");
		}
	}

}
