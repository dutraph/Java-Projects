package model.entities;

public class Installments {
	
	private Double dueDate;
	private Double amount;
	
	public Installments() {
	}

	public Installments(Double dueDate, Double amount) {
		this.dueDate = dueDate;
		this.amount = amount;
	}

	public Double getDueDate() {
		return dueDate;
	}

	public void setDueDate(Double dueDate) {
		this.dueDate = dueDate;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	
	

}
