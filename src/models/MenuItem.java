package models;

public class MenuItem {
    private long id;
    private String name;
    private double price;
    private int preperationTime;

    public MenuItem() {
    }

    public MenuItem(long id,String name, double price, int preperationTime) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.preperationTime = preperationTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPreperationTime() {
        return preperationTime;
    }

    public void setPreperationTime(int preperationTime) {
        this.preperationTime = preperationTime;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", preperationTime=" + preperationTime +
                '}';
    }
}
