package week1.day2;

public class Calculator {
	

	public void add() {
	   int num1=2,num2=3,num3=4,sum;
	   sum=num1+num2+num3;
	   System.out.println(sum);	 
	}
	public void sub() {
	       int num1=4,num2=2,sub;
		   sub=num1-num2;
		   System.out.println(sub);
	}
	public void mul() {
		double num1=24.6,num2=34.3,mul;
		mul=num1*num2;
		System.out.println(mul);
	}
	public void divide() {
		float num1=5,num2=2,div;
		div=num1/num2;
		System.out.println(div);
	}
	public static void main(String[] args) {
		Calculator calc=new Calculator();
		calc.add();
		calc.sub();
		calc.mul();
		calc.divide();
		

	}

}
