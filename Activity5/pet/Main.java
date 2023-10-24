package Activity5.pet;

public class Main {
    public static void main(String[] args) {

        Pet dog = new Pet("Chocolate", "Pomsky", "male", 3, true);

        Pet cat = new Pet("Mercy", "munchkin", "female", 5, true);

        
        dog.call("Woff");
        dog.eat("treats");
        dog.sleep();

        cat.call("Meow");
        cat.eat("fish");
        cat.sleep();


    }
}
