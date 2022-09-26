public class CabinCrewMember {

    private String name;
    private Rank rank;

    public CabinCrewMember(String name, Rank rank) {
        this.name = name;
        this.rank = rank;
    }


    public void setCabinCrewMember(String name, Rank rank) {
        this.name = name;
        this.rank = rank;

    }

    public String getName() {
        return name;
    }

    public Rank getRank() {
        return rank;
    }

    public String relayMessage(CabinCrewMember cabinCrewMember){
        return "This is " + this.name + ", your " + this.rank + ", please fasten your seat belts";
    }


}

