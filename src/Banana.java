public class Banana {
    private String vitamin;

    public Banana(String vitamin) {
        this.vitamin = vitamin;
    }

    public String getVitamin() {
        return vitamin;
    }

    public void setVitamin(String vitamin) {
        this.vitamin = vitamin;
    }

    @Override
    public String toString() {
        return "Banana{" +
                "vitamin='" + vitamin + '\'' +
                '}';
    }
}
