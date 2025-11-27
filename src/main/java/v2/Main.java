package v2;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        SignIn sign = new SignIn();

        System.out.println("==================================================");
        System.out.println("========== WELCOME TO OUR GROCERY STORE ==========");
        System.out.println("==================================================");
        System.out.println("");
        System.out.println("===== To proceed please select a role first. =====");
        System.out.println("");

        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("      1 - Admin Role");
            System.out.println("      2 - Customer Role");
            System.out.println("      3 - Inventory Clerk Role");
            System.out.println("==================================================");
            System.out.println("==================================================");
            System.out.println("");
            System.out.print("Your choice is: ");
            int id = s.nextInt();
            s.nextLine();

            sign.setIdRole(id);
            System.out.println("");
            System.out.println("==================================================");

            if (id == 1) {
                sign.setRole("Admin");
                break;
            } else if (id == 2) {
                sign.setRole("Customer");
                break;
            } else if (id == 3) {
                sign.setRole("Clerk");
                break;
            } else {
                System.out.println("");

                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                System.out.println("WARNING! Invalid input. Please try again.");
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

                System.out.println("");
            }
        }

        s.close();

    }
}
