public class Client {
    public static void main(String[] args) {
    //    IphXPro i = new IphXPro();
    //    System.out.println(i.camQuality);
        IphX ph1 = new IphX();
        IphX ph2 = new IphX("1 param constructor");
        IphX ph3 = new IphX("2 param", "constructor");
    }
}