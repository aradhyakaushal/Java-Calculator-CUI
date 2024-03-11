# Console-Based Calculator in Java

## Purpose
This Java program implements a console-based calculator that takes user input for two numbers and an operator (+, -, *, /), performs the corresponding arithmetic operation, and displays the result.

## Explanation

1. **Importing Required Package**:
    - The code imports the `Scanner` class from the `java.util` package, which allows reading input from the console.

2. **Class Definition**:
    - The `ConsoleCalculator` class is defined to encapsulate the functionality of the calculator.

3. **Main Method**:
    - The `main` method serves as the entry point of the program, where execution begins.

4. **Initialization**:
    - Variables `num1`, `num2`, and `operator` are declared to store the input values from the user.

5. **Input Prompt**:
    - The user is prompted to enter the first number using `System.out.print`.

6. **Reading Input**:
    - The first number entered by the user is read using `scanner.nextDouble()` and stored in `num1`.

7. **Operator Prompt**:
    - The user is prompted to enter the operator (+, -, *, /) for the arithmetic operation.

8. **Reading Operator**:
    - The operator entered by the user is read as a character using `scanner.next().charAt(0)` and stored in `operator`.

9. **Second Number Prompt**:
    - The user is prompted to enter the second number for the operation.

10. **Reading Second Number**:
    - The second number entered by the user is read using `scanner.nextDouble()` and stored in `num2`.

11. **Arithmetic Operation**:
    - Based on the operator entered, the code performs the corresponding arithmetic operation using a `switch` statement.

12. **Addition**:
    - If the operator is `+`, the code adds `num1` and `num2`.

13. **Subtraction**:
    - If the operator is `-`, the code subtracts `num2` from `num1`.

14. **Multiplication**:
    - If the operator is `*`, the code multiplies `num1` and `num2`.

15. **Division**:
    - If the operator is `/`, the code divides `num1` by `num2`, handling division by zero error.

16. **Result Display**:
    - Finally, the result of the arithmetic operation is displayed on the console in the format: `num1 operator num2 = result`.