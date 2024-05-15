import java.util.Scanner;
public class Sequence {
    public static void main(String[] args) throws Exception {
        Scanner myScanner = new Scanner(System.in);

        boolean streak = false;
        int counter = 0;
        int maxCounter = 0;
        int streakStartId = 0;

        //String
        System.out.print("Insert string: ");
        String stringToCheck = myScanner.nextLine();
        char[] charArray = stringToCheck.toCharArray();

        //Char
        System.out.print("Insert char: ");
        char charToCheck = myScanner.next().charAt(0);

        for (int i = 0; i < charArray.length; i++) {
            if((charToCheck == charArray[i]) && !(streak)){
                streak = true;
                streakStartId = i;
                counter++;
            } else if((charToCheck == charArray[i]) && (streak)){
                counter++;
            } else if((charToCheck != charArray[i]) && (streak)){
                maxCounter = counter;
                streak = false;
                counter = 0;
            }
        }

        if (streak) {
            System.out.print("Max char streak: " + counter);
        } else{
            System.out.print("Max char streak: " + maxCounter);
        }
        System.out.print(" starting at index: " + streakStartId);
    }
} 
