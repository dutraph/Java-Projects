package model.entities;

import java.util.Date;

public class Contract {

	private Integer number;
	private Date date;
	private Double totalValue;
	
	private Installments installments;

	public Contract() {
	}

	public Contract(Integer number, Date date, Double totalValue, Installments installments) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
		this.installments = installments;
	}
	
	
	
}
