package Activity3;

public class LoopAssignment {

    public static void main(String[] args) {
         // Task 1. Create a while loop that prints all the odd numbers from 1 to 50
        
        // Add code here
        int number = 0;

        while(number <= 50){
            if(number % 2 == 1){
                System.out.println(number);
            }
            number++;
        }


        /* 
            Task 2. Create a do-while loop that prints the following pattern from 1 to 30:
            If the number is divisible by 3, print "Fizz"
            If the number is divisible by 5, print "Buzz"
            If the number is divisible by 3 AND 5, print "FizzBuzz"
            If the number is not divisible by 3 nor 5, print "Pop"
        */

        // Add code here
      
        int i = 1;

        do{
            if(i % 3 == 0){
                System.out.println(i + " Fizz");
            }

            if (i % 5 == 0){
                System.out.println(i + " Buzz");
            }

            if (i % 3 == 0 && i % 5 == 0){
                System.out.println(i + " FizzBuzz");
            }

            if (i % 3 != 0 && i % 5 != 0){
                System.out.println(i + " Pop");
            }

            i++;
        }
        while(i <= 30);
        // Task 3. Use an enhanced for-loop to compute for the average of the given array

        int expenses[] = {120, 130, 114, 112, 132, 154, 123, 112, 165, 144, 188, 200};
        float average = 0.0f;
        // Add code here

        for(int expense : expenses){
            average += expense;
        }

        System.out.println(average/expenses.length); 
    
    }

}