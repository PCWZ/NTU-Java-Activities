package Activity4;

import javax.swing.text.Position;

public class LearnMethods {

    public static void main(String[] args) {
        System.out.println("Empolyee Bonus: " + calcBonus(5000));

        System.out.println("Staff Bonus: " + calcBonus(5000, 0.2));
        System.out.println("Ceo Bonus: " + calcBonus(5000, 1.5));

        // Activity 1
        System.out.println("Ceo Bonus: " + bouncCalc(5000, Position.CEO));

        // Activity 2
        double[] salary1 = { 1000, 2000, 3000 };
        double[] salary2 = { 1000, 2000, 3000, 4000, 5000, 6000 };

        System.out.println("Bonus based on average Salary: " + bonusCalc(salary1));
        System.out.println("Bonus based on average Salary: " + bonusCalc(salary2));

    }

    public static double calcBonus(double salary) {
        return salary * 0.1;
    }

    public static double calcBonus(double salary, double bonusRate) {
        return salary * bonusRate;
    }

    enum Position {
        STAFF,
        MANAGER,
        CEO
    }

    public static double bouncCalc(double salary, Position position) {

        // double bonus = switch(position) {
        // case CEO -> salary * 3;
        // case MANAGER-> salary * 0.2;
        // case STAFF -> salary * 0.1;
        // };

        return switch (position) {
            case CEO -> salary * 3;
            case MANAGER -> salary * 0.2;
            case STAFF -> salary * 0.1;
        };

        // return salary * bonusRate;
    }

    // Activity 2

    public static double bonusCalc(double[] salaries) {

        if (salaries.length < 6) {
            return 0;
        }

        double annualSalary = 0;

        for (double salary : salaries) {
            annualSalary += salary;
        }

        // return (annualSalary / salaries.length) * 0.1;
        return calcBonus(annualSalary / salaries.length);

    }

    

}
