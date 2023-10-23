package Activity2;

public class AdminUser {

    public static void main(String[] args) {
         // //task 1
        // boolean isAdmin = false;
        int i = 0;
        
        do {
        // System.out.println("i: " + i);
        // System.out.println("userName: " + userName);
        String userName = System.console().readLine("Enter your user name: ");
        if (userName.equals("admin")) {
            System.out.println("😊 Welcome Admin");
            // isAdmin = true;
            break;
        }
        
        System.out.println("wrong user");
        i++;
        } while (i < 3);

        //task 2
        // boolean isAdmin = false;
        //  int i = 0;
        
        // do {
        // // System.out.println("i: " + i);
        // String userName = System.console().readLine("Enter your user name: ");
        // System.out.println("userName: " + userName);
        // if (userName.equals("admin")) {
        //     System.out.println("😊 Welcome Admin");
        //     isAdmin = true;
        //     break;
        // }
        // i++;
        // if (i == 3){
        //     System.out.println("too many attempts");
        //     break;
        // }

        
        // } while (!isAdmin);


    
    }
    
}
