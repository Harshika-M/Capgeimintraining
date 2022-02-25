class strfunc{
	String name;
 strfunc(String a) {
		name=a;
	}
 void sg() {
    System.out.println("name: "+name);
	System.out.println("3rd character of name: "+name.charAt(2));
	System.out.println("Jack compared to Sam:"+name.compareTo("Sam"));
	System.out.println("Is Jack equal to Sam:"+name.equals("sam"));
	System.out.println("Length of name:"+name.length());
	System.out.println("Replace J with P in name:"+name.replace('J', 'P'));
	int index=name.indexOf('c');
	System.out.println(index);
	String t=name.substring(0,3);
	System.out.println(t);
}
}
public class stringPractise {
public static void main(String[] args) {
	strfunc s=new strfunc("Jack");
	s.sg();
}
}
