# My Submission Document for LabAssignment1

## Exercise 1
Setting up the project was done manually via STS GUI.

## Exercise 2

The first prompt is listed below as copied from the assignment document. 

```
You are an experienced Java developer. 
 
Develop a simple Java billing application for a retail store named SmartStore. 
The class must be named BillingApplication in package week2.day2.assignment1. 
 
Requirements: 
1. Accept customer name, product name, product price and quantity. 
2. Calculate the total purchase amount (price x quantity). 
3. Apply a 5% discount if the purchase amount is between Rs. 1,000 and Rs. 4,999. 
4. Apply a 10% discount if the purchase amount is Rs. 5,000 or above. 
5. No discount below Rs. 1,000. 
6. Display customer details, total amount, discount percentage, discount amount 
   and final amount, with amounts shown to 2 decimal places. 
 
Constraints: 
- Use Java fundamentals only: variables, data types, if-else and arithmetic operators. 
- Use Scanner for user input. 
- Do not use advanced Java features. 
- Write readable, beginner-friendly code. 
- Include comments explaining important logic. 
 
Generate a complete executable Java program with a main() method. 
```

This filled in the main function as below:

```
package week2.day2.assignment1;

import java.util.Scanner;

public class BillingApplication {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter customer name: ");
		String customerName = input.nextLine();

		System.out.print("Enter product name: ");
		String productName = input.nextLine();

		System.out.print("Enter product price: ");
		double productPrice = input.nextDouble();

		System.out.print("Enter quantity: ");
		int quantity = input.nextInt();

		// Calculate the amount before any discount.
		double totalAmount = productPrice * quantity;
		double discountPercentage = 0.0;

		// Apply the discount based on the purchase amount.
		if (totalAmount >= 1000 && totalAmount < 5000) {
			discountPercentage = 5.0;
		} else if (totalAmount >= 5000) {
			discountPercentage = 10.0;
		}

		double discountAmount = totalAmount * discountPercentage / 100;
		double finalAmount = totalAmount - discountAmount;

		System.out.println("\n--- SmartStore Bill ---");
		System.out.printf("Customer Name: %s%n", customerName);
		System.out.printf("Product Name: %s%n", productName);
		System.out.printf("Total Amount: Rs. %.2f%n", totalAmount);
		System.out.printf("Discount Percentage: %.0f%%%n", discountPercentage);
		System.out.printf("Discount Amount: Rs. %.2f%n", discountAmount);
		System.out.printf("Final Amount: Rs. %.2f%n", finalAmount);

		input.close();
	}
}
```


| Requirement | Met? (Yes / No) | Where in the code? |
| --- | --- | --- |
| Reads customer name, product, price, quantity | Yes | Lines 11, 14, 17, 20 (`Scanner` reads via `nextLine()`, `nextLine()`, `nextDouble()`, `nextInt()`) |
| Total = price × quantity | Yes | Line 23: `totalAmount = productPrice * quantity` |
| 0% below ₹1,000 | Yes | Line 24: `discountPercentage` defaults to `0.0`; neither `if` branch matches below 1,000 |
| 5% from ₹1,000 to ₹4,999 | Yes | Lines 27-28: `totalAmount >= 1000 && totalAmount < 5000` sets 5.0 |
| 10% at ₹5,000 and above | Yes | Lines 29-30: `else if (totalAmount >= 5000)` sets 10.0 |
| Shows discount %, discount amount and final amount | Yes | Lines 40-42 (`printf` with `%.2f` for amounts; discount % uses `%.0f`) |
| Comments explain the discount logic | Yes | Line 22 (total calculation) and line 26 (discount tiers) |

## Exercise 3

The prompt from the assignment is as follows:

```
Act as a Java programming instructor. 
 
Explain the selected Java code line by line. 
 
For each important statement: 
1. Explain what it does. 
2. Explain why it is required. 
3. Identify the Java concept being used. 
4. Give a simple example where applicable. 
 
Pay special attention to: 
- Scanner and user input 
- Variables and data types 
- Arithmetic calculations 
- If-else conditions 
- Discount calculation 
- Output statements 
 
Explain everything in beginner-friendly language. 
```

I got the following explanation from the model:


