public class Fruits {
private String taste;
private String sort;
private String color;

    public Fruits(String taste, String sort, String color) {
        this.taste = taste;
        this.sort = sort;
        this.color = color;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fruits{" +
                "taste: " + taste + '\'' +
                "sort: " + sort + '\'' +
                "color: " + color + '\'' +
                '}';
    }
}
