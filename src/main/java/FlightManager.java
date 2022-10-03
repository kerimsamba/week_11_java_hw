import java.util.ArrayList;

public class FlightManager {

    // all passenger bags assumed to weigh 5kg

    public int getTotalBagsWeight(Passenger passenger){
        return passenger.getNumOfBags() * 5;
    }


}
