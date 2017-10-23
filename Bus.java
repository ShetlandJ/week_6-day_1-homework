class Bus{
  private int busNumber;
  private Person[] passengers;

  public Bus(int busNumber){
    this.busNumber = busNumber;
    this.passengers = new Person[5];
  }

  public int getBusNumber(){
    return this.busNumber;
  }

  public int getPassengerNumbers(){
    int counter = 0;
    for(Person person : passengers){
      if (person != null) {
        counter++;
      }
    }
    return counter;
  }

  public boolean isBusFull(){
    return getPassengerNumbers() == passengers.length;
  }

  public void addPassenger(Person passenger){
    if(!isBusFull());
    int getPassengerNumbers = getPassengerNumbers();
    this.passengers[getPassengerNumbers] = passenger;
  }

  public void removePassenger(Person passenger){
    for (int i = 0; i < this.passengers.length; i++){
      if (passengers[i] == passenger){
        passengers[i] = null;
      }
    }
  }

  public void collect(BusStop busStop, Person person){
    if(!isBusFull() && !busStop.isBusStopEmpty()){
      int counter = getPassengerNumbers();
      this.passengers[counter] = person;
    }
  }

}
