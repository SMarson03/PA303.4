//import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //1. Write a program that declares 1 integer variable x, and then
        // assigns 7 to it. Write an if statement to print out “Less than 10”
        // if x is less than 10. Change x to equal 15, and notice the result
        // (console should not display anything).

//        int x = 7;
//        LessThan10(x);
//
//        x= 15;
//        LessThan10(x);
//    }
//    public static void LessThan10(int x) {
//        if (x < 10){
//            System.out.println("Less than 10");
//        }
//
//    }

        LessThan10(7);
        LessThan10(15);
        LessThanOrGreaterThan10(7);
        LessThanOrGreaterThan10(15);
//        Between10And20(15);
//        IsInRange(15);
//        IsInRange(5);

        int grade, day, salary;
//        Scanner scan = new Scanner(System.in);
//        grade = scan.nextInt();
//        day = scan.nextInt();
//        scan.nextLine();
//        String FilingStatus;
//        FilingStatus = scan.nextLine();
//        salary = scan.nextInt();
//        scan.close();
//        GetLetterGrade(grade);
//        WeekdayName(day);
//        GetTax(FilingStatus, salary);
    }

    public static void LessThan10(int x) {
        if (x < 10){
            System.out.println("LessThan10");
        }

    }

        //2. Write a program that declares 1 integer variable x, and then assigns 7 to it.
    // Write an if-else statement that prints out “Less than 10” if x is less than 10, and
    // “Greater than 10” if x is greater than 10. Change x to 15 and notice the result.
        public static void LessThanOrGreaterThan10(int x) {
        if (x < 10){
            System.out.println("Less than 10");
        }else if (x > 10){
            System.out.println("Greater than 10");
        }
      }

        //3. Write a program that declares 1 integer variable x, and then assigns 15 to it.
    // Write an if-else-if statement that prints out “Less than 10” if x is less than 10;
    // “Between 10 and 20” if x is greater than 10 but less than 20, and “Greater than or equal
    // to 20” if x is greater than or equal to 20. Change x to 50 and notice the result.

    public static void main(String[] args) {
        
    }
        //4. Write a program that declares 1 integer variable x, and then assigns 15 to it. Write an if-else statement that prints “Out of range” if the number is less than 10 or greater than 20 and prints “In range” if the number is between 10 and 20 (including equal to 10 or 20). Change x to 5 and notice the result.
        //
        //5. Write a program that uses if-else-if statements to print out grades A, B, C, D, F, according to the following criteria:
        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //F: <60
        //Use the Scanner class to accept a number score from the user to determine the letter grade. Print out “Score out of range” if the score is less than 0 or greater than 100.
        //
        //6. Write a program that accepts an integer between 1 and 7 from the user. Use a switch statement to print out the corresponding weekday. Print “Out of range” if the number is less than 1 or greater than 7. Do not forget to include “break” statements in each of your cases.
        //
        //7. Create a program that lets the users input their filing status and income. Display how much tax the user would have to pay according to status and income.
        //❑	The U.S. federal personal income tax is calculated based on the filing status and taxable income.
        //❑	There are four filing statuses: Single, Married Filing Jointly, Married Filing Separately, and Head of Household.
        //❑	The tax rates for 2009 are shown below.

    }
