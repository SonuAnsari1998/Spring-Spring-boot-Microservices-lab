/*Q1) LaptopEMICalculator (Constructor Injection)

Scenario

A laptop showroom provides EMI facility to customers.
The showroom wants to calculate the monthly EMI based on:

Laptop Price

Down Payment

Total EMI Months

Class: LaptopEMICalculator

Fields

double laptopPrice → Total price of the laptop

double downPayment → Amount paid initially

int emiMonths → Number of months for EMI

Constructor

Accepts:

laptopPrice

downPayment

emiMonths

Method

double calculateMonthlyEMI()

Logic
remainingAmount = laptopPrice - downPayment
monthlyEMI = remainingAmount / emiMonths

AppConfig (Java Config)

In AppConfig, create LaptopEMICalculator bean using constructor values.

Input
------
laptopPrice = 60000
downPayment = 10000
emiMonths = 10

Output
-------
Monthly EMI: ₹5000.0

Q2) RestaurantBillGenerator (Setter Injection)
feb_25_2023_Spring_SpringTaskUsing_AppConfig_RestaurantBillGenerator
Scenario

A restaurant generates the final customer bill depending on:

Food Amount

Drinks Amount

Service Charge

GST Percentage

This is best suited for Setter Injection because the restaurant might update values later (like GST, service charge, etc.)

Class: RestaurantBillGenerator
Fields

double foodAmount → cost of food items

double drinksAmount → cost of beverages

double serviceCharge → fixed service charge

double gstPercentage → GST % applied

Setter Methods

setFoodAmount()

setDrinksAmount()

setServiceCharge()

setGstPercentage()

Method

double generateFinalBill()

Logic
baseAmount = foodAmount + drinksAmount + serviceCharge
gst = baseAmount * gstPercentage / 100
finalBill = baseAmount + gst

AppConfig (Java Config)

In AppConfig, create RestaurantBillGenerator bean
Set values using setter methods inside AppConfig

Input
-----
foodAmount = 800
drinksAmount = 200
serviceCharge = 50
gstPercentage = 18

Output
-------
Final Restaurant Bill: ₹1239.0

Q3) TravelPackageCostCalculator (Field Injection)
feb_25_2023_Spring_SpringTaskUsing_AppConfig_TravelPackageCostCalculator
Scenario

A travel agency calculates travel package cost based on package details such as:

Package Cost

Number of Travelers

Discount Percentage

Here, one class stores Package Details and another class calculates final bill.
This is best suited for Field Injection (@Autowired) because the calculator 
depends on package details automatically.

Class: PackageDetails

Fields

double packageCostPerPerson → cost for 1 person

int numberOfTravelers → how many people are traveling

double discountPercentage → discount given on total

This class only stores values and provides them to the calculator.

Class: TravelPackageCostCalculator

Field

@Autowired PackageDetails packageDetails

Means TravelPackageCostCalculator automatically gets PackageDetails object.

Method

double calculateFinalPackageCost()

Logic
total = packageCostPerPerson * numberOfTravelers
discount = total * discountPercentage / 100
finalCost = total - discount

AppConfig (Java Config)

Enable Component Scan in AppConfig
Spring automatically creates both PackageDetails and TravelPackageCostCalculator objects

Input

packageCostPerPerson = 5000
numberOfTravelers = 4
discountPercentage = 10

Output

Final Package Cost: ₹18000.0*/
