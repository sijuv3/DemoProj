package test.demo;

public class Double {

	public static void main(String args[]) {
		test();
	}
	
	public static void test() {
		double a = 2.0;
		double b = 3.0;
		if (java.lang.Double.compare(a, java.lang.Double.valueOf(0.0)) <= 0) {
			System.out.println("less than zero");
		} else if (java.lang.Double.compare(a, java.lang.Double.valueOf(0.0)) >= 0) {
			System.out.println("greater than zero");
		}
	}
}
