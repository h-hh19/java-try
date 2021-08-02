
public class AccountingApp {

	public static double valueOfSupply = 10000.0;//Double.parseDouble(args[0]);
	public static double varRate = 0.1;
	public static double getTotal() {
		return valueOfSupply + getVAT();
	}
	
	
	public static double getVAT() {
		return valueOfSupply*varRate;
	}
	
	public static void main(String[] args) {

		double ExpenseRate = 0.3;
		//double vat = valueOfSupply*varRate;
		double vat = getVAT();
		//double total = valueOfSupply + vat;
		double total = getTotal();
		
		double expense = valueOfSupply*ExpenseRate;
		double income = valueOfSupply - expense;
		double diviedend1 = (income)*0.5;
		double diviedend2 = (income)*0.3;
		double diviedend3 = (income)*0.2;

	
	
	System.out.println("Value of supply:"+valueOfSupply);
	System.out.println("VAT:" + getTotal());
	System.out.println("Total:" + getTotal());
	System.out.println("Expense:" + expense);
	System.out.println("Income:" + income);
	System.out.println("Diviedend1 :" +diviedend1);
	System.out.println("Diviedend2 :" +diviedend2);
	System.out.println("Diviedend3 :" +diviedend3);

	}

}
