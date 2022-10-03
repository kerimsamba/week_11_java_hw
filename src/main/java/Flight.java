import java.util.ArrayList;

public class Flight {

    private Pilot pilot;
    private ArrayList<CabinCrewMember> cabinCrew;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightnumber;
    private String destination;
    private String departureairport;
    private String departuredate;

    public Flight(Pilot pilot, Plane plane, String flightnumber, String destination, String departureairport, String departuredate) {
        this.pilot = pilot;
        this.cabinCrew = new ArrayList<CabinCrewMember>();
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightnumber = flightnumber;
        this.destination = destination;
        this.departureairport = departureairport;
        this.departuredate = departuredate;
    }

    public void addCabinCrew(CabinCrewMember cabinCrewMember) {
        this.cabinCrew.add(cabinCrewMember);
    }

    public void addPassenger(Passenger passenger){
        if (passengers.size() < plane.getCapacity()) this.passengers.add(passenger);
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightnumber = flightnumber;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureairport = departureairport;
    }

    public void setDepartureDate(String departureDate) {
        this.departuredate = departuredate;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public int getNumOfCabinCrew() {
        return cabinCrew.size();
    }

    public int getNumOfPassengers() {
        return passengers.size();
    }

    public int getAvailableSeats() {
        return plane.getCapacity() - passengers.size();
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightnumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureairport;
    }

    public String getDepartureDate() {
        return departuredate;
    }
}
