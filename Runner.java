class Runner {
  
  public static void main(String[] args) {
    Person[] queue = new Person[10];
    Person person1 = new Person("Jack");
    Person person2 = new Person("Jill");
    Person person3 = new Person("Nancy");
    Person person4 = new Person("Phillip");
    Person person5 = new Person("Newbury");
    Person person6 = new Person("Monty");

    Bus bus = new Bus(20);
    BusStop stop = new BusStop(queue);

    stop.join(person1);
    stop.join(person2);
    stop.join(person3);
    stop.join(person4);
    stop.join(person5);
    stop.join(person6);

    bus.addPassenger(stop.removeFromQueue(person1));
    bus.addPassenger(stop.removeFromQueue(person4));
    bus.addPassenger(stop.removeFromQueue(person6));

    System.out.println("Passengers on bus: "+bus.passengerCount());
    System.out.println("People remaining at stop: "+stop.peopleWaiting());
  }
}