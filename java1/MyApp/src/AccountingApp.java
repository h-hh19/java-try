
public class AccountingApp {

	public static void main(String[] args) {
	double valueOfSupply = 70000.0;
	double ExpenseRate = 0.3;
	double varRate = 0.1;
	double vat = valueOfSupply*varRate;
	double total = valueOfSupply + vat;
	double expense = valueOfSupply*ExpenseRate;
	double income = valueOfSupply - expense;
	double diviedend1 = (income)*0.5;
	double diviedend2 = (income)*0.3;
	double diviedend3 = (income)*0.2;

	
	
	System.out.println("Value of supply:"+valueOfSupply);
	System.out.println("VAT:" + vat);
	System.out.println("Total:" + total);
	System.out.println("Expense:" + expense);
	System.out.println("Income:" + income);
	System.out.println("Diviedend1 :" +diviedend1);
	System.out.println("Diviedend2 :" +diviedend2);
	System.out.println("Diviedend3 :" +diviedend3);

	}

}
