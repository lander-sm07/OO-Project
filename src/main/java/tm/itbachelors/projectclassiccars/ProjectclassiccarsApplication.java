// Name: Lander Smits
// Class: 1ITF05
// Student-number: r1093338

package tm.itbachelors.projectclassiccars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tm.itbachelors.projectclassiccars.model.Car;
import tm.itbachelors.projectclassiccars.model.Maintenance;
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
			System.out.println("Information owner " + counter);
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
		/* Create car1 */
		Car car1 = new Car("Porsche", "911");
		car1.setKilometers(75000);
		car1.registerOwner(owner1);

		/* Create maintenances */
		Maintenance maintenance1 = new Maintenance("Oil change", 60);
		maintenance1.setHourlyRate(40);
		maintenance1.setResponsible(staff1);

		Maintenance maintenance2 = new Maintenance("Brake check", 15);
		maintenance2.setHourlyRate(20);
		maintenance2.setResponsible(staff2);

		Maintenance maintenance3 = new Maintenance("Tire replacement", 30);
		maintenance3.setHourlyRate(30);
		maintenance3.setResponsible(staff3);

		/* Add maintenances to car1 */
		car1.addMaintenance(maintenance1);
		car1.addMaintenance(maintenance2);
		car1.addMaintenance(maintenance3);



		/* Create car2 */
		Car car2 = new Car("BMW", "M4");
		car2.setKilometers(25000);
		car2.registerOwner(owner3);

		/* Create maintenances */
		Maintenance maintenance4 = new Maintenance("Battery replacement", 70);
		maintenance4.setHourlyRate(50);
		maintenance4.setResponsible(staff1);

		Maintenance maintenance5 = new Maintenance("Engine check", 35);
		maintenance5.setHourlyRate(30);
		maintenance5.setResponsible(staff3);

		/* Add maintenances to car2 */
		car2.addMaintenance(maintenance4);
		car2.addMaintenance(maintenance5);



		/* Add the cars to a list */
		ArrayList<Car> carList = new ArrayList<>();
		carList.add(car1);
		carList.add(car2);


		/* Print statements */
			/* Info about car */
		for (Car car : carList) {
			System.out.println("** " + car.getName() + " **");
			System.out.println("This car has " + car.getNumberOfMaintenances() + " number of maintenances");

			/* Print maintenances + Total cost */
			double totalCost = 0;
			for (Maintenance maintenance : car.getMaintenances()) {
				System.out.println("- " + maintenance.getType()
						+ ", duration: " + maintenance.getDuration() + " minutes"
						+ ", rate: " + maintenance.getHourlyRate()
						+ ", price: " + maintenance.getPrice()
						+ " (Done by: " + maintenance.getResponsible() + ")");
				totalCost += maintenance.getPrice();
			}

			System.out.println("Total cost: " + totalCost);
			System.out.println();
		}








	System.out.println("\n-- PART 4 --");
	// Write your code part 4 here

	System.out.println("\nThe end ...");
        System.exit(0);

    }

}
