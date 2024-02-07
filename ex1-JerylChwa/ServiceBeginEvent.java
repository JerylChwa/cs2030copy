

class ServiceBeginEvent extends Event {

  private Counter counter;
  private Customer customer;
  
  public ServiceBeginEvent(Counter counter, Customer customer, double time) {
     super(time);
     this.counter = counter;
     this.customer = customer;
    

  }

  @Override
  public String toString() {  
    String str = "";

    str = String.format(": Customer %d service begin (by Counter %d)",
          customer.getCustomerId(), counter.getCounterId());
    return super.toString() + str;
  }

  @Override
  public Event[] simulate() {

    double endTime = customer.getEndTime();

    return new Event[] {

    new ServiceDoneEvent(endTime, this.counter, this.customer)};
    


  }


}
