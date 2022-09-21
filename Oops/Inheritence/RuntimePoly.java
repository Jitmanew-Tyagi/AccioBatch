class Parent {
    public void invest () {
        System.out.println("Invest in FD");
    }
}

class Child extends Parent{
    @Override
    public void invest () {
        System.out.println("Invest in Stocks");
    }

    public void party() {
        System.out.println("Party");
    }
}



public class RuntimePoly {
    public static void main(String[] args) {
        Child object = new Child(); //Reference of parent, obj of child, props will depend on (whose object is created) child 
        object.party();
    }
}