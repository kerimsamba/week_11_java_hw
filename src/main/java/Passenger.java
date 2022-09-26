public class Passenger {
    private String name;
    private int numOfBags;

    public Passenger(String name, int numOfBags) {
        this.name = name;
        this.numOfBags = numOfBags;
    }

    public String getName() {
        return name;
    }

    public int getNumOfBags() {
        return numOfBags;
    }

    public int getPassengerTotalBaggageWeight(){
        return numOfBags * 5;
    }

    public void setPassenger(String name, Integer numOfBags) {
        this.name = name;
        this.numOfBags = numOfBags;

    }

}



