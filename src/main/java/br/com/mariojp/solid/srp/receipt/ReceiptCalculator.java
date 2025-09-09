package br.com.mariojp.solid.srp.receipt;

import br.com.mariojp.solid.srp.Order;

public class ReceiptCalculator {

	private Order order;

	public ReceiptCalculator(Order o) {
		this.order = o;
	}

	public double getTaxa() {
		{
			try {
				return getSubTotal() * Double.parseDouble(System.getProperty("tax.rate"));
			} catch (NullPointerException e) {
				return getSubTotal() * 0.1;
			}
		}
	}

	public double getSubTotal() {
		return order.getItems().stream().mapToDouble(i -> i.getUnitPrice() * i.getQuantity()).sum();
	}

	public double getTotal() {
		return (order.getItems().stream().mapToDouble(i -> i.getUnitPrice() * i.getQuantity()).sum()) + getTaxa();
	}

}
