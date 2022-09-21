public class IphX {

    public IphX () {
        System.out.println("Non parametrized constructor");
    }

    public IphX (String str) {
        System.out.println(str);
    }

    public IphX (String str, String str2) {
        System.out.println(str + " " + str2);
    }

    int camQuality = 64;
    int displaySize = 6;
}