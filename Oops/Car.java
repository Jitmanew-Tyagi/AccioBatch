public class Car {
    private int price;
    private String colour;
    private int seatingCap;

    public int getPrice() {
        return price;
    }

    public int getSeatingCap() {
        return seatingCap;
    }

    public String getColour() {
        return colour;
    }

    public void setPrice(int newPrice) {
        price = newPrice;
    }

    public void run(int speed) {
        System.out.println("Runnig at speed " + speed);
    }

    public void horn() {
        System.out.println("HOOOOONK");
    }
}