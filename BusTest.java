import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class BusTest {
  Bus theBus;
  Person person;
  BusStop busStop;

  @Before
  public void before(){
    person = new Person("James");
    theBus = new Bus(42);
    busStop = new BusStop("Buchanan Street Station");
  }

  @Test
  public void hasBusNumber(){
    assertEquals(42, theBus.getBusNumber());
  }

  @Test
  public void checkBusIsEmpty(){
    assertEquals(0, theBus.getPassengerNumbers());
  }

  @Test
  public void isBusFull(){
    for(int i = 0; i < 5; i++) {
      theBus.addPassenger(person);
    }
    assertEquals(true, theBus.isBusFull());
  }

  @Test
  public void canAddPassenger(){
    theBus.addPassenger(person);
    assertEquals(1, theBus.getPassengerNumbers());
  }

  @Test
  public void canRemovePassenger(){
    theBus.addPassenger(person);
    theBus.removePassenger(person);
    assertEquals(0, theBus.getPassengerNumbers());
  }

  @Test
  public void canCollect(){
    new_stop = busStop.addQueuer(person);
    assertEquals(1, theBus.collect(new_stop, person));
  }

}
