package entities;

public class Company extends TaxPayer{

	private Integer numberOfEmployees;
	
	public Company() {
		super();
	}
	
	public Company(String name, Double annualIncome, Integer numberOfEmployees) {
		super(name, annualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}
	
	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double calculateTax() {
		Double incomeTax;
		if (numberOfEmployees > 10) {
			incomeTax = 0.14;
		} else {
			incomeTax = 0.16;
		}
		return getAnnualIncome() * incomeTax;
	}
	
	

}
