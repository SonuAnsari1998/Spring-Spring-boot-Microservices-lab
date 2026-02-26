package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@Service
public class InvoiceService {
	@Autowired
	private Product product;
	@Autowired
	private TaxCalculator taxCalculator;

	public void printInvoice() {
			double total = product.getPrice() * product.getQty();
			double tax = taxCalculator.calculateTax(total);
			double finalAmount = total + tax;
			
			System.out.println("Invoice:\r\n"
					+ "Product: "+product.getName()+"\r\n"
					+ "Quantity: "+product.getQty()+"\r\n"
					+ "Total (before tax): "+total+"\r\n"
					+ "Tax: "+tax+"\r\n"
					+ "Final Amount: "+finalAmount+"");
		}
}
