package week4.student;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("Name: "+ s1.getName());
        System.out.println("Class: "+ s1.getClasses());
        s1.setName("loi");
        s1.setClasses("SE18D08");
        System.out.println("Name(sau khi set): "+ s1.getName());
        System.out.println("Class(sau khi set): "+ s1.getClasses());
    }
}
