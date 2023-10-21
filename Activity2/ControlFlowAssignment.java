package Activity2;

public class ControlFlowAssignment {

    public static void main(String[] args) {

        // Task 1. Determine if a number is divisible by 3, 5 or both.
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

        /*
         * Task 2. Given a sample budget, determine what to ride given the following
         * conditions:
         * - if budget is greater than 100, ride a taxi
         * - if budget is between 50 to 100, ride train
         * - if budget is between 20 to 49, ride bus
         * - if budget is between 0 to 19, walk
         * 
         * Reference: What is enum? https://www.w3schools.com/java/java_enums.asp
         */
        float budget = 72.7f;
        enum TransportMode {
            TAXI,
            TRAIN,
            BUS,
            WALK
        }
        TransportMode mode = TransportMode.WALK;

        if (budget > 100) {
            mode = TransportMode.TAXI;
        }

        else if (budget >= 50 && budget <= 100) {
            mode = TransportMode.TRAIN;
        }

        else if (budget >= 20 && budget <= 49) {
            mode = TransportMode.BUS;
        }

        System.out.println(mode);

        /*
         * Task 3. Use a switch case to determine the zodiac animal given a number from
         * 1 to 12. (1 - rat, 2 - ox, 3 - tiger, etc.)
         * 
         * Code Challenge: Delcare and use enum for your zodiac
         * 
         */

        int animalNumber = 8;

        enum Zodiac {
            RAT,
            OX,
            TIGER,
            RABBIT,
            DRAGON,
            SNAKE,
            HORSE,
            GOAT,
            MONKEY,
            ROOSTER,
            DOG,
            PIG
        }

        String animal = switch (animalNumber) {
            case 1 -> String.valueOf(Zodiac.RAT);
            case 2 -> String.valueOf(Zodiac.OX);
            case 3 -> String.valueOf(Zodiac.TIGER);
            case 4 -> String.valueOf(Zodiac.RABBIT);
            case 5 -> String.valueOf(Zodiac.DRAGON);
            case 6 -> String.valueOf(Zodiac.SNAKE);
            case 7 -> String.valueOf(Zodiac.HORSE);
            case 8 -> String.valueOf(Zodiac.GOAT);
            case 9 -> String.valueOf(Zodiac.MONKEY);
            case 10 -> String.valueOf(Zodiac.ROOSTER);
            case 11 -> String.valueOf(Zodiac.DOG);
            case 12 -> String.valueOf(Zodiac.PIG);
            default -> {

                yield animalNumber + " is not a valid choice";
            }
        };

        System.out.println("Your Zodiac Animal is : " + animal);

    }

}
