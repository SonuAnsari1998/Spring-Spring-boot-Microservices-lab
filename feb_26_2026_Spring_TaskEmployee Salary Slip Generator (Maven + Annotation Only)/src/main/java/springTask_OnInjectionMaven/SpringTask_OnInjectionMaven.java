/*🧾 Task 1 – Employee Salary Slip Generator (Maven + Annotation Only)
🎯 Objective:

Generate a detailed salary slip using Spring Core annotations only

⚙️ Requirements:

1. Create Maven Project:
Project Name: EmployeeSalarySlipApp
Add Spring Core dependency in pom.xml.

2. Classes to Create:

➤ Employee.java

Annotate with @Component

Fields:
id (int), name (String), basicSalary (double), hra (double), da (double), taxPercentage (double)

Initialize fields through constructor or setter.

➤ SalarySlipService.java

Annotate with @Service

Inject Employee using @Autowired

Method:

public void generateSlip()


Calculate:

grossSalary = basicSalary + hra + da

taxAmount = (grossSalary * taxPercentage) / 100

netSalary = grossSalary - taxAmount

Print formatted salary slip.

➤ AppConfig.java

Annotate with @Configuration and @ComponentScan("com.yourpackage")

➤ MainApp.java

Use AnnotationConfigApplicationContext(AppConfig.class)

Get SalarySlipService bean and call generateSlip().

✅ Expected Output:
Salary Slip for John
Gross Salary: 50000
Tax Deducted: 5000
Net Salary: 45000*/
