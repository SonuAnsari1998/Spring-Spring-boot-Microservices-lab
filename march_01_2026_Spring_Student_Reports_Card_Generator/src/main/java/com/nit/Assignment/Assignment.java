package com.nit.Assignment;

/*=========================================
Practice Task 2 - Electricity Bill Calculator
=========================================

Objective:
Calculate electricity bill using Spring DI annotations only.

Requirements:

Classes to Create:

=> Consumer.java - Annotate with @Component
   Fields: consumerId (int), name (String), unitsConsumed (double)
   Initialize with sample values.

=> BillCalculator.java - Annotate with @Component
   Method: public double calculateBill(double units)
   Rate Logic:
     - First 100 units  -> Rs. 2 per unit
     - Next 100 units   -> Rs. 4 per unit
     - Above 200 units  -> Rs. 6 per unit

=> BillService.java - Annotate with @Service
   Inject Consumer and BillCalculator using @Autowired
   Method: public void printBill()
   Calculate total bill and print formatted output.

=> AppConfig.java - @Configuration + @ComponentScan("com.electricity")

=> MainApp.java - Load context, get bean, call printBill()

Expected Output:
-----------------------------------------
Electricity Bill
Consumer: Ramesh
Units Consumed: 250
Total Bill: Rs. 1100
-----------------------------------------

Test Cases:
---------------------------------------------------------------
| Name   | Units | Calculation              | Total Bill     |
---------------------------------------------------------------
| Ramesh | 250   | 100x2 + 100x4 + 50x6    | Rs. 1100       |
| Suresh | 100   | 100x2                    | Rs. 200        |
| Mahesh | 150   | 100x2 + 50x4             | Rs. 400        |
| Ganesh | 50    | 50x2                     | Rs. 100        |
---------------------------------------------------------------*/
