package entities;

public class Individual extends TaxPayer{

	
	private double healthExpenditures;
	
	public Individual() {
		super();
	}

	public Individual(String name, Double annualIncome, double healthExpenditures) {
		super(name, annualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public double getHealthExpendures() {
		return healthExpenditures;
	}

	public void setHealthExpendures(double healthExpendures) {
		this.healthExpenditures = healthExpendures;
	}

	@Override
	public double calculateTax() {
		Double incomeTax;
		
		if (getAnnualIncome() >=20000.00) {
			incomeTax = 0.25;
		} else {
			incomeTax = 0.15;
		}
		Double healthTax;
		if (healthExpenditures > 0.0) {
			healthTax = 0.5;
		} else {
			healthTax = 0.0;
		}
		return getAnnualIncome() * incomeTax - healthExpenditures * healthTax;
	}

}
