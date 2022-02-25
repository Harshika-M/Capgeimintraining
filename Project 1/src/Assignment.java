class calculate{
	int a;
	void increment() {
		a=4;
		System.out.println("Before increment: "+a);
		++a;
		System.out.println("Pre increment: "+a);
		a++;
		System.out.println("post increment: "+a );
		}
	void decrement() {
		a=4;
		System.out.println("Before decrement: "+a);
		--a;
		System.out.println("pre decrement: "+a);
		a--;
		System.out.println("post decrement: "+a);
		
		
	}
	
	
}
public class Assignment {
	public static void main(String [] args) {
	calculate c=new calculate()	;
	c.increment();
	c.decrement();
	
		
	}

}
