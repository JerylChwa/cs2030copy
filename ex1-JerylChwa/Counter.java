//Counter composites shop, service begin event, service done event


class Counter {


  private int counter_id;
  private boolean avail = true;
  private int customerId;
  
  public Counter(int counterId) {
    this.counter_id = counterId;
    this.avail = avail;


  }
  public void Occupy() {
    this.avail = false;
}
  public void Clear() {
    this.avail = true;
  }
  public boolean Avail() {
    return this.avail;

}

  public int getCounterId() {
    return this.counter_id;
  }
}

