Taller-Java-1: Operators and Decision Structures in Java

Hands-on workshop on Java operators and decision-making structures (if-else, ternary operator and switch), built with IntelliJ IDEA and JDK 21.

Author

Raymond Javier Zabala Sanchez

Technologies
Tool	Version
Java (JDK)	21 (LTS)
IDE	IntelliJ IDEA
Build system	IntelliJ (no Maven/Gradle)
Project Structure
TallerUnidad1_2/
└── src/
    └── com/taller/practico/
        ├── Main.java
        ├── Reto1Edades.java
        ├── Reto2Notas.java
        ├── Reto3Tarifas.java
        ├── OperadorTernario.java
        ├── SwitchTradicional.java
        ├── SwitchModerno.java
        ├── RetoIntegrador.java
        ├── ErrorAsignacion.java
        ├── ErrorComparacionString.java
        ├── ErrorFallThrough.java
        └── ErrorPrecision.java

Every class has its own main method, so each challenge can be run independently.

Contents
Section 1: Operator Warm-up (Main)

Predict first, run later. Covers:

Remainder operator (%)
Prefix (++x) vs. postfix (x++) increment
Integer division vs. floating-point division
Short-circuit evaluation with &&
Expression	Result
86400 % 3600	0
++x + x++ (x = 7)	y = 16, x = 9
15 / 2 and 15.0 / 2	7.0 and 7.5
flag && (++x > 0)	false, x = 7
Section 2: if-else and Ternary Operator
Class	Description
Reto1Edades	Age classification (Infante, Adolescente, Adulto, Adulto Mayor) using an if-else if-else chain
Reto2Notas	Pass/fail evaluation based on final grade, attendance and final project delivery
Reto3Tarifas	Ticket pricing with surcharges and discounts by ticket type
OperadorTernario	Refactor of an if-else block into a single-line ternary expression
Section 3: Multiple Selection with switch
Class	Description
SwitchTradicional	Day-type manager using case, break and default
SwitchModerno	Same logic using arrow syntax (->) as an expression, with no break
Section 4: Integrator Challenge (RetoIntegrador)

Billing system for a technology store:

Base subtotal: quantity * 250.00
Customer discount via switch (VIP 20%, REGULAR 10%, NUEVO 5%)
Coupon validation with if-else and logical operators (extra 50.00 off when the subtotal is at least 500.00)
16% VAT on the taxable base
Test case	Input	Expected total
A	3 units, VIP, PROMO1 año	$638.00
B	1 unit, NUEVO, PROMO1 año	$275.50
Section 5: Debugging

Four classic bugs, fixed and documented in the code with ERROR ORIGINAL comments:

Class	Bug	Fix
ErrorAsignacion	= used instead of == inside the if	Use ==
ErrorComparacionString	== compares references, not content	Use equals()
ErrorFallThrough	Missing break caused fall-through	Add break to each case
ErrorPrecision	Integer division truncated 3 / 4 to 0	Cast to double before dividing
How to Run
Clone the repository:
bash
   git clone https://github.com/raymondzabala7/Taller-Java-1.git
Open the project in IntelliJ IDEA and make sure the project SDK is JDK 21.
Place the classes under the package com.taller.practico.
Run any class with the green arrow next to its main method, or press Shift + F10.

Or from the command line (from the src folder):

bash
javac com/taller/practico/*.java
java com.taller.practico.RetoIntegrador
Notes
The modern switch with -> requires Java 14 or higher, so it works with JDK 21.
Strings are always compared with equals(), never with ==.
