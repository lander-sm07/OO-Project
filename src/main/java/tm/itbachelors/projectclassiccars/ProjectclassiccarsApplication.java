// Name: Lander Smits
// Class: 1ITF05
// Student-number: r1093338

package tm.itbachelors.projectclassiccars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tm.itbachelors.projectclassiccars.model.Car;
import tm.itbachelors.projectclassiccars.model.Owner;
import tm.itbachelors.projectclassiccars.model.Staff;

import java.util.ArrayList;

@SpringBootApplication
public class ProjectclassiccarsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectclassiccarsApplication.class, args);
	
	System.out.println("\n-- PART 1 --");
		/* Create all the owners */
		Owner owner1 = new Owner("Lander", "Smits");
		owner1.setNationality("BE");
		owner1.addToWishList("BMW M3");
		owner1.addToWishList("Porsche GT3");

		Owner owner2 = new Owner("Mathieu", "Van der Poel");
		owner2.setNationality("NL");
		owner2.addToWishList("Audi R8");
		owner2.addToWishList("Mercedes SL");
		owner2.addToWishList("Ford Mustang");
		owner2.addToWishList("Ferrari F40");
		owner2.addToWishList("Lamborghini Diablo");

		Owner owner3 = new Owner("Carlos", "Rodriguez");
		owner3.setNationality("ES");
		owner3.addToWishList("Seat Ibiza");
		owner3.addToWishList("Renault Clio");
		owner3.addToWishList("Volkswagen Golf");

		Owner owner4 = new Owner("Tadej", "Pogacar");
		owner4.addToWishList("Bugatti Chiron");

		/* ADD Owners to list */
		ArrayList<Owner> ownerList = new ArrayList<>();
		ownerList.add(owner1);
		ownerList.add(owner2);
		ownerList.add(owner3);
		ownerList.add(owner4);

		/* Print Owners & Their wishlist */
		int counter = 1;

		for (Owner owner: ownerList) {
			// info about owner
			System.out.println("Information about owner " + counter);
			System.out.println(owner);

			// shows wishlist
			System.out.println("Wish list of " + owner.getFirstName() + ":");
			for (String wish : owner.getWishList()) {
				System.out.println("- " + wish);
			}

			System.out.println();
			counter++;
		}

	System.out.println("\n-- PART 2 --");
		Staff staff1 = new Staff("Wout", "Van Aert");
		staff1.setSenior(true);
		Staff staff2 = new Staff("Remco", "Evenepoel");
		Staff staff3 = new Staff("Primoz", "Roglic");

		System.out.println(staff1 + (staff1.isSenior() ? " *" : ""));
		System.out.println(staff2 + (staff2.isSenior() ? " *" : ""));
		System.out.println(staff3 + (staff3.isSenior() ? " *" : ""));

	System.out.println("\n-- PART 3 --");
		Car car1 = new Car("Porsche", "911");


	System.out.println("\n-- PART 4 --");
	// Write your code part 4 here

	System.out.println("\nThe end ...");
        System.exit(0);

    }

}
