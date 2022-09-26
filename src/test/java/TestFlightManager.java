import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestFlightManager {

    Flight flight;
    Pilot pilot;
    CabinCrewMember cabinCrewMember;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Plane plane;


    @Before
    public void before() {
        pilot = new Pilot("Biggles", Rank.Captain, "FE207");
        cabinCrewMember = new CabinCrewMember("Brian", Rank.FlightAttendant);
        ArrayList<CabinCrewMember> crew = new ArrayList<CabinCrewMember>();
        passenger1 = new Passenger("Frank", 3);
        passenger2 = new Passenger("Manfred", 1);
        passenger3 = new Passenger("Ann", 2);
        ArrayList<Passenger> passengers = new ArrayList<Passenger>();

        flight = new Flight(pilot,
                crew,
                passengers,
                Plane.Cessna172,
                "G32",
                "Mallorca",
                "Glasgow Airport",
                2022/09/25);

    }

//    @Test
//    public void baggageWeightRequired(){
//        assertEquals(15, passenger1.getPassengerTotalBaggageWeight());
//    }

    @Test
    public void baggageWeightForPassenger(){
        assertEquals(15, getTotalBagsWeight(passenger1));
    }

    @Test
    public void baggageWeightBooked(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
//        int weightBookedOn = getWeightOfBaggageBookedOnFlight(flight.passengers);
      int weightBookedOn = 20;

        assertEquals(20, weightBookedOn);
    }
}

//    calculate how much baggage weight should be reserved for each passenger for a flight
//    calculate how much baggage weight is booked by passengers of a flight
//    calculate how much overall weight reserved for baggage remains for a flight