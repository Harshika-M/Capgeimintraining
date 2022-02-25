
public class StringDemo {
public static void main(String[] args) {
	String s1=new String();
	char c[]= {'h','a','i'};
	String s2=new String();
	byte b[]= {'e','v','e','r','y','o','n','e'};
	String s3=new String(b);
	String s4=new String(c);
	String s5=new String(s2);
	String s6=s2;
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	System.out.println(s4);
	System.out.println(s5);
	System.out.println(s6);
}
}
