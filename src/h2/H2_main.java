package h2;

import java.util.ArrayList;

public class H2_main {

    public static void main(String[] args) {

        Passenger p1 = new Passenger("Alessandro",2,true);
        Passenger p2 = new Passenger("Jiyan",1,true);

        // 1
        System.out.println(p1.getName().equals("Alessandro") && p1.getPlanned() == 2 && p1.isTicket() && p1.getVisited() == 0);
        // 2
        System.out.println(p1.getName().equals("Jiyan") && p2.getPlanned() == 1 && p2.isTicket() && p2.getVisited() == 0);      // p1????

        Bus bus = new Bus();

        // 3
        System.out.println(bus.passengers.equals(new ArrayList<Passenger>()));

        bus.enterBus(p1);

        // 4
        System.out.println(bus.passengers.get(0).getName().equals("Alessandro") && bus.passengers.get(0).isTicket() && bus.passengers.get(0).getVisited() == 0 && bus.passengers.get(0).getPlanned() == 2);

        bus.nextStop(new Passenger[] {p2});

        // 5
        System.out.println(p1.getVisited() == 1 && bus.passengers.get(1).getName().equals("Jiyan") && bus.passengers.get(1).getVisited() == 0);

        bus.nextStop();

        // 6
        System.out.println(p1.getVisited() == 2 && p2.getVisited() == 1);

        // Passenger p3 = new Passenger("X",1,false); Passenger p4 = new Passenger("Y",1,false); Passenger p5 = new Passenger("Z",1,false); bus.nextStop(new Passenger[] {p3,p4,p5}); bus.findPassengersWithoutTickets();

        // 7
        System.out.println(bus.passengers.size() == 0);     // For each - Delete (-5p)

        Bus bus2 = new Bus(); bus2.enterBus(new Passenger("A",1,true)); bus2.enterBus(new Passenger("B",1,true)); bus2.transferPassengers(bus, new String[] {"A","B"});

        // 8
        System.out.println(bus2.passengers.size() == 0 && bus.passengers.size() == 2);      // For each - Delete (-10p)

        bus.nextStop();

        // 9
        System.out.println(bus.passengers.size() == 0);     // For each - Delete (-10p)
    }

}
