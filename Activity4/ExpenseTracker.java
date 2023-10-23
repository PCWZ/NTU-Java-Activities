package Activity4;

import java.util.ArrayList;

public class ExpenseTracker {

    public static void main(String[] args) {
        boolean active = true;
        double total = 0;
        ArrayList<Double> expenseList = new ArrayList<>();
        
        // ArrayList<expenseDesc> expenseList = new ArrayList<>();
       

        while (active) {
            showMenu();
            int userInput = Integer.parseInt(System.console().readLine("Enter your choice:"));
            switch (userInput) {
                case 1 -> {
                    double userInputAdd = Double.parseDouble(System.console().readLine("Enter your Amount:"));
                    total = addExpense(userInputAdd, total);

                    expenseList.add(userInputAdd);

                // String userInputDesc = System.console().readLine("Expenses Description: ");

                //    record expenseDesc(String desc, double expense){
                //      this.desc = userInputDesc;
                //      this.expense = userInputAdd;
                //     }
                 
                //     for (int i = 0, )

                    System.out.println("Expense has been added!\n");

                }

                case 2 -> System.out.println(expenseList + "\n");

                case 3 -> System.out.println(total + "\n");

                case 4 -> {
                    System.out.println(getAverage(total, expenseList) + "\n");
                }

                case 5 -> {
                    active = false;
                }

            }
        }
    }


    public static void showMenu() {
        System.out.println("Welcome to the Expense Tracker");
        System.out.println("1. Add an expense");
        System.out.println("2. List all expenses");
        System.out.println("3. Total Expenses");
        System.out.println("4. Average Expenses");
        System.out.println("5. Exit");

    }

    public static double addExpense(double add, double totalExp) {
        return totalExp += add;
    }

    public static double getAverage(double totalAvg, ArrayList<Double> expenseList) {

        return totalAvg / expenseList.size();

    }

    
    
    
}
