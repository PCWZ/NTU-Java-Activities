package Activity4;

public class VendingMachine {

    // Activity 3

    enum EPayment {
        PAYNOW, GRABPAY, FAVEPAY
    }

    public void makePayment(double amount) {
        System.out.println("Accepting cash payment of " + amount);
        dispenseDrink();
    }

    public void makePayment(EPayment payment) {

        boolean paymentSuccess = switch (payment) {
            case PAYNOW -> connectPayNow();
            case GRABPAY -> connectGrabPay();
            case FAVEPAY -> connectFavePay();
        };

        if (paymentSuccess) {
            dispenseDrink();
        } else {
            System.out.println("Payment unsuccessful.");
        }

    }

    private void dispenseDrink() {
        System.out.println("Dispensing drink...");
    }

    private boolean connectPayNow() {
        return true;
    }

    private boolean connectGrabPay() {
        return false;
    }

    private boolean connectFavePay() {
        return true;
    }

}
