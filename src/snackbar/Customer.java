package snackbar;

public class Customer
{
	// Fields
	private static int maxId = 0;
	private int id;
	private String name;
	private double cashOnHand;

	// Constructor
	public Customer(String name, double cashOnHand)
	{
		maxId++;
		id = maxId;
		this.name = name;
		this.cashOnHand = cashOnHand;
	}

	// Getters
	public int getId()
	{
		return id
	}

	public String getName()
	{
		return name;
	}

	public double getCashOnHand()
	{
		return cashOnHand;
	}

	// Setters
	public void setName(String name)
	{
		this.name = name;
	}

	// Methods
	// add cash to cash on hand
	public void addCash(double cash)
	{
		this.cash += cash;
	}

	// Buy Snacks. Given the total cost of the snacks to be purchased 
	// Reduce the cash on hand by that amount.
	public void buySnacks(double cash)
	{
		this.cash -= cash;
	}
}