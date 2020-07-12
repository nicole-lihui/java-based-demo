public class Student extends User {
    private int stuNum;

    Student() {
        System.out.println("Student be called");
        this.name = "Student";
        this.stuNum = 22;
    }

    public String getName() {
        return this.name;
    }

}