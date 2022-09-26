public class Pilot {

    private String name;
    private Rank rank;
    private String license;

    public Pilot(String name, Rank rank, String license) {
        this.name = name;
        this.rank = rank;
        this.license = license;
    }

    public void setName(String name, Rank rank, String license) {
        this.name = name;
        this.rank = rank;
        this.license = license;
    }

    public String getName() {
        return name;
    }

    public Rank getRank() {
        return rank;
    }

    public String getLicense() {
        return license;
    }

    public String flyPlane(Pilot pilot) {
        return "This is " + pilot.name + ", your " + pilot.rank + " speaking - up, up and away!";
    }
}
