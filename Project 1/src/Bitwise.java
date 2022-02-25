class calculator{
	int num1=15;
	int num2=5;
	void bitwiseAnd() {
		int a= num1&num2;
		System.out.println("Bitwise And of two numbers: "+a);
		
	}
	void bitwiseOr() {
		int b=num1|num2;
		System.out.println("Bitwise Or of two numbers: "+b);
		
	}
	void bitwiseXor() {
		int c=num1^num2;
		System.out.println("Bitwise Xor of two numbers: "+c);
	}
	void bitwiseNot() {
		int d=~num1;
		System.out.println("Bitwise Not of two numbers:"+d);
		}
}
public class Bitwise {
	public static void main(String[] args) {
		calculator c=new calculator();
		c.bitwiseAnd();
		c.bitwiseOr();
		c.bitwiseXor();
		c.bitwiseNot();
		
	}

}
