package br.com.mariojp.solid.srp;

import br.com.mariojp.solid.srp.receipt.Receipt;

public class ReceiptService {
	public String generate(Order order) {
		Receipt receipt = new Receipt(order);
		return receipt.printReceipt();
		/*
		double subtotal = order.getItems().stream().mapToDouble(i -> i.getUnitPrice() * i.getQuantity()).sum();
		double tax = subtotal * 0.10; // Taxa 10 fixa :(
		double total = subtotal + tax;
		StringBuilder sb = new StringBuilder(); // Formatando o Recibo
		sb.append("=== RECIBO ===\n");
		for (var i : order.getItems()) {
			sb.append(i.getName()).append(" x").append(i.getQuantity()).append(" = ")
					.append(i.getUnitPrice() * i.getQuantity()).append("\n");
		}
		sb.append("Subtotal: ").append(subtotal).append("\n");
		sb.append("Tax: ").append(tax).append("\n");
		sb.append("Total: ").append(total).append("\n");
		return sb.toString();
		*/
	}
}