> ### Line-by-Line Explanation
>
> #### Package and Imports
>
> ```java
> package week2.day2.assignment1;
> ```
>
> - **What it does:** Places the class in the `week2.day2.assignment1` package.
> - **Why required:** Packages organize classes and prevent naming conflicts.
> - **Java concept:** Packages.
>
> ```java
> import java.util.Scanner;
> ```
>
> - **What it does:** Imports the `Scanner` class.
> - **Why required:** It allows the program to read keyboard input.
> - **Java concept:** Import statements.
>
> #### Class and Main Method
>
> ```java
> public class BillingApplication {
> ```
>
> - **What it does:** Declares a public class named `BillingApplication`.
> - **Java concept:** Class declaration.
>
> ```java
> public static void main(String[] args) {
> ```
>
> - **What it does:** Starts the Java program.
> - **Why required:** Java begins executing a program from the `main` method.
> - **Java concept:** Main method.
>
> #### Creating the Scanner
>
> ```java
> Scanner input = new Scanner(System.in);
> ```
>
> - **What it does:** Creates a `Scanner` object that reads from the keyboard.
> - **Why required:** The program needs to receive customer and purchase information.
> - **Java concept:** Objects and the `Scanner` class.
>
> #### Reading Customer and Product Names
>
> ```java
> System.out.print("Enter customer name: ");
> String customerName = input.nextLine();
> ```
>
> - `System.out.print()` displays the prompt without moving to a new line.
> - `nextLine()` reads the complete customer name entered by the keyboard.
> - The value is stored in a `String` variable.
> - **Java concepts:** Console output, `String`, and user input.
> - **Example:** `String name = "Alex";`
>
> ```java
> System.out.print("Enter product name: ");
> String productName = input.nextLine();
> ```
>
> - **What it does:** Displays a prompt and stores the entered product name.
> - **Why required:** The bill needs to identify the purchased product.
> - **Java concept:** String variables and `Scanner.nextLine()`.
> - `nextLine()` is useful because product names may contain spaces.
>
> #### Reading the Product Price
>
> ```java
> System.out.print("Enter product price: ");
> double productPrice = input.nextDouble();
> ```
>
> - `nextDouble()` reads a decimal number.
> - The value is stored in a `double` variable.
> - **Why required:** Product prices commonly contain decimal values, such as `499.50`.
> - **Java concepts:** `double` and decimal user input.
> - **Example:** `double price = 499.50;`
>
> #### Reading the Quantity
>
> ```java
> System.out.print("Enter quantity: ");
> int quantity = input.nextInt();
> ```
>
> - `nextInt()` reads a whole number.
> - The value is stored in an `int` variable.
> - **Why required:** The quantity is normally represented by a whole number.
> - **Java concepts:** `int` and integer user input.
> - **Example:** `int quantity = 3;`
>
> #### Calculating the Total Amount
>
> ```java
> double totalAmount = productPrice * quantity;
> ```
>
> - **What it does:** Multiplies the product price by the quantity.
> - **Why required:** The program needs the full purchase amount before discount.
> - **Java concept:** Arithmetic operators and variables.
> - **Example:** `250.00 * 4 = 1000.00`
>
> #### Initializing the Discount Percentage
>
> ```java
> double discountPercentage = 0.0;
> ```
>
> - **What it does:** Creates a `double` variable and sets the discount to zero initially.
> - **Why required:** Purchases below Rs. 1,000 must have no discount.
> - **Java concept:** Variable initialization.
>
> #### Applying Discount Conditions
>
> ```java
> if (totalAmount >= 1000 && totalAmount < 5000) {
> 	discountPercentage = 5.0;
> } else if (totalAmount >= 5000) {
> 	discountPercentage = 10.0;
> }
> ```
>
> - **What it does:** Selects the discount percentage according to the total purchase amount.
> - **Why required:** The purchase amount determines whether the discount is 0%, 5%, or 10%.
> - **Java concepts:** `if`, `else if`, comparison operators, and logical AND (`&&`).
>
> For the first condition:
>
> - `>=` means greater than or equal to.
> - `<` means less than.
> - `&&` means both conditions must be true.
> - When the total is at least Rs. 1,000 but less than Rs. 5,000, the discount becomes 5%.
>
> For the second condition:
>
> - If the total is Rs. 5,000 or more, the discount becomes 10%.
> - The `else if` runs only when the first `if` condition is false.
>
> | Total Amount | Discount |
> |---|---:|
> | Below Rs. 1,000 | 0% |
> | Rs. 1,000 to Rs. 4,999 | 5% |
> | Rs. 5,000 or more | 10% |
>
> **Simple example:**
>
> ```java
> int score = 75;
>
> if (score >= 90) {
> 	System.out.println("A");
> } else if (score >= 75) {
> 	System.out.println("B");
> }
> ```
>
> #### Calculating the Discount Amount
>
> ```java
> double discountAmount = totalAmount * discountPercentage / 100;
> ```
>
> - **What it does:** Converts the discount percentage into an actual monetary amount.
> - **Why required:** It determines how much money is deducted from the purchase.
> - **Java concept:** Arithmetic multiplication and division.
> - **Example:** 5% of Rs. 2,000 is calculated as `2000 * 5 / 100`, producing `100.00`.
>
> #### Calculating the Final Amount
>
> ```java
> double finalAmount = totalAmount - discountAmount;
> ```
>
> - **What it does:** Subtracts the discount from the original total.
> - **Why required:** It gives the amount the customer must pay.
> - **Java concept:** Arithmetic subtraction.
> - **Example:** `2000.00 - 100.00 = 1900.00`
>
> #### Printing the Bill
>
> ```java
> System.out.println("\n--- SmartStore Bill ---");
> ```
>
> - **What it does:** Prints the bill heading.
> - `println()` prints text and then moves to the next line.
> - `\n` creates a blank line before the heading.
> - **Java concept:** Console output and escape sequences.
>
> ```java
> System.out.printf("Customer Name: %s%n", customerName);
> ```
>
> - **What it does:** Prints the formatted customer name.
> - `%s` represents a string value.
> - `%n` inserts a newline.
> - **Java concept:** Formatted output using `printf()`.
>
> ```java
> System.out.printf("Product Name: %s%n", productName);
> ```
>
> - **What it does:** Prints the formatted product name.
> - **Java concept:** String formatting with `printf()`.
>
> ```java
> System.out.printf("Total Amount: Rs. %.2f%n", totalAmount);
> ```
>
> - **What it does:** Prints the total amount with exactly two decimal places.
> - `%.2f` means a floating-point number formatted with two decimal places.
> - **Example:** `1234.567` appears as `1234.57`.
>
> ```java
> System.out.printf("Discount Percentage: %.0f%%%n", discountPercentage);
> ```
>
> - **What it does:** Prints the discount percentage without decimal places.
> - `%.0f` removes decimal places.
> - `%%` prints one literal percent symbol.
> - **Example:** `10.0` appears as `10%`.
>
> ```java
> System.out.printf("Discount Amount: Rs. %.2f%n", discountAmount);
> ```
>
> - **What it does:** Prints the discount amount with two decimal places.
> - **Java concept:** Formatted decimal output.
>
> ```java
> System.out.printf("Final Amount: Rs. %.2f%n", finalAmount);
> ```
>
> - **What it does:** Prints the amount due after the discount with two decimal places.
> - **Java concept:** Formatted decimal output.
>
> #### Closing the Scanner
>
> ```java
> input.close();
> ```
>
> - **What it does:** Closes the `Scanner` and releases its resources.
> - **Why required:** It is good practice after keyboard input is no longer needed.
> - **Java concept:** Closing a resource.
>
> ### Overall Program Flow
>
> 1. Create a `Scanner` to read keyboard input.
> 2. Read the customer name and product name as strings.
> 3. Read the product price as a `double`.
> 4. Read the quantity as an `int`.
> 5. Calculate the total purchase amount.
> 6. Apply 0%, 5%, or 10% discount based on the total.
> 7. Calculate the discount amount.
> 8. Subtract the discount to find the final amount.
> 9. Print the formatted bill.
> 10. Close the `Scanner`.



