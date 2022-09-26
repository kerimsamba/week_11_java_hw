public enum Plane {

    Boeing747(10, 20),
    Cessna172(2,4);

    private final int capacity;
    private final int total;

    Plane(int capacity, int total) {
        this.capacity = capacity;
        this.total = total;
    }

    public int getCapacity() {
        return capacity;
    }


}
