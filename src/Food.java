import java.util.Scanner;
public class Food {
    public static void main(String[] args) throws Exception {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Choose the size of the list (min. 5 max. 10): ");
        int arrayLength = Integer.parseInt(myScanner.nextLine());
        // myScanner.nextLine();

        if(arrayLength < 5){
            arrayLength = 5;
        } else if(arrayLength > 10){
            arrayLength = 10;
        }

        String[] foodArray = new String[arrayLength];
        // System.out.println("Array length: " + arrayLength);

        for (int i = 0; i < foodArray.length; i++) {
            System.out.print("Choose rank " + (i+1) + ": ");
            foodArray[i] = myScanner.nextLine();
        }

        for (int j = 0; j < foodArray.length; j++) {
            System.out.println((j+1) + ". " + foodArray[j]);
        }
    }
} 