| Question | Your answer |
| --- | --- |
| Which variables does the program use, and what data type is each? | `input` (`Scanner`), `customerName` (`String`), `productName` (`String`), `productPrice` (`double`), `quantity` (`int`), `totalAmount` (`double`), `discountPercentage` (`double`), `discountAmount` (`double`), `finalAmount` (`double`). Price is a `double` because it can have decimals; quantity is an `int` because you can't buy part of an item. |
| Which if-else conditions decide the discount? Write them out. | `if (totalAmount >= 1000 && totalAmount < 5000)` sets 5%. `else if (totalAmount >= 5000)` sets 10%. If neither is true the discount stays at its starting value of 0%. |
| How is the discount amount calculated? | `discountAmount = totalAmount * discountPercentage / 100;` For example, 5% of 1000.00 is 1000 * 5 / 100 = 50.00. |
| How is the final amount calculated? | `finalAmount = totalAmount - discountAmount;` For example, 1000.00 - 50.00 = 950.00. |
| Which line would you change if the 10% threshold moved to Rs. 6,000? | Two lines in the if-else: line 27 (`totalAmount < 5000` becomes `< 6000`, so the 5% tier ends at Rs. 5,999) and line 29 (`totalAmount >= 5000` becomes `>= 6000`). Changing only line 29 would leave a gap where totals from 5,000 to 5,999 get 0%. |
| Verify one explanation yourself: pick one statement Copilot explained and check it. For example, set a breakpoint on the discount if line (double-click the left margin), run Debug As > Java Application, and press F6 to step through. Does the program take the branch Copilot described? | I checked the discount if-else with four inputs: 999.99 x 1 gave 0%, 1000 x 1 gave 5% (final 950.00), 2500 x 2 = 5000 gave 10% (final 4500.00), and 3000 x 2 = 6000 gave 10% (final 5400.00). So the 1,000 and 5,000 boundaries land in the branches described. |


