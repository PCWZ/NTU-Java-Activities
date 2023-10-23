package Activity3;

import java.util.ArrayList;   


public class ArrayActivity {
    public static void main(String[] args) {
        boolean active = false;
        ArrayList<String> suspect = new ArrayList<>();
        ArrayList<String> alibi = new ArrayList<>();
        String culprit = null;
        // int culpritLength = 0;
        int defaultLength = 0;

        while (!active) {
            String userInput1 = System.console().readLine("Enter a suspect, blank if done: ");

            if (userInput1.isEmpty()) {
                System.out.println("Suspects List " + suspect);
                break;

            }

            else {
                if (suspect.contains(userInput1)) {
                    System.out.println("You're one of the suspect!");
                } else {
                    suspect.add(userInput1);
                    // System.out.println(suspect);
                }

            }
        }

        while (!active) {
            String userInput2 = System.console().readLine("Enter a suspect with an alibi, blank if done: ");

            if (userInput2.isEmpty()) {
                // System.out.println(suspect);
                suspect.removeAll(alibi);

                System.out.println("Updated Suspects List " + suspect);

                for (int i = 0; i < suspect.size(); i++) {
                    if (suspect.get(i).length() > defaultLength) {
                        culprit = suspect.get(i);
                        defaultLength = suspect.get(i).length();
                        // culpritLength = suspect.get(i).length();
                    }
                }

                System.out.println(
                        "The culprit is " + culprit + " because his/her name is " + defaultLength + " letters long.");
                break;

            }

            else {
                if (suspect.contains(userInput2)) {
                    alibi.add(userInput2);
                }

                else {
                    System.out.println("invalid suspect name");
                }

            }
        }

    
    }
}
