//ServiceDoneEvent inherits from ShopEvent


class ServiceDoneEvent extends Event{
  
  private Counter counter;
  private Customer customer;

  public ServiceDoneEvent(double time, Counter counter, Customer customer) {
    
    super(time);
    this.counter = counter;
    this.customer = customer;


  }

  @Override
  public String toString() {
    String str = "";

    str = String.format(": Customer %d service done (by Counter %d)",
           customer.getCustomerId(), counter.getCounterId());
    return super.toString() + str;
  }

  @Override
  public Event[] simulate() {
    counter.Clear();
      return new Event[] {
        new DepartureEvent(this.customer, this.getTime())};



  }




  }


