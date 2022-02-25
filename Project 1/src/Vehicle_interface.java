interface IVehicle{
	public void drive();
	public void turnLeft();
	public void brake();
}
interface IPublicTransport{
	int getNumberOfPeople();
	
}
class MotorisedVehicle{
	void checkMotor(){
	System.out.println("\nThe motor of the vehicle is in good condition");
	}
}
class Car implements IVehicle{
	 public void brake(){
		System.out.println("Car is in brake mode");
	}
	 public void turnLeft() {
		System.out.println("Car is turning left") ;
	 }
      public void drive() {
    	  System.out.println("Car is in drive mode");
      }
	
}
class train implements IVehicle,IPublicTransport{
	   int nop=536;
	 public void brake(){
			System.out.println("Train is in brake mode");
		}
		 public void turnLeft() {
			System.out.println("Train is turning left") ;
		 }
	      public void drive() {
	    	  System.out.println("\nTrain is in drive mode");
	      }
	     public int getNumberOfPeople() {
	    	 return nop;
	     }
}
public class Vehicle_interface {
   public static void main(String[] args) {
	   IVehicle obj1=new Car();
	   IPublicTransport obj2=new train();
	   obj1.drive();
	   obj1.brake();
	   obj1.turnLeft();
	   obj1=new train();
	   obj1.drive();
	   obj1.brake();
	   obj1.turnLeft();
	   System.out.println("\nTotal Number of people:"+obj2.getNumberOfPeople());
	   MotorisedVehicle m=new MotorisedVehicle();
	   m.checkMotor();
   }
}
