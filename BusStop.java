class BusStop {

  private Person[] queue;

  public BusStop(Person[] queue){
    this.queue = queue;
  }

  public int peopleWaiting() {
    int counter = 0;
    for (Person person : queue) {
      if (person != null) { 
        counter++;
      }
    }
    return counter;
  }

  /* Must join where we find a null!*/
  public void join(Person person) {
    if (peopleWaiting() < queue.length) {
      for (int i = 0; i<queue.length; i++) {
        if (queue[i] == null) {
          queue[i] = person;
          return;
        }
      }
    }
  }

  public Person removeFromQueue(Person person) {
    Person leaver = null;
    for (int i = 0; i < queue.length; i++) {
      if (queue[i] == person) {
        leaver = queue[i];
        queue[i] = null;
      }
    }
    return leaver; 
  }
}