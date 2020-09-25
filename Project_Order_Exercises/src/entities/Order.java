package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import entities.enums.OrderStatus;

public class Order {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date moment = new Date();
	private OrderStatus status;
	private ArrayList<OrderItem> orderItens = new ArrayList<OrderItem>();
	private Client client;
	
	public Order() {
	}

	public Order(Client client, OrderStatus status) {
		this.client = client;
		this.status = status;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public ArrayList<OrderItem> getOrderItens() {
		return orderItens;
	}
	
	public void addItem(OrderItem item) {
		orderItens.add(item);
	}
	
	public void removeItem(OrderItem item) {
		orderItens.remove(item);
	}
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n");
		sb.append("ORDER SUMMARY: " + "\n");
		sb.append("Order moment: " + sdf.format(getMoment()) + "\n");
		sb.append("Order status: " + getStatus() + "\n");
		sb.append("Client: " + getClient() + "\n");
		sb.append("Order items: " +"\n");
		double subT =0.0;
		for (OrderItem p : orderItens) {
			sb.append(p + "\n");
			subT += p.subTotal();
		}
		sb.append("Total price: $" + subT);
		return sb.toString();
	}
	

	
}
