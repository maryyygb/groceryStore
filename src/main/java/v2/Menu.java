package v2;

import java.util.Scanner;

public class Menu {
    // private MenuActions menu = new MenuActions();
    private int choice;

    // It is best practice to share a single Scanner instance or create it in Main
    // and pass it around, but simply removing the close calls fixes the immediate
    // error.

    public void adminMenu() {
        Scanner s = new Scanner(System.in);

        System.out.println("=============================");
        System.out.println(" ");
        System.out.println("=============================");
        System.out.println(" ");
        System.out.println("========= Admin's Menu ========");
        System.out.println(" ");
        System.out.println("Choose the number of your choice.");
        System.out.println(" ");
        System.out.println("0 -   Log Out");
        System.out.println("1 -   Add Grocery Item");
        System.out.println("2 -   View All Items");
        System.out.println("3 -   View All Customer User");
        System.out.println("4 -   View All Inventory Clerk User"); /*
                                                                    * Once the View All user then show another menu with
                                                                    * CRUD Method.
                                                                    */
        System.out.println("5 -   View All Admin User");
        System.out.println("6 -   Add new Admin User");
        System.out.println("7 -   Update Admin User");
        System.out.println("8 -   Delete Admin User");
        System.out.println("");
        System.out.println("===========================");
        System.out.println("");
        System.out.print("Enter your choice: ");

        // this.userChoice();

        int i = s.nextInt();
        s.nextLine();
        this.setUserChoice(i);

        System.out.println("");
        System.out.println("===========================");
        System.out.println("");

        System.out.println("");

        // s.close(); // REMOVED THIS LINE

    }

    public void customerMenu() {
        Scanner s = new Scanner(System.in);

        System.out.println("=============================");
        System.out.println(" ");
        System.out.println("=============================");
        System.out.println(" ");
        System.out.println("========= Customer's Menu ========");
        System.out.println(" ");
        System.out.println("Choose the number of your choice.");
        System.out.println(" ");
        System.out.println("0 -   Log Out");
        System.out.println("1 -   View all Items");
        System.out.println("2 -   Add item to cart");
        System.out.println("3 -   Update an Item in cart");
        System.out.println("4 -   Delete an Item in cart");
        System.out.println("5 -   Open Cart");
        System.out.println("6 -   Check Out");
        System.out.println("");
        System.out.println("===========================");
        System.out.println("");
        System.out.print("Enter your choice: ");

        int i = s.nextInt();
        s.nextLine();

        this.setUserChoice(i);

        System.out.println("");
        System.out.println("===========================");
        System.out.println("");

        System.out.println("");

        // s.close(); // REMOVED THIS LINE

    }

    public void clerkMenu() {

        Scanner s = new Scanner(System.in);

        System.out.println("=============================");
        System.out.println(" ");
        System.out.println("=============================");
        System.out.println(" ");
        System.out.println("========= Inventory Clerk's Menu ========");
        System.out.println(" ");
        System.out.println("Choose the number of your choice.");
        System.out.println(" ");
        System.out.println("0 -   Log Out");
        System.out.println("1 -   View all Items");
        System.out.println("2 -   Add new Item");
        System.out.println("3 -   Update an Item");
        System.out.println("4 -   Delete an Item");
        System.out.println("");
        System.out.println("===========================");
        System.out.println("");
        System.out.print("Enter your choice: ");

        int i = s.nextInt();
        s.nextLine();

        this.setUserChoice(i);

        System.out.println("");
        System.out.println("===========================");
        System.out.println("");

        System.out.println("");

        // s.close(); // REMOVED THIS LINE

    }

    public void setUserChoice(int choice) {
        this.choice = choice;
    }

    public int getUserChoice() {
        return this.choice;
    }

    // public void userChoice() {
    // Scanner s = new Scanner(System.in);
    // this.choice = s.nextInt();
    // s.close(); // REMOVED THIS LINE
    // }

}
