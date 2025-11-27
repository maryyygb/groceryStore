import java.util.*;

public class SignIn {
	Auth a = new Auth();
	
	private int i;
	Scanner s;

	public SignIn() {
	      s = new Scanner(System.in);

		System.out.println("Please choose your Role.");
		System.out.println(" - Type 1 for Admin.");
		System.out.println(" - Type 2 for Customer.");
		System.out.println(" - Type 3 for Inventory Clerk");
		System.out.println("");
		System.out.print("Your choice is: ");

		i = s.nextInt();
		
		a.setIdRole(i);
		
		int checkIdRole = a.getIdRole();
		

		System.out.println(checkIdRole);
		
	      while (true) {

			if (checkIdRole == 1) {
				a.setRole("Admin");
				break;
			} else if (checkIdRole == 2) {
				a.setRole("Customer");
				break;
			} else if (checkIdRole == 3) {
			      a.setRole("Clerk");
			      break;
			} else {
				System.out.println("");
				System.out.println("Your input is invalid. Please try again.");
				System.out.println("");
				System.out.print("Enter your choice again: ");
				i = s.nextInt();
				System.out.println(" ");
			}
		}
		
	}

	/*public String getRole() {
		return this.role;
	}
	
	public int getIdRole() {
	      return this.idRole;
	}*/
}