


class DepartureEvent extends Event {
  private Customer customer;
 


 public DepartureEvent(Customer customer, double time) {
  super(time);
  this.customer = customer;
  
 }


@Override
public String toString() {
   String str = "";

   str = String.format(": Customer %d departed", customer.getCustomerId());
  
   return super.toString() + str;
}

@Override
public Event[] simulate() {

  return new Event[] {};

}

}
