import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class PersonTest {
  Person james;

  @Before
  public void before(){
    james = new Person("James");
  }

  @Test
  public void hasName(){
    assertEquals("James", james.getName());
  }
}
