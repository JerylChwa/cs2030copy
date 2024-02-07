//ArrivalEvent inherits from ShopEvent


class ArrivalEvent extends Event {
    
  private Counter[] counterArray;
  private Customer customer;
  


  public ArrivalEvent(Counter[] counters, Customer customer, double time) {
     super(time);
     this.counterArray = counters;
     this.customer = customer;
     

  }


 @Override
  public String toString() {
      String str = "";
      
      str = String.format(": Customer %d arrives", customer.getCustomerId());

      return super.toString() + str;
}

  @Override
  public Event[] simulate() {
      // The current event is an arrival event.
      // Find the first available counter.
      for (int i = 0; i < counterArray.length; i += 1) {
        if (counterArray[i].Avail()) {
          counterArray[i].Occupy();
          return new Event[] {
            new ServiceBeginEvent(counterArray[i], this.customer, this.getTime())};
          
        }
      }

      return new Event[] {
          new DepartureEvent(this.customer, this.getTime())};
      


      }
  }


