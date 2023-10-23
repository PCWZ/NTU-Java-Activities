package ATM;

public class AtmMachine {

    public static void main(String[] args) {

        // Declaration of variables
        int menuSelect = 0;
        double balance = 0;
        boolean login = true;

        // Start of Atm system
        do {
            System.out.println("Welcome to the ATM Machine");
            System.out.println("1.Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            String userInput = System.console().readLine("Enter your choice:");

            menuSelect = Integer.parseInt(userInput);
            
            //Switch case for menu selection
            // int menuEnter = 0;

            // int selectMenu = switch (menuSelect) {
            //     case 1 -> menuEnter = 1;
            //     case 2 -> menuEnter = 2;
            //     case 3 -> menuEnter = 3;
            //     case 4 -> menuEnter = 4;
            //     default -> {System.out.println( menuSelect + " is not valid menu selection!");}
        
            // };
    
            // if statement for menu selection
            if (menuSelect == 1) {

                String inputDepost = System.console().readLine("How much would you like to deposit: ");
                balance += Double.parseDouble(inputDepost);
                System.out.println(balance);
                continue;
            }

            if (menuSelect == 2) {
                String inputWithdraw = System.console().readLine("How much would you like to withdraw: ");
                double myDouble = Double.parseDouble(inputWithdraw);
                // System.out.println(myDouble);
                // System.out.println(inputWithdraw);
                if ( myDouble < balance) {
                    balance -= myDouble;
                    System.out.println(balance);
                    continue;
                }

                else {
                    System.out.println("Insufficient Fund");
                    continue;
                }

            }

            if (menuSelect == 3) {
                System.out.println(balance);
                continue;
            }

            if (menuSelect == 4) {
                System.out.println("Thank you for using the ATM Machine");
                login = false;
            }

        }

        while (login);


    }
    
    
}
