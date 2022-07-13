package week1.day2;

public class calculator {

	public static void main(String[] args) {
		calculator calc = new calculator();
		calc.add(10, 20);
		calc.sub(50, 40.4f);
		calc.mul(50.2d, 40, 10.2d);
		calc.div(1000000l, 10.5d, 3.2f);

	}
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	public void sub(int a,float b) {
		System.out.println(a-b);
	}
	public void mul(double a,int b, double c ) {
		System.out.println(a*b*c);
	}
	public void div(long a,double b, float c) {
		System.out.println(a/b/c);
	}

}
