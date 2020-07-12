public class User {
    private String name;

    User() {
        this.name = "User";
    }

    public void show() {
        System.out.printf("Name : %s\n", this.name);
    }

    public void f1() {
        System.out.println("User f1");
    }
}