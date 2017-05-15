import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PersonTest {

  @Test
  public void hasName() {
    Person person = new Person("Dave");
    assertEquals("Dave", person.getName());
  }
}