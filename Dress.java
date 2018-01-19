public class Dress {
    private int size;
    private String brend;
    private int price;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    private int count;

    public Dress(int size, String brend, int price, int count) {
        this.size = size;
        this.brend = brend;
        this.price = price;
        this.count = count;
    }

    public Dress() {
    }

    public Dress(int size, String brend) {
        this.size = size;
        this.brend = brend;
    }

    public Dress(int size, String brend, int price) {
        this.size = size;
        this.brend = brend;
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