## Exercise 4
 
Next I used the following prompt from the assignment:

```
Review the existing SmartStore billing application. 
 
Refactor the code using these requirements: 
1. Move discount calculation into a separate method: 
   public static double calculateDiscount(double totalAmount) 
   It must return the discount amount in rupees (not the percentage). 
2. Move bill printing into a separate method named printBill(). 
3. Use meaningful variable and method names. 
4. Remove unnecessary code. 
5. Improve readability and maintainability. 
6. Do not change the existing business rules or the output format. 
7. Do not introduce advanced Java concepts. 
 
Explain the changes you made and why they improve the code. 
```

I was able to put that code into a new class and run it separately before putting it into my primary class. The output was as expected.

>Enter customer name: Enter product name: Enter product price: Enter quantity: 
>
>--- SmartStore Bill ---
>
>Customer Name: Alex
>
>Product Name: Laptop
>
>Total Amount: Rs. 5000.00
>
>Discount Percentage: 10%
>
>Discount Amount: Rs. 500.00
>
>Final Amount: Rs. 4500.00



| Question | Your answer |
| --- | --- |
| Which new methods were created, and what does each do? | Three methods. `calculateDiscount()` returns the discount amount in rupees. `calculateDiscountPercentage()` holds the if-else tiers and returns 0.0, 5.0 or 10.0, and `calculateDiscount()` calls it. `printBill()` prints the whole bill. |
| What parameters and return type does calculateDiscount() have? | One parameter, `double totalAmount`, and it returns a `double`: the discount amount in rupees (not the percentage). |
| Did any discount threshold or comparison (<, >=) change? | No. The tiers are still `totalAmount >= 1000 && totalAmount < 5000` for 5% and `totalAmount >= 5000` for 10%. They moved into `calculateDiscountPercentage()` and now use `return` instead of assigning a variable. |
| Is the before output identical to the after output? | Yes. For the sample input (Rahul, Laptop Bag, 1200, 5) the bill shows Rs. 6000.00 total, 10%, Rs. 600.00 discount and Rs. 5400.00 final in both versions. I also compared the original and refactored programs on several other inputs (999.99, 1000, 4999.99, 2500 x 2, and 0) and the output matched character for character. |
| Which change improves readability the most, and why? | Moving the printing into `printBill()` and the discount rules into their own methods. `main()` now reads as a short list of steps (read input, calculate, print), and each method has one job, so a change to the discount rules only touches one place. |

## Exercise 5

I pasted the following prompt into the chat after highlighting the code:

```
Act as a Java software tester. 
 
Analyze the SmartStore billing application and generate test cases. 
 
Include: 
1. Purchase amount below Rs. 1,000. 
2. Purchase amount exactly Rs. 1,000. 
3. Purchase amount Rs. 4,999. 
4. Purchase amount exactly Rs. 5,000. 
5. Purchase amount above Rs. 5,000. 
6. Quantity greater than one. 
 
For each test case provide: 
- Test input (price and quantity) 
- Expected discount percentage 
- Expected discount amount 
- Expected final amount 
 
Identify any additional edge cases that should be tested. 
```
It responded as follows:

