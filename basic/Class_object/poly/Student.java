public class Student extends User {
    private String name;

    Student() {
        this.name = "Student";
    }

    public void show() {
        System.out.printf("Name : %s\n", this.name);
    }

    public void f1() {
        super.f1();
    }

}