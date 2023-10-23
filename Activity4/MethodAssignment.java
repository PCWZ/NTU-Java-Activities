package Activity4;

public class MethodAssignment {

    public static void main(String[] args) {
         //Uncomment these to test:
       System.out.println(checkOddEven(998)); 
       System.out.println(checkOddEven(1237));

        //Uncomment these to test:
        System.out.println(capsCombine("john", "smith"));
        System.out.println(capsCombine("charlize","doe"));

        //Uncomment these to test:
        int test_arr1[] = {1, 2, 3, 4, 5};
        int test_arr2[] = {99, 100, 77, 62, 87, 92, 91, 100};
        System.out.println(getAverage(test_arr1));
        System.out.println(getAverage(test_arr2));

    }

    //1. Create a method called checkOddEven that gets an integer and prints "The number is odd/even" depending on the result.

    public static String checkOddEven(int number) {
        if (number % 2 == 0) {
            return "even";
        }
        else {
            return "odd";
        }
    }

    
    //2. Create a method called capsCombine that gets two strings and converts both to uppercase and joins them with a space.

    public static String capsCombine(String one, String two){
        return one.toUpperCase() + " " + two.toUpperCase();

    }

    //3. Create a method called getAverage that gets an array of numbers and returns the average of the values in the array.

    public static int getAverage (int[] numbers){
        
        int total = 0;

        for(int number : numbers){
            total += number;
        }

        return total/numbers.length;

    }
    
    
}
