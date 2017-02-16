public class Test {
	public static void main(String[] args) {
		long result = gcd(15, 3);
		System.out.println(result);
	}

	public static long gcd(long m, long n) {
		while (n != 0) {
			long rem = m % n;
			m = n;
			n = rem;
		}
		return m;
	}
}
