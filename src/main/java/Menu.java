import java.util.*;

public class Menu extends MenusActions {

	MenusActions menu = new MenusActions();
	//MenuChoiceChecker mcc = new MenuChoiceChecker();
	
	SignIn sign = new SignIn();

	private int choice;

	private boolean logout;

	public Menu() {

		this.logout = false;
	}

	public void adminMenu() {

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
		System.out.println("4 -   View All Inventory Clerk User"); /*Once the View All user then show another menu with CRUD Method.*/
		System.out.println("5 -   View All Admin User");
		System.out.println("6 -   Add new Admin User");
		System.out.println("7 -   Update Admin User");
		System.out.println("8 -   Delete Admin User");
		System.out.println("");
		System.out.println("===========================");
		System.out.println("");
		System.out.print("Enter your choice: ");


		this.userChoice();
		System.out.println("");
		System.out.println("===========================");
		System.out.println("");

		this.adminChoiceChecker();
		System.out.println("");


	}

	public void customerMenu() {

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


		this.userChoice();
		System.out.println("");
		System.out.println("===========================");
		System.out.println("");

		this.adminChoiceChecker();
		System.out.println("");

	}

	public void clerkMenu() {

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


		this.userChoice();
		System.out.println("");
		System.out.println("===========================");
		System.out.println("");

		this.adminChoiceChecker();
		System.out.println("");

	}

	public void userChoice() {
		Scanner s = new Scanner(System.in);
		this.choice = s.nextInt();
		s.close();
	}

	public void adminChoiceChecker() {

		if(this.choice == 0) {
		      new SignIn();
		} else if (this.choice == 1) {
		      menu.addGroceryItem();
		this.adminMenu();
		} else if (this.choice == 2) {
		      menu.viewAllItems();
		this.adminMenu();
		}

	/*	if (this.choice == 0) {
			this.logout = true;
		} else {
			this.logout = false;
		}*/

	}

	public boolean isLogout() {
		return this.logout;
	}
}


/*System.out.println("0 -   Log Out");
System.out.println("1 -   Add Grocery Item");
System.out.println("2 -   View All Items");
System.out.println("3 -   View All Customer User");
System.out.println("4 -   View All Inventory Clerk User");
System.out.println("5 -   View All Admin User");
System.out.println("6 -   Add new Admin User");
System.out.println("7 -   Update Admin User");
System.out.println("8 -   Delete Admin User");*/

/* if (this.choice == 0) {
	new Main();
} else {

	switch (this.choice) {
	case 1:
		menu.addGroceryItem();
		this.adminMenu();
		break;
	case 2:
		menu.viewAllItems();
		this.adminMenu();
		break;
	case 3:
	            menu.viewAllCustomerUsers();
	            break;
	case 4:
	            menu.viewAllClerkUsers();
	            break;
	case 5:
	            menu.viewAllAdminUser();
	            break;
	case 6:
	            menu.addNewAdminUser();
	            break;
	case 8:
	            menu.updateAdminUser();
	            break;
	case 9:
	            menu.deleteAdminUser();
	            break;
	default:
		System.out.println("Invalid Input.");
		break;
	}
}*/


//	public void customerChoiceChecker() {

/*System.out.println("0 -   Log Out");
System.out.println("1 -   View all Items");
System.out.println("2 -   Add item to cart");
System.out.println("3 -   Update an Item in cart");
System.out.println("4 -   Delete an Item in cart");
System.out.println("5 -   Open Cart");
System.out.println("6 -   Check Out");

if (this.choice == 0) {
	this.logout = true;
} else {
          this.logout = false;
}
	switch (this.choice) {
		case 1:
    				menu.viewAllItems();
    				this.customerMenu();
    				break;
		case 2:
		            menu.addToCart();
		            this.customerMenu();
		            break;
		case 3:
		            menu.updateItemCart();
		            break;
		case 4:
		            menu.deleteItemCart();
		            break;
		case 5:
		            menu.openCart();
		            break;
		case 6:
		            menu.checkOut();
		            break;
		case 7:
		            addAdminUser();
		            break;
		default:
		            System.out.println("Invalid Input.");
		            break;
}


}*/


// CLERK MENU
//public void clerkChoiceChecker() {

/*System.out.println("0 -   Log Out");
System.out.println("1 -   View all Items");
System.out.println("2 -   Add new Item");
System.out.println("3 -   Update an Item");
System.out.println("4 -   Delete an Item");*/

/*if (this.choice == 0) {
	new Main();
} else {

	switch (this.choice) {
	case 1:
		menu.viewAllItems();
		this.clerkMenu();
		break;
	case 2:
		menu.addGroceryItem();
		this.clerkMenu();
		break;
		/*case 3:
		            menu.updateItem();
		            break;
		case 4:
		            menu.deleteItem();
		            break;
		default:
		            System.out.println("Invalid Input.");
		            break;
	}
}*/
//	}

/*	public void runner() {
		int currentRoleId = 0;

		while (true) {

			// if signed out (role 0), will be redirected to sign in again
			if (currentRoleId == 0) {
				currentRoleId = sign.signing();

				while (currentRoleId < 1 || currentRoleId > 3) {
					System.out.println("Invalid role choice. Please try again.");
					currentRoleId = sign.signing();
				}
			}

		}

		// Inner loop: Manages the specific menu session like stay in Admin menu until logout
		boolean stayInMenu = true;
		while (stayInMenu) {
			if (currentRoleId == 1) {
				this.adminMenu();
			} else if (currentRoleId == 2) {
				this.customerMenu();
			} else if (currentRoleId == 3) {
				this.clerkMenu();
			}

			// If stayInMenu becomes false (user chose '0' Log Out),
			// the inner loop breaks, setting us up to re-enter the sign-in prompt
			// in the next iteration of the OUTER while(true) loop, because
			// we should reset the role ID here:
			if (!stayInMenu) {
				currentRoleId = 0; // Reset role so the sign-in prompt shows next
			}

		}


	}
	*/


//}