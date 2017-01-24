/*
 * 1.1
 * A C program, whatever its size is, consists of functions and variables
 * A function contains statements that specify the computing operations to be done
 * A variable stores values used during the computation
 * Your program begins executing at the beginning of main
 *
 * The first line of the program "include <stdio.h> tells the compiler to include information
 * about the standard input/output library
 *
 * printf never supplies a newline automatically, so serveral calls may be used to build up an output line in stages
 *
 * 1.2
 * Next program uses the formula C = (5/9)(F - 32) to print the table of Fahrenheit temps and their Celsius equivalent
 * Type int means that the variables listed are integers
 * By contrast with float, which means floating point, i.e., numbers that may have a fractional part
 * The range of both int and float depends on the machine you are using; 16-bit ints, which lie between -32768 and +32767
 * A float number is typically a 32-bit quantity, which at least six significant digits and magnitude generally between about
 * 10^-38 and 10 ^+38.
 *
 * C provides basic data types besides int and float including:
 * char     character - a single byte
 * short    short integer
 * long     long integer
 * double   double-precision floating point
 *
 * There are also arrays, structures and unions of these basic types, pointer to them, and functions that return them
 *
 * The while loop operates as follows: The condition in parentheses is tested. If it is true, the body of the loop is executed.
 * Then the condition is re-tested, when the test becomes false the loop ends, and execution continues at the statement
 * that follows the loop.
 *
 * In C and many other languages, integer division truncates: any fractal part is discarded
 * Since 5 and 9 are integers, 5/9 would be truncated to zero and so all the Celsius temps would be zero
 *
 * %d       print as decimal integer
 * %6d      print as decimal integer, at least 6 characters wide
 * %f       print as floating point
 * %6f      print as floating point, at least 6 characters wide
 * %.2f     print as floating point, 2 characters after decimal point
 * %6.2f    print as floating point, at least 6 characters wide with 2 characters after decimal point
 *
 * 1.3
 * The for statement is a loop. It is separated into three parties, separated by semicolons.
 * The first part is the initialization
 * The second part is the test or condition that controls the loop
 * The condition is evaluated, if its true, the body of the loop is executed, then the increment step
 *
 * 1.4
 * You should not bary 300 and 20 in a program...they are "magic numbers"
 * One way to deal with magic numbers is to give them meaningful names
 * A #define line defines a symbolic name or symbolic constant to be a particular string of characters
 * #define name replacement text
 * Thereafter, any occurrence of name will be replaced by the corresponding replacement text
 * The quantities LOW, HIGH, STEP are symbolic constants, not variables, so they do not appear in declarations
 *
 * 1.5
 *
 */
#include <stdio.h>

#define LOW 0
#define HIGH 300
#define STEP 20

main() {
    hello();
}

int hello() {
    printf("hello, ");
    printf("world");
    printf("\n");
    tempTableWhile();
    tempTableFor();
    tempTableForReverse();
    return 0;
}

int tempTableWhile() {
    float fahr, celsius;


    fahr = LOW;

    printf("\nFahrenheit\tCelsius\n\n");
    while (fahr <= HIGH) {
        celsius = (5.0 / 9.0) * (fahr - 32);
        printf("%3.0f\t%6.1f\n", fahr, celsius);
        fahr = fahr + STEP;
    }
}

int tempTableFor() {
    float fahr, celsius;
    printf("\nFOR TABLE\n");
    printf("\nFahrenheit\tCelsius\n\n");
    for (fahr = LOW; fahr <= HIGH; fahr = fahr + STEP) {
        celsius = (5.0 / 9.0) * (fahr - 32);
        printf("%3.0f\t%6.1f\n", fahr, celsius);
    }
}

int tempTableForReverse() {
    float fahr, celsius;
    printf("\nReverse FOR TABLE\n");
    printf("\nFahrenheit\tCelsius\n\n");
    for (fahr = HIGH; fahr >= LOW; fahr = fahr - STEP) {
        celsius = (5.0 / 9.0) * (fahr - 32);
        printf("%3.0f\t%6.1f\n", fahr, celsius);
    }
}

