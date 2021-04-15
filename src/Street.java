public class Street extends Town {
    private int numberHouse;
    private final House house = new House();

    public Street(String title) {
        super("street", title);
    }

    public House getHouse() {
        System.out.println("There are houses on the street");
        return house;
    }

    public class House {
        public void setNumber(int numberHouse) {
            Street.this.numberHouse = numberHouse;
            System.out.println("We are now near the house number " + numberHouse);
        }
    }
}
