import java.util.Scanner;
public class Ticket {
    public static void main(String[] args) throws Exception {
        Scanner myScanner = new Scanner(System.in);

        //Kilometers
        System.out.print("Insert how kilometers you wanna travel: ");
        int km = myScanner.nextInt();
        System.out.println("You'll run " + km + " kilometers.");

        //Age
        System.out.print("Insert age (discounts for under 18 and over 65): ");
        int age = Integer.parseInt(myScanner.nextLine());
        System.out.println("You are " + age + " years old.");
        
        //Ticket Price
        double price = (double)km * 0.21;

        if(age < 18){
            price = price * 0.8;
        } else if(age > 65){
            price = price * 0.6;
        }

        System.out.print("Your ticket costs " + price);
    }
} 
