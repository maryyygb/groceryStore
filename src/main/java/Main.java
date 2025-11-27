public class Main {

	public static void main(String[] args) {

		Auth a = new Auth();

		Menu menu = new Menu();

		// GREETINGS
		System.out.println("===== Welcome to an Online Grocery Store! =====");
		System.out.println("");

		System.out.println("To proceed, you are required to Sign in.");
		
		new SignIn();

            String role = a.getRole();
            int idRole = a.getIdRole();
            
            System.out.println(role);
            System.out.println(idRole);

		// START
		if (role.equals("Admin") || a.getIdRole() == 1) {

			System.out.println("");
			System.out.println("");
			System.out.println("");

			// ADMIN ACCESS
			System.out.println("Note: Only Admin is allowed to sign in here.");
			System.out.println("");

			// Calling the Admin Sign In Method in the Auth Class
			a.adminSignIn();

			System.out.println("=============================");
			System.out.println(" ");
			System.out.println("Welcome back, " + a.getName().toUpperCase() + "!");
			System.out.println(" ");

			if (a.connect()) {
				menu.adminMenu();
			};

		} else if (role.equals("Customer") || a.getIdRole() == 2) {

			// CUSTOMER ACCESS

			System.out.println("");
			System.out.println("");
			System.out.println("");

			// Calling the Customer Sign In Method in the Auth Class
			a.customerSignIn();

			System.out.println("=============================");
			System.out.println(" ");
			System.out.println("Welcome back, " + a.getName().toUpperCase() + "!");
			System.out.println(" ");

			if (a.connect()) {
				menu.customerMenu();
			};


			// INVENTORY CLERK ACCESS
			System.out.println("");

		} else if (role.equals("Clerk") || a.getIdRole() == 3) {

			// INVENTOR CLERK ACCESS

			System.out.println("");
			System.out.println("");
			System.out.println("");

			// Calling the Inventory Clerk Sign In Method in the Auth Class
			a.clerkSignIn();

			System.out.println("=============================");
			System.out.println(" ");
			System.out.println("Welcome back, " + a.getName().toUpperCase() + "!");
			System.out.println(" ");

			if (a.connect()) {
				menu.clerkMenu();
			};

		} else {
			System.out.println("Invlaid Input!");
		}

	}
}