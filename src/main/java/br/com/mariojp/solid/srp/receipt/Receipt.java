package br.com.mariojp.solid.srp.receipt;

import br.com.mariojp.solid.srp.Order;

public class Receipt {
	private ReceiptCalculator rc;
	private Order order;

	public Receipt(Order o) {
		this.order = o;
		this.rc = new ReceiptCalculator(order);
	}

	public String printReceipt() {
		StringBuilder sb = new StringBuilder(); // Formatando o Recibo
		sb.append("=== RECIBO ===\n");
		for (var i : order.getItems()) {
			sb.append(i.getName()).append(" x").append(i.getQuantity()).append(" = ")
					.append(i.getUnitPrice() * i.getQuantity()).append("\n");
		}
		sb.append("Subtotal: ").append(rc.getSubTotal()).append("\n");
		sb.append("Tax: ").append(rc.getTaxa()).append("\n");
		sb.append("Total: ").append(rc.getTotal()).append("\n");
		return sb.toString();
	}

}
