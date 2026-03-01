package com.nit.Assignment;

/*=========================================
Practice Task 1 - Student Report Card Generator
=========================================

Objective:
Generate a student report card using Spring Core annotations only.

Requirements:

Classes to Create:

=> Student.java - Annotate with @Component
   Fields: id (int), name (String), mathMarks (double), scienceMarks (double), englishMarks (double)
   Initialize values using constructor or setter.

=> ReportCardService.java - Annotate with @Service
   Inject Student using @Autowired
   Method: public void generateReport()
   Calculate:
     - totalMarks = mathMarks + scienceMarks + englishMarks
     - percentage = (totalMarks / 300) * 100
     - grade -> A (>=80%), B (>=60%), C (>=40%), F (below 40%)

=> AppConfig.java - @Configuration + @ComponentScan("com.report")

=> MainApp.java - Load context, get bean, call generateReport()

Expected Output:
-----------------------------------------
Report Card for Alice
Total Marks: 240 / 300
Percentage: 80.0%
Grade: A
-----------------------------------------

Test Cases:
------------------------------------------------------------------
| Name  | Math | Science | English | Total | Percentage | Grade |
------------------------------------------------------------------
| Alice | 80   | 85      | 75      | 240   | 80%        | A     |
| Bob   | 60   | 55      | 65      | 180   | 60%        | B     |
| Carol | 35   | 40      | 45      | 120   | 40%        | C     |
| Dan   | 20   | 25      | 30      | 75    | 25%        | F     |
------------------------------------------------------------------*/
