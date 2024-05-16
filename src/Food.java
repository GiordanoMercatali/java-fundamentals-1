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

        int midElem = (Integer)arrayLength/2;
        

        String[] foodArray = new String[arrayLength];
        // System.out.println("Array length: " + arrayLength);

        for (int i = 0; i < foodArray.length; i++) {
            System.out.print("Choose rank " + (i+1) + ": ");
            foodArray[i] = myScanner.nextLine();
        }

        // for (int j = 0; j < foodArray.length; j++) {
        //     if(j == 0){
        //         System.out.println("Top food: " + foodArray[0]);
        //     } else if(j == foodArray.length-1){
        //         System.out.println("Worst food: " + foodArray[foodArray.length-1]);
        //     } else if(j == midElem){
        //         System.out.println("Mid food: " + foodArray[midElem]);
        //     }
        // }

        System.out.println("Total length: " + arrayLength);
        System.out.println("Favorite food: " + foodArray[0]);
        System.out.println("Least favorite food: " + foodArray[foodArray.length-1]);
        System.out.println("Mid food: " + foodArray[midElem]);
    }
} 
