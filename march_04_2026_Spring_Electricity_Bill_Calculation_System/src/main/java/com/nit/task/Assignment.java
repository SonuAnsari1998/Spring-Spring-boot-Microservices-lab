/*Task 2 — Electricity Bill Calculation System
Objective:

Demonstrate how Strategy Pattern helps to calculate electricity bills for different consumer types — Residential, Commercial, and Industrial.

Class-wise Design:
1. BillingStrategy (Interface)

Method:

double calculateBill(double units);

2. ResidentialBilling (Concrete Strategy)

Implements: BillingStrategy

Rate: ₹5 per unit.

3. CommercialBilling (Concrete Strategy)

Implements: BillingStrategy

Rate: ₹8 per unit.

4. IndustrialBilling (Concrete Strategy)

Implements: BillingStrategy

Rate: ₹10 per unit.

5. ElectricityBillingSystem (Context Class)

Holds reference to BillingStrategy.

Method:

void showBill(double units);

6. AppConfig (Configuration Class)

Declares beans for all billing strategies.

7. MainApp (Client Class)

Takes user input (customer type + units consumed).

Injects correct strategy and displays final bill.

🧾 Expected Console Output:
Enter customer type (residential/commercial/industrial): industrial
Enter total units consumed: 250

Customer Type: Industrial
Units Consumed: 250
Rate per Unit: ₹10
Total Bill Amount: ₹2500.0
*/
