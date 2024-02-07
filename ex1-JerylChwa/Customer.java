
//Customer composites in arrivalevent, service done event, departure event, service begin event
//
//

public class Customer {


  private int customerId;
  private double ARRIVALtime;
  private double SERVICEtime;

  public Customer(int id, double arrival, double service) {
      this.customerId = id;
      this.ARRIVALtime = arrival;
      this.SERVICEtime = service;
  }


  public int getCustomerId() {
    return this.customerId;
  }

  public double getArrivalTime() {
    return this.ARRIVALtime;
  }
  public double getServiceTime(){
    return this.SERVICEtime;
  }


  public double getEndTime() {
    return this.SERVICEtime + this.ARRIVALtime;
  }

  




}

