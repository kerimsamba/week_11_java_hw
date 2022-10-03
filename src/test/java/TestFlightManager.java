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
                Plane.Cessna172,
                "G32",
                "Mallorca",
                "Glasgow",
                "01/11/2022");

    }

    @Test
    public void baggageWeightRequired() {
        assertEquals(15, passenger1.getPassengerTotalBaggageWeight());
    }

}