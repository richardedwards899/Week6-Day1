import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusStopTest {
  private Person[] queue;
  private BusStop stop;
  private Bus bus;
  private Person person1 = new Person("Dave");
  private Person person2 = new Person("Bertie");
  private Person person3 = new Person("Carol");

  @Before
  public void before() {
    queue = new Person[10];
    queue[0] = person1;
    queue[1] = person2;
    queue[2] = person3;
    stop = new BusStop(queue);
    bus = new Bus(20);
  }

  @Test
  public void hasQueue() {
    assertEquals(3, stop.peopleWaiting());
  }

  @Test
  public void addPersonToQueue() {
    Person person = new Person("Richard");
    stop.join(person);
    assertEquals(4, stop.peopleWaiting());
  }

  @Test 
  public void removePersonFromQueue() {
    Person person = stop.removeFromQueue(person1);
    assertEquals(2, stop.peopleWaiting());
    assertEquals("Dave", person.getName());
  }
}