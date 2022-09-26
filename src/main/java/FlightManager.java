import java.util.ArrayList;

public class FlightManager {

    // all passenger bags assumed to weigh 5kg

    public int getTotalBagsWeight(Passenger passenger){
        return passenger.getNumOfBags() * 5;
    }

//    public int getWeightOfBaggageBookedOnFlight(ArrayList<Passenger> passengers){
//        int baggageWeightBooked = 0;
//        for (Passenger passenger: passengers){
//            baggageWeightBooked += passenger.getPassengerTotalBaggageWeight();
//        }
//        return baggageWeightBooked;
//    }
}
