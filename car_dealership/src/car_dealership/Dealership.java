package car_dealership;

public class Dealership {

	public static void main(String[] args) {
// note cust1 is a variable of the Customer type(Object)
		Customer cust1 = new Customer();
		cust1.setName("Tom");
		cust1.setAddress("123 Anything St. ");
		cust1.setCashOnHand(25000);
		
		Vehicle vehicle = new Vehicle("Honda", "Accord", 15000);
//		AFTER Setting The Constructors For "Vehicle" In Vehicle Class
//		I Do NOT Need These Below As Data CAN NOW Be Entered Directly
//		NOTE: Same could be done for the "Customer" Class
//		vehicle.setMake("Honda");
//		vehicle.setModel("Accord");
//		vehicle.setPrice(15000);
		
		Employee emp = new Employee();
		
// if approved change to "true" which will allow financing 
		cust1.purchaseCar(vehicle, emp, false);
		
		Vehicle car = new Vehicle("Honda", "Accord", 15000);
		
		boolean value = car.equals(vehicle);
		System.out.println(value);
// NOTE: Will display "false" unless you override the "Equal"Method
// that is Inherited By The Object Like The Sting Method Of "Vehicle
// Class In The OBJECT "Vehicle"
// SOLUTION = Override The Method Of The Parent Class
// Of "Vehicle" IN THE Vehicle Class 
// -->SOURCE-->Generate hash()Code and equals()--> select the
// variables = Fancy Code That Checks If All Is True & Overrides
// IF False It Returns FALSE
	 /**		handleCustomer(Customer cust, boolean finance, Vehicle vehicle)
* if(finance == true)
*    runCreditHistory(Customer cust, double doubleAmount)
* else if (vehicle.getPrice() <= cust.getCashOnHand():
*		processTransaction(Customer cust, Vehicle vehicle)
* else:
*		have customer get more $
*/
		
		
	}

}