> ## SmartStore Billing Test Cases
>
> | Test Case | Test Input (Price × Quantity) | Expected Discount | Discount Amount | Final Amount |
> |---|---|---:|---:|---:|
> | 1. Below Rs. 1,000 | Rs. 999 × 1 | 0% | Rs. 0.00 | Rs. 999.00 |
> | 2. Exactly Rs. 1,000 | Rs. 1,000 × 1 | 5% | Rs. 50.00 | Rs. 950.00 |
> | 3. Purchase amount Rs. 4,999 | Rs. 4,999 × 1 | 5% | Rs. 249.95 | Rs. 4,749.05 |
> | 4. Exactly Rs. 5,000 | Rs. 5,000 × 1 | 10% | Rs. 500.00 | Rs. 4,500.00 |
> | 5. Above Rs. 5,000 | Rs. 5,500 × 1 | 10% | Rs. 550.00 | Rs. 4,950.00 |
> | 6. Quantity greater than one | Rs. 600 × 2 | 5% | Rs. 60.00 | Rs. 1,140.00 |
>
> ## Additional Edge Cases
>
> - **Just below a boundary:** Rs. 999.99 × 1 and Rs. 4,999.99 × 1.
> - **Just above a boundary:** Rs. 1,000.01 × 1 and Rs. 5,000.01 × 1.
> - **Zero price or quantity:** Rs. 0 × 1 or Rs. 500 × 0 should result in Rs. 0.00; the current application has no validation.
> - **Negative price or quantity:** These should be rejected rather than producing a negative bill.
> - **Decimal price with quantity:** For example, Rs. 249.99 × 4 = Rs. 999.96.
> - **Decimal product price:** Ensure floating-point formatting and discount calculations produce two decimal places.
> - **Very large amounts:** Verify that calculations do not overflow or display incorrect values.
> - **Non-numeric input:** Entering text where a number is expected should produce a validation or graceful error message, rather than a crash.
> - **Large quantity:** Verify that very large quantities do not cause integer overflow.
> - **Repeated quantity boundaries:** Test values such as Rs. 500 × 2, Rs. 1,250 × 4, and Rs. 2,500 × 2 to confirm the discount is based on the final purchase amount.

It certainly didn't list the exact values in the table. Instead it gave ranges that make sense but are not exactly what the table has. 

| # | Price (Rs.) | Qty | Total (Rs.) | Expected discount | Expected discount amount (Rs.) | Expected final (Rs.) | Actual final (Rs.) | Pass? |
| --- | --- | --- | --- | --- | --- | --- | --- | --- |
| 1 | 800 | 1 | 800 | 0% | 0.00 | 800.00 | 800.00 | Yes |
| 2 | 1000 | 1 | 1,000 | 5% | 50.00 | 950.00 | 950.00 | Yes |
| 3 | 4999 | 1 | 4,999 | 5% | 249.95 | 4,749.05 | 4749.05 | Yes |
| 4 | 5000 | 1 | 5,000 | 10% | 500.00 | 4,500.00 | 4500.00 | Yes |
| 5 | 7000 | 1 | 7,000 | 10% | 700.00 | 6,300.00 | 6300.00 | Yes |
| 6 | 1200 | 5 | 6,000 | 10% | 600.00 | 5,400.00 | 5400.00 | Yes |
| 7 | 999.99 | 1 | 999.99 | 0% | 0.00 | 999.99 | 999.99 | Yes |
| 8 | 250 | 4 | 1,000 | 5% | 50.00 | 950.00 | 950.00 | Yes |

| Edge case | What happens now? | What should happen? |
| --- | --- | --- |
| Total of Rs. 4,999.50 (between the 5% and 10% bands) | Treated as 5%: discount Rs. 249.98, final Rs. 4749.53, because the check is `totalAmount < 5000`. | 5% is the safe rule (at least Rs. 1,000 and below Rs. 5,000), but confirm it with the client. |
| Quantity 0 | Prints a bill with total Rs. 0.00, 0% discount and final Rs. 0.00. No error. | Reject it and ask again, since a bill for zero items makes no sense. |
| Negative price or quantity | Accepted. A price of -100 with quantity 2, or a price of 100 with quantity -2, both give total Rs. -200.00, 0% discount and a final amount of Rs. -200.00 (the discount shows as -0.00). | Reject with an error message and ask again, since prices and quantities should not be negative. |
| Text instead of a number for price | The program crashes with `java.util.InputMismatchException` at `nextDouble()` (line 17) and prints no bill. | Show a friendly message and ask for the price again instead of crashing. |


