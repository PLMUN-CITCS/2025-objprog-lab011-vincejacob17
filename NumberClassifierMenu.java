import java.util.Scanner;

public class NumberClassifierMenu {
    public static void main(String[] args) {

Scanner input = new Scanner(System.in);
char userChoice;
do {
    // Menu and logic will go here
} while (userChoice == 'Y'); // Condition to continue
System.out.println("\n=== Number Classifier Menu ===");
System.out.println("1. Classify a number as positive, negative, or zero");
System.out.println("2. Print a multiplication table for a given number");
System.out.println("3. Exit");
System.out.print("Enter your choice (1-3): ");
int choice = input.nextInt();
switch (choice) {
    case 1: 
        // Code for option 1
        break;
    case 2:
        // Code for option 2
        break;
    case 3:
        // Code for option 3
        break;
    default:
        // Handle invalid choice
}
System.out.print("Enter a number to classify: ");
int number = input.nextInt();
// Use if–else selection to classify the number.
if (number > 0) {
   System.out.println("The number " + number + " is positive.");
} else if (number < 0) {
   System.out.println("The number " + number + " is negative.");
} else {
   System.out.println("The number is zero.");
}
// Demonstrate additional boolean expression: check if the number is even.
if (number % 2 == 0) {
   System.out.println("It is also an even number.");
} else {
   System.out.println("It is an odd number.");
}
System.out.print("Enter a number to display its multiplication table: ");
int tableNumber = input.nextInt();
System.out.println("Multiplication Table for " + tableNumber + ":");
// Use a for loop for table generation.
for (int i = 1; i <= 10; i++) {
   System.out.println(tableNumber + " x " + i + " = " + (tableNumber * i));
}
// Option 3: Exit the program.
System.out.println("Exiting the program. Goodbye!");
System.out.println("Invalid option. Please choose between 1 and 3.");
System.out.print("Do you want to return to the menu? (Y/N): ");
input.nextLine(); // Consume newline
userChoice = input.nextLine().toUpperCase().charAt(0);
input.close();
    }
}