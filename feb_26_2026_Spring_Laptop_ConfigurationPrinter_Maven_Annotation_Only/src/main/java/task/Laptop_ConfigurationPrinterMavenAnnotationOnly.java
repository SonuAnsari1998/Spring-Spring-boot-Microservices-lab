/*💻 Task 2 – Laptop Configuration Printer (Maven + Annotation Only)
🎯 Objective:

Print laptop configuration using Spring DI annotations only.

⚙️ Requirements:

1. Classes to Create:

➤ Laptop.java

Annotate with @Component

Fields:
brand (String), processor (String), ram (String)

Initialize values in constructor or setter.

➤ LaptopService.java

Annotate with @Service

Inject Laptop using @Autowired

Method:

public void printLaptopDetails()


should print:

Laptop Brand: Dell
Processor: Intel i7
RAM: 16GB

Same as Task 1, load context and call service method.

✅ Expected Output:
Laptop Brand: Dell
Processor: Intel i7
RAM: 16GB
*/