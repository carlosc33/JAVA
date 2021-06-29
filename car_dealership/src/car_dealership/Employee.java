package car_dealership;
// here I just want to make Employee Class has the method "handleCustomer"
public class Employee {
	public void handleCustomer(Customer cust, boolean finance, Vehicle vehicle) {
	if(finance == true) {
		double loanAmount = vehicle.getPrice() - cust.getCashOnHand();
// if finace == true we can run credit as below
		runCreditHistory(cust, loanAmount);
	} else if (vehicle.getPrice() <= cust.getCashOnHand()){
// customer pays in cash
		processTransaction(cust, vehicle);
	}else {
		System.out.println(" Customer will need more money to purchase vehicle: " + vehicle);
	}
	
}
	
	
// passing data above to run credit history
	public void runCreditHistory(Customer cust, double loanAmount) {
		System.out.println("Ran credit history for Customer....");
		System.out.println("Customer has been approved to purchase the vehicle");			
	}
	public void processTransaction(Customer cust, Vehicle vehicle) {
		System.out.println("Customer has purchased the vehicle: "
				+ vehicle + "for the price "+ vehicle.getPrice());
		
	}
}
	
