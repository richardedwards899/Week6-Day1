import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusTest {
  private Bus bus;

  @Before
  public void before() {
    bus = new Bus(20);
  }

  @Test
  public void canCreateBus() {
    assertEquals(20, bus.getCapacity());
    assertEquals(0, bus.passengerCount());
  }

  @Test
  public void canAdd() {
    Person person = new Person("Rachel");
    bus.addPassenger(person);
    assertEquals(1, bus.passengerCount());
  }
}