package Activity5.vendingmachine;

enum Drink{
        COKE,
        WATER
    }

public class VendingMachine {

    private String location;
    private double earnings;
    private double balance;
    // ArrayList<VendingTransaction> transaction = new ArrayList<>();

   

    public VendingMachine(String location){
        this.location = location;
    }

    public void insertCoin(double coin) {
        balance += coin;
    //    setBalance(balance);
       System.out.println("you have inserted: $" + balance);
    }

    public void selectDrink(Drink drink) {
        double newBalance = balance;
        double price = getPrice(drink);

        if (newBalance < price){
            System.out.println("Insufficient Payment!");
        }

        else {
            earnings += balance;
            // setBalance(0);
            dispenseDrink();
            balance = 0.0;
            // setEarnings(earnings);
            
        }
        
    }

    public double getPrice(Drink drink) {
        // switch (drink) {
        //     case COKE -> {return 1.5;}
        //     case WATER -> {return 1.5;}
        //     default -> {return 0.0;}  

        // }

          return switch (drink) {
            case COKE -> 1.5;
            case WATER -> 1.5;
            

        };
        
    }

     public void dispenseDrink() {
        System.out.println("Dipensing Drink...");
        
    }

    public void printEarnings() {

        System.out.println("Total Earnings: $" + earnings);
        
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getEarnings() {
        return earnings;
    }

    public void setEarnings(double earnings) {
        this.earnings = earnings;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
}
