/*🧮 Task 3 – Order Invoice Generator (Maven + Annotation Only)
🎯 Objective:

feb_26_2026_Spring_Task Order Invoice Generator (Maven + Annotation Only)

Generate an order invoice using annotation-based dependency injection.

⚙️ Requirements:

1. Classes to Create:

➤ Product.java

Annotate with @Component

Fields: name (String), price (double), quantity (int)

Initialize example values (e.g., Laptop, 50000, 2).

➤ TaxCalculator.java

Annotate with @Component

Method:

public double calculateTax(double amount)


returns 18% of amount.

➤ InvoiceService.java

Annotate with @Service

Inject both Product and TaxCalculator using @Autowired

Method:

public void printInvoice()


Calculate:

total = price * quantity

tax = taxCalculator.calculateTax(total)

finalAmount = total + tax

Print formatted invoice.


Use context to fetch InvoiceService and call method.

✅ Expected Output:
Invoice:
Product: Laptop
Quantity: 2
Total (before tax): 100000
Tax: 18000
Final Amount: 118000

*/