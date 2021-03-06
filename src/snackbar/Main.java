package snackbar;

public class Main 
{
	public static void snackbar()
	{
		// Customer(String name, double cashOnHand)
		Customer c1 = new Customer("Jane", 45.25);
		Customer c2 = new Customer("Bon", 33.14);

		// VendingMachine(String name)
		VendingMachine foodvm = new VendingMachine("Food");
		VendingMachine drinkvm = new VendingMachine("Drink");
		VendingMachine officevm = new VendingMachine("Office");

		// Snack(String name, int quantity, double cost, int vendingMachineId)
		// Food
		Snack s1 = new Snack("Chips", 36, 1.75, foodvm.getId());
		Snack s2 = new Snack("Chocolate Bar",36, 1.00, foodvm.getId());
		Snack s3 = new Snack("Pretzel", 30, 2.00, foodvm.getId());
		// Drink
		Snack s4 = new Snack("Soda", 24, 2.50, drinkvm.getId());
		Snack s5 = new Snack("Water", 20, 2.75, drinkvm.getId());

		// Customer 1 buys 3 of snack 4
		c1.buySnacks(s4.getTotalCost(3));
		s4.buySnack(3);
		// print Customer 1 cash on hand
		System.out.println(c1.getName() + " cash on hand $" + c1.getCashOnHand());
		// print quantity of snack 4
		System.out.println("Quantity of " + s4.getName() + " is " + s4.getQuantity());


		System.out.println();
		// Customer 1 buys 1 of snack 3
		c1.buySnacks(s3.getTotalCost(1));
		s3.buySnack(1);
		// print customer 1 cash on hand
		System.out.println(c1.getName() + " cash on hand $" + c1.getCashOnHand());
		// print quantity of snack 3
		System.out.println("Quantity of " + s3.getName() + " is " + s3.getQuantity());


		System.out.println();
		// Customer 2 buys 2 of snack 4
		c2.buySnacks(s4.getTotalCost(2));
		s4.buySnack(2);
		// print Customer 2 cash on hand
		System.out.println(c2.getName() + " cash on hand $" + c2.getCashOnHand());
		// print quantity of snack 4
		System.out.println("Quantity of " + s4.getName() + " is " + s4.getQuantity());


		System.out.println();
		// Customer 1 finds $10
		c1.addCash(10);
		// print Customer 1 cash on hand
		System.out.println(c1.getName() + " cash on hand $" + c1.getCashOnHand());


		System.out.println();
		// Customer 1 buys 1 of snack 2
		c1.buySnacks(s2.getTotalCost(1));
		s2.buySnack(1);
		// print Customer 1 cash on hand
		System.out.println(c1.getName() + " cash on hand $" + c1.getCashOnHand());
		// print quantity of snack 2
		System.out.println("Quantity of " + s2.getName() + " is " + s2.getQuantity());


		System.out.println();
		// Add 12 more items to snack 3
		s3.addQuantity(12);
		// print quantity of snack 3
		System.out.println("Quantity of " + s3.getName() + " is " + s3.getQuantity());


		System.out.println();
		// Customer 2 buys 3 of snack 3
		c2.buySnacks(s3.getTotalCost(3));
		s3.buySnack(3);
		// print Customer 2 cash on hand
		System.out.println(c2.getName() + " cash on hand $" + c2.getCashOnHand());
		// print quantity of snack 3
		System.out.println("Quantity of " + s3.getName() + " is " + s3.getQuantity());
	}

	public static void main(String[] args) 
	{
		snackbar();
	}
}