## Exercise 6

Here's the prompt we're instructed to use for this exercise:

```
I have a Java billing application with this method: 
 
public static double calculateDiscount(double totalAmount) 
 
It returns the discount amount in rupees. 
Generate beginner-friendly JUnit 5 test methods for it. 
 
Test the following: 
- Amount below Rs. 1,000 (800) 
- Amount exactly Rs. 1,000 
- Amount Rs. 4,999 
- Amount exactly Rs. 5,000 
- Amount above Rs. 5,000 (7,000) 
 
Use assertEquals(expected, actual, 0.001) for double values. 
Explain each test case and how the assertion verifies the expected result. 
Do not modify the business requirements. 
```

With this, I was able to copy the tests into the BillingApplicationTest file. I check and it had both the necessary imports. All the tests passed perfectly. 



| Test | Expected discount (Rs.) | Pass / fail | If failed: cause and fix |
| --- | --- | --- | --- |
| 800 | 0.00 | Pass | N/A |
| 1,000 | 50.00 | Pass | N/A |
| 4,999 | 249.95 | Pass | N/A |
| 5,000 | 500.00 | Pass | N/A |
| 7,000 | 700.00 | Pass | N/A |

## Exercise 7

I'll copy this prompt into the copilot window from the assignment:

```
Review the SmartStore billing application. 
 
Identify: 
1. Possible logical errors. 
2. Incorrect discount calculations. 
3. Potential invalid user inputs. 
4. Possible security or reliability issues. 
5. Improvements required before deploying this application. 
 
Explain which suggestions are critical and which are optional. 
```


| Finding from Copilot | Critical or optional? | Do you agree? Why? |
| --- | --- | --- |
| The 0%, 5%, and 10% discount thresholds and boundary comparisons are logically correct for valid positive purchase amounts. | Optional | Yes. I ran the program on 8 boundary inputs (800, 1000, 4999, 5000, 7000, 1200 x 5, 999.99, 250 x 4) and all gave the expected discount, and the 5 JUnit tests passed. This confirms the logic is right, so no change is needed. |
| Negative prices or quantities, zero quantity, `NaN`, `Infinity`, and integer overflow are not validated and can produce misleading totals or invalid bills. | Critical | Yes. When I ran it, a price of -100 with quantity 2 printed a bill with a total of Rs. -200.00, and quantity 0 printed an all-zero bill. Both should be rejected. |
| Non-numeric input causes `InputMismatchException` because `nextDouble()` and `nextInt()` are not checked and the input stream is not handled carefully after an invalid token. | Critical | Yes. When I entered text for the price, the program crashed with `InputMismatchException` at `nextDouble()` (line 17) and printed no bill. It should check the input and ask again. |
| Blank customer or product names are accepted, even though each should contain meaningful text. | Optional | Yes. A bill with an empty name is not useful, but it does not break the program, so optional is a fair label. |
| Unhandled exceptions and invalid values reduce reliability and can cause the application to terminate without producing a bill. | Critical | Yes. This is the same problem as the crash on text input, and it is the main weakness of the program. |


### Exercise 7 B

1. One difference in the weak vs strong prompts was that asking a vague question like `write java billing code` that it needed clarification to continue.
2. Another difference is the speed of the completion since it didn't have to ask as many questions with a more detailed prompt
3. The third is less token usage because we didn't have a multi-turn conversation (since the better prompt was detailed).

## Exercise 8



## Final Challenge: Employee Salary Calculator

### 1. My R-T-C-C-O prompt

```
Act as an experienced Java developer.

Create a Java salary calculator for a retail company, as the class SalaryCalculator in package week2.day2.assignment1.

Requirements:
1. Accept employee ID, employee name and basic salary.
2. Calculate HRA (House Rent Allowance) as 20% of basic salary.
3. Calculate DA (Dearness Allowance) as 10% of basic salary.
4. Calculate gross salary: basic + HRA + DA.
5. Deduct professional tax of Rs. 200 if gross salary is above Rs. 20,000.
6. Display the employee details and net salary.

Constraints:
- Use Java fundamentals only: variables, data types, if-else and arithmetic operators.
- Use Scanner for user input.
- Do not use advanced Java features.
- Write readable, beginner-friendly code with comments on the important logic.

Output: a complete executable Java program with a main() method, plus a sample run.
```

