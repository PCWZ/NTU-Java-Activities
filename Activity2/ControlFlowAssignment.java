package Activity2;

public class ControlFlowAssignment {

    public static void main(String[] args) {
        
        //    Task 1. Determine if a number is divisible by 3, 5 or both.
        int numToTest = 995;
        boolean isDivisible;
        // Add code here

        if (numToTest % 3 == 0) {
            isDivisible = true;
            System.out.println(isDivisible);
        }

        else {
            isDivisible = false;
            System.out.println(isDivisible);
        }

        if (numToTest % 5 == 0) {
            isDivisible = true;
            System.out.println(isDivisible);
        }

        else {
            isDivisible = false;
            System.out.println(isDivisible);
        }

        if (numToTest % 3 == 0 && numToTest % 5 == 0) {
            isDivisible = true;
            System.out.println(isDivisible);
        }

        else {
            isDivisible = false;
            System.out.println(isDivisible);
        }

   
    }
    
}
