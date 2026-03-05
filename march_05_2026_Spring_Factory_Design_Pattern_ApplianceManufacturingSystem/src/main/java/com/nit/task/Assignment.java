/*Spring Task-1 — Factory Design Pattern
 
Task Name:Appliance Manufacturing System


Objective:

Implement the Factory Design Pattern using Spring Core, where Spring manages object creation and dependency injection, 
eliminating the need for manual new operations.

Class-wise Design
🔹 Appliance (Interface)

Acts as the Product interface in the Factory Pattern.

Defines a single method:

void manufacture();

🔹 WashingMachine (Implementation Class)

Implements the Appliance interface.

Provides its own manufacturing logic.

Displays:

Manufacturing Washing Machine with smart sensors.

🔹 Refrigerator (Implementation Class)

Implements the Appliance interface.

Provides its own manufacturing logic.

Displays:

Manufacturing Refrigerator with inverter technology.

🔹 ApplianceFactory (Factory Class)

Responsible for returning the correct Appliance object.

Contains a factory method:

getAppliance(String type)


Instead of if-else or manual creation, uses Spring’s @Autowired Map-based injection to dynamically resolve the appropriate bean.

🔹 AppConfig (Configuration Class)

Annotated with @Configuration and @ComponentScan.

Manages all component scanning and bean registration through annotations, avoiding XML configuration.

🔹 Client (Main Class)

Uses AnnotationConfigApplicationContext to load the Spring container.

Reads user input (for example: washingMachine or refrigerator).

Requests the ApplianceFactory bean to fetch the correct Appliance implementation.

Invokes the manufacture() method to execute the selected appliance’s production logic.

⚙️ Workflow Overview

The user inputs the appliance name.

The factory class fetches the corresponding Spring bean.

The manufacture() method executes, displaying the product creation message.*/
