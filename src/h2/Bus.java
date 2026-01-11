package h2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bus {

    public ArrayList<Passenger> passengers;

    public Bus(){
        this.passengers = new ArrayList<>();
    }

    public void enterBus(Passenger p){
        passengers.add(p);
        //System.out.println(p.getName() + " ist dem Bus für " + p.getPlanned() + " Station(en) zugestiegen!");
    }

    public void exitBus(){
        for (Passenger passenger : passengers){
            if (passenger.getPlanned() == passenger.getVisited()){
                passengers.remove(passenger);
                //System.out.println(passenger.getName() + " hat den Bus nach " + passenger.getPlanned() + " Station(en) verlassen!");
            }
        }
    }

    public void nextStop(Passenger[] boarding){
        for(Passenger passenger : passengers){
            passenger.setVisited(passenger.getVisited() + 1);
        }
        exitBus();
        for(Passenger passenger : boarding){
            enterBus(passenger);
        }
    }

    public void nextStop(){
        for(Passenger passenger : passengers){
            passenger.setVisited(passenger.getVisited() + 1);
        }
        exitBus();
    }

    public ArrayList<Passenger> findPassengersWithoutTickets(){
        ArrayList<Passenger> removedPassengers = new ArrayList<>();
        for(Passenger passenger : passengers){
            if(!passenger.isTicket()){
                removedPassengers.add(passenger);
                passengers.remove(passenger);
            }
        }
        return removedPassengers;
    }

    public void transferPassengers(Bus otherBus, String[] passengerNames){
        List<String> passengerNamesList = new ArrayList<>(Arrays.stream(passengerNames).toList());
        //System.out.println(passengerNamesList);
        //System.out.println(passengers.toString());
        for(Passenger passenger : passengers){
            //System.out.println(passenger.getName());
            if(passengerNamesList.contains(passenger.getName())){
                otherBus.enterBus(passenger);
                passengers.remove(passenger);   // !!! Keine Veränderung an den Objekten in for each
            }
        }
    }

}
