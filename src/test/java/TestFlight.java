import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestFlight {

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
                LocalDate.of(2022, 9,25));

    }

    @Test
    public void checkSeatsAvailable() {
        assertEquals(2, flight.getAvailableSeats());
    }

    @Test
    public void canBoardPassenger() {
        flight.addPassenger(passenger1);
        assertEquals(1, flight.getNumOfPassengers());
    }

    @Test
    public void cannotBoardPassengerIfPlaneFull() {
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        assertEquals(2, flight.getNumOfPassengers());
    }

    @Test
    public void canAddCabinCrew() {
        flight.addCabinCrew(cabinCrewMember);
        assertEquals(1, flight.getNumOfCabinCrew());
    }

}

