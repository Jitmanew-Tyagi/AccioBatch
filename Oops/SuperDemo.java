class Parent {
    static float pi = 3.14f;
    int x = 0;
    public Parent () {
        System.out.println("Parent Constructor");
    }
    public Parent (int x) {
        System.out.println("Parent Param Constructor" + x);
    }
    public void changePi() {
        this.pi = 3.0f;
    }
}

class Child extends Parent{
    int x = 1;
    public int givex() {
        return super.x;
    }

    public Child () {
        System.out.println("Child Constructor");
    }

    public Child (int x) {
        super(x);
        System.out.println("Child Param Constructor");
    }

    @Override
    public void changePi() {
        this.pi = 3.11f;
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        Child child1 = new Child(5);
        Child child2 = new Child(5);
        System.out.println(child1.pi);
        System.out.println(child2.pi);
        child1.changePi();
        System.out.println(child1.pi);
        System.out.println(child2.pi);
    }
 
}