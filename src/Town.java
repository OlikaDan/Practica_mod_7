public abstract class Town {

    private String type;
    private String title;

    public Town(String type, String title) {
        this.type = type;
        this.title = title;
    }

    public String getInfoObj() {
        return "The title of this " + this.type + " is " + this.title;
    }
}
