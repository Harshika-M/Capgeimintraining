 interface Addable{
	int add(int a,int b);
}

 class adder implements Addable{
	public int add(int a,int b) {
		return a+b;
	}
	
}
public class fl_interface {
    public static void main(String[] args)
    {
    	Addable a=new adder();
    	System.out.println(a.add(4, 5));
    /*	Addable addable=new Addable() {
    		@Override
    	public	int add(int a,int b) {
    		return a+b;	
    		
    		}
    	};System.out.println(addable.add(4,5));*/
    	
    	//Addable addable=(a,b)->System.out.println(a+b);
    	//addable.add(4, 3);
    	}
}
