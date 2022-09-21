class Student {
    String name = "ABC";
    int perc = 75;
    static String institute = "Accio"; 
}

public class StaticExample {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println(s1.name);
        System.out.println(s2.name);
        s1.name = "Aniket";
        System.out.println(s1.name);
        System.out.println(s2.name);
        s1.institute = "AccioSchool";
        System.out.println(s1.institute);
        System.out.println(s2.institute);
        System.out.println(Student.institute);
    }
}