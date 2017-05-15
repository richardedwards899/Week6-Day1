class Bus {
  private int capacity;
  private Person[] passengers;

  public Bus(int capacity) {
    this.capacity = capacity;
    passengers = new Person[this.capacity];
  }

  public int getCapacity() {
    return capacity;
  }

  public int passengerCount() {
    int count = 0;
    for (Person passenger : passengers) {
      if (passenger != null) { 
        count++;
      }
    }
    return count;
  }

  public void addPassenger(Person person) {
    if (!busFull()) {
      passengers[passengerCount()] = person;
    }
  }

  private boolean busFull() {
    return passengerCount() == passengers.length;
  }
}