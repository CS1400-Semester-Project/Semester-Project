import java.util.Scanner;
import java.lang.String;

public class test {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        

        // Entering the Store

        System.out.println("Hello welcome to the Awesome Store! Would you like to enter? Please say Yes or No:\n");
        String userYN = scnr.nextLine();

        if (userYN.equals("yes")) {
            System.out.println("Welcome in.\n");
        }
        else if (userYN.equals("Yes")) {
            System.out.println("Welcome in.\n");
        }
        else if (userYN.equals("no")) {
            System.out.println("I understand, please have a wonderful day!");
            System.exit(0);
        }
        else if (userYN.equals("No")) {
            System.out.println("I understand, please have a wonderful day!");
            System.exit(0);
        }
        else {
            System.out.println("Invalid input! Run code again and input Yes or No");
            System.exit(0);
        }



        // Cart or Basket 

        System.out.println("Would you like to get a cart or a basket? (you also have the option of choosing neither : please input anything for this option)");
        String cartBasket = scnr.nextLine();

        String[] maxItemsCart = new String[10];   // array for items if they choose cart
        String[] maxItemsBasket = new String[5]; // array for items if they choose basket
        String[] maxItemsHands = new String[2];   // array for items if they choose neither

        if (cartBasket.equals("Cart")) {
            System.out.println("Because you chose a cart you may add up to 10 items in your basket.\n");
        }
        else if (cartBasket.equals("cart")) {
            System.out.println("Because you chose a cart you may add up to 10 items in your basket.\n");
        }
        else if (cartBasket.equals("Basket")) {
            System.out.println("Because you chose a basket you may add up to 5 items in your basket.\n");
        }
        else if (cartBasket.equals("basket")) {
            System.out.println("Because you chose a basket you may add up to 5 items in your basket.\n");
        }
        else {
            System.out.println("Because you chose neither you may only grab 2 items.\n");
            cartBasket.equals("neither");
        }
        
        
        // Choosing Aisles to shop in
        System.out.println("Which shopping aisle would you like to travel to first?");
        String[] choosingAisle = {"Cold Items", "Fresh Produce", "Meat & Seafood", "Breakfast Foods", "Drinks", "Canned Foods"};
        
        for (int i = 0; i < choosingAisle.length; i++) {
            System.out.println((i + 1) + ". " + choosingAisle[i]);
        }

        // Prompt the user to choose an item
        System.out.print("Please enter the number of the aisle you want to choose: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        // Validate the user's choice
        if (choice >= 1 && choice <= choosingAisle.length) {
            System.out.println("You selected: " + choosingAisle[choice - 1]);
        } else {
            System.out.println("Invalid choice!");
        }






    }
}

