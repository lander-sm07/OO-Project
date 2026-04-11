package tm.itbachelors.projectclassiccars;

import com.sun.tools.javac.Main;
import tm.itbachelors.projectclassiccars.model.Maintenance;
import tm.itbachelors.projectclassiccars.model.Staff;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest
public class MaintenanceTests {

    /**
     * Test of constructor en getters
     */
    @Test
    public void testConstructorEnGetters() {
        Maintenance maintenance1 = new Maintenance();
        assertNull(maintenance1.getType());
        assertEquals(0,maintenance1.getDuration());
        assertEquals(0.0, maintenance1.getHourlyRate());
        assertNull(maintenance1.getResponsible());

        Maintenance maintenance2 = new Maintenance("Engine repair");
        assertEquals("Engine repair", maintenance2.getType());
        assertEquals(0,maintenance2.getDuration());
        assertEquals(0.0, maintenance2.getHourlyRate());
        assertNull(maintenance2.getResponsible());

        Maintenance maintenance3 = new Maintenance("Inspection", 10);
        assertEquals("Inspection", maintenance3.getType());
        assertEquals(10,maintenance3.getDuration());
        assertEquals(0.0, maintenance3.getHourlyRate());
        assertNull(maintenance3.getResponsible());
    }

    /**
     * Test of setType method, of class Maintenance.
     */
    @Test
    public void testSetType() {
        Maintenance maintenance1 = new Maintenance();
        maintenance1.setType("Inspection");
        assertEquals("Inspection", maintenance1.getType());
    }

    /**
     * Test of setDuration, of class Maintenance.
     */
    @Test
    public void testSetDuration() {
        Maintenance maintenance1 = new Maintenance();
        maintenance1.setDuration(25);
        assertEquals(25, maintenance1.getDuration());
    }

    /**
     * Test of setHourlyRate, of class Maintenance.
     */
    @Test
    public void setHourlyRate() {
        Maintenance maintenance1 = new Maintenance();
        maintenance1.setHourlyRate(12.55);
        assertEquals(12.55, maintenance1.getHourlyRate());
    }

    /**
     * Test of setResponsible method, of class Maintenance.
     */
    @Test
    public void testResponsible() {
        Maintenance maintenance1 = new Maintenance();
        Staff Manager1 = new Staff("Alex", "Mathews");
        maintenance1.setResponsible(Manager1);
        assertEquals(Manager1, maintenance1.getResponsible());
    }


    /*
    * Test of getPrice method, of class Maintenance.
    */
    @Test
    public void testGetPrice() {
        Maintenance maintenance1 = new Maintenance();
        maintenance1.setDuration(14);
        maintenance1.setHourlyRate(10.50);
        assertEquals(14,maintenance1.getDuration());
        assertEquals(10.50, maintenance1.getHourlyRate());
        assertEquals(2.45,maintenance1.getPrice());
    }
}
