class BusStop{
  private String name;
  private Person[] queuers;

  public BusStop(String name){
    this.name = name;
    this.queuers = new Person[5];
  }

  public String getBusStopName(){
    return this.name;
  }

  public int getBusStopQueueNumbers(){
    int counter = 0;
    for(Person person : queuers){
      if (person != null) {
        counter++;
      }
    }
    return counter;
  }

  public void addQueuer(Person queuers){
    this.queuers[getBusStopQueueNumbers()] = queuers;
  }

  public void removeAllQueuer(){
    for(int i=0; i < this.queuers.length; i++){
      this.queuers[i] = null;
    }

  }
  public boolean isBusStopEmpty(){
    if (getBusStopQueueNumbers() == 0);
    return true;
  }
}
