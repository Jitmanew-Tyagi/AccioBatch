public class Client {
    public static void main(String[] args) {
        Car i10 = new Car();
        // i10.colour = "White";
        // i10.seatingCap = 5;
        i10.setPrice(700000);
        System.out.println(i10.getPrice());
        i10.run(50);
        i10.horn();
    }
}