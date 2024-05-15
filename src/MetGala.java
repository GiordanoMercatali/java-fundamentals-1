import java.util.Arrays;
import java.util.Scanner;

public class MetGala {
    public static void main(String[] args) throws Exception {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Your name please: ");
        String name = myScanner.nextLine();
        boolean isNamePresent = false;

        String[] guestsArray = {
            "Jennifer Lopez",
            "Zendaya",
            "Chris Hemsworth",
            "Bad Bunny",
            "Cara Delevingne",
            "Kendall Jenner",
            "Uma Thurman",
            "Damiano David",
            "Luca Guadagnino"
        };

        for (int i = 0; i < guestsArray.length; i++) {
            if(name.equals(guestsArray[i])){
                isNamePresent = true;
            }
        }

        if(isNamePresent){
            System.out.println("Welcome!");
        } else{
            System.out.println("Go away!");
        }

        // if(Arrays.asList(guestsArray).contains(name)){
        //     System.out.println("Welcome!");
        // } else{
        //     System.out.print("Get out of here!");
        // }
    }

    

    
}
