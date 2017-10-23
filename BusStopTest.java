import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class BusStopTest {
  BusStop busStop;
  Person person;
  Bus bus;

  @Before
  public void before(){
    person = new Person("James");
    busStop = new BusStop("Buchanan Bus Station");
    bus = new Bus(42);
  }

  @Test
  public void hasName(){
    assertEquals("Buchanan Bus Station", busStop.getBusStopName());
  }

  @Test
  public void busCount(){
    assertEquals(0, busStop.getBusStopQueueNumbers());
  }

  @Test
  public void addPassenger(){
    busStop.addQueuer(person);
    assertEquals(1, busStop.getBusStopQueueNumbers());
  }

  @Test
  public void removePassenger(){
    busStop.addQueuer(person);
    busStop.removeAllQueuer();
    assertEquals(0, busStop.getBusStopQueueNumbers());
  }

  @Test public void isBusStopEmpty(){
    BusStop busStop2 = new BusStop("Whatever");
    assertEquals(true, busStop2.isBusStopEmpty());
  }
}
