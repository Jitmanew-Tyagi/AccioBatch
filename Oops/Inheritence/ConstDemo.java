class GrandParent {
    public GrandParent () {
        System.out.println("GrandParent Constructor");
    }
    public GrandParent (int x) {
        System.out.println("GrandParent Parame Constructor" + x);
    }

}

class Parent extends GrandParent{
    public Parent () {
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent{
    public Child () {
        System.out.println("Child Constructor");
    }
}

public class ConstDemo {
    public static void main(String[] args) {
        GrandParent child = new GrandParent(5);
    }
}