public class Apple extends  Fruits{
    private double gram;
    private Banana banana;

    public Apple(String taste, String sort, String color, double gram, Banana banana) {
        super(taste, sort, color);
        this.gram = gram;
        this.banana = banana;
    }

    public double getGram() {
        return gram;
    }

    public void setGram(double gram) {
        this.gram = gram;
    }

    public Banana getBanana() {
        return banana;
    }

    public void setBanana(Banana banana) {
        this.banana = banana;
    }
    @Override
    public String toString() {
        return "Orange{" +
                " taste: " + getTaste() +
                " sort: " + getSort() +
                " color: " + getColor() +
                " gram: " + gram +
                " banana: " + banana +
                '}';
    }
}