| Element | What I wrote |
| --- | --- |
| R (Role) | Act as an experienced Java developer |
| T (Task) | Create a Java salary calculator |
| C (Context) | A retail company, class SalaryCalculator in package week2.day2.assignment1, with the six requirements |
| C (Constraints) | Java fundamentals only, Scanner for input, beginner-friendly, with comments |
| O (Output) | A complete executable program with main() and a sample run |

### 2. First generated version

```java
package week2.day2.assignment1;

import java.util.Scanner;

public class SalaryCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter employee ID: ");
		String employeeId = input.nextLine();

		System.out.print("Enter employee name: ");
		String employeeName = input.nextLine();

		System.out.print("Enter basic salary: ");
		double basicSalary = input.nextDouble();

		// HRA is 20% of basic salary and DA is 10% of basic salary.
		double hra = basicSalary * 20 / 100;
		double da = basicSalary * 10 / 100;

		// Gross salary is basic + HRA + DA.
		double grossSalary = basicSalary + hra + da;

		// Professional tax of Rs. 200 applies only when gross is above Rs. 20,000.
		double professionalTax = 0;
		if (grossSalary > 20000) {
			professionalTax = 200;
		}

		double netSalary = grossSalary - professionalTax;

		System.out.println("\n--- Salary Slip ---");
		System.out.printf("Employee ID: %s%n", employeeId);
		System.out.printf("Employee Name: %s%n", employeeName);
		System.out.printf("Basic Salary: Rs. %.2f%n", basicSalary);
		System.out.printf("HRA: Rs. %.2f%n", hra);
		System.out.printf("DA: Rs. %.2f%n", da);
		System.out.printf("Gross Salary: Rs. %.2f%n", grossSalary);
		System.out.printf("Professional Tax: Rs. %.2f%n", professionalTax);
		System.out.printf("Net Salary: Rs. %.2f%n", netSalary);

		input.close();
	}
}
```

### 3. Code explanation (in my own words)

The program is pretty simple. I define some unchanging variables at the top of the class for the rules which I'll use throughout the helper functions. I definitely wanted a lean main func so I ensured that the output used member functions for calculating each value (hra, tax threshold, etc). The effect of this is that we can 1) call all the helpers from main 2) pass those variables neatly into the print helper `printSalarySlip`. The output used a string format method that we hadn't really covered, but I like that the agent was able to restrict the number of decimal places via that strategy. 

### 4. Refactoring

As stated earlier, my primary refactors were centralizing the constants at the top of the class and ensuring it broke out the calculations into their own methods. I think this greatly enhances the readability of the code: not just in the main function (cleaner without manual calculations) but also within member functions (where you can see the CONSTANT_VARIABLES which gives more insight into the business logic at a glance.)

I ran the first version and the refactored version on every test input below, and the output was identical each time.

### 5. Test scenarios

| # | Basic (Rs.) | HRA (Rs.) | DA (Rs.) | Gross (Rs.) | Tax (Rs.) | Expected net (Rs.) | Actual net (Rs.) | Pass? |
| --- | --- | --- | --- | --- | --- | --- | --- | --- |
| 1 | 10,000 | 2,000 | 1,000 | 13,000 | 0 | 13,000.00 | 13000.00 | Yes |
| 2 | 15,000 | 3,000 | 1,500 | 19,500 | 0 | 19,500.00 | 19500.00 | Yes |
| 3 | 16,000 | 3,200 | 1,600 | 20,800 | 200 | 20,600.00 | 20600.00 | Yes |
| 4 | 50,000 | 10,000 | 5,000 | 65,000 | 200 | 64,800.00 | 64800.00 | Yes |
| 5 | 15,385 (my own boundary value) | 3,077 | 1,538.50 | 20,000.50 | 200 | 19,800.50 | 19800.50 | Yes |
| 6 | 15,384 (just below the boundary) | 3,076.80 | 1,538.40 | 19,999.20 | 0 | 19,999.20 | 19999.20 | Yes |

### 6. Weaknesses I found in the generated solution

- The program allows a negative salary which should be rejected.
- The program allows text input when asking for doubles which caused exceptions when ran
- Name / id are allowed to be empty (and ID could be auto-incrementing instead)
