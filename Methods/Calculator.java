class Calculator{
	
	public static void main(String[] calculate){
	
		add(32 , 43);
		sub(45 , 21);
		multiply(21 , 43);
		div(90 , 3);
		mod(46 , 76);

	}
	public static void add(int num1, int num2){
		System.out.println(num1+num2);
	}
	public static void sub(int num3 , int num4){
		System.out.println(num3 - num4);
	}
	public static void multiply(int num5, int num6){
		System.out.println(num5 * num6);
	}
	public static void div(double num7,double num8){
		System.out.println(num7/num8);
	}
	public static void mod(int num9 , int num10){
		System.out.println(num9% num10);
	}
}