public class User {
    protected String name;

    User() {
        System.out.println("User be called");
        this.name = "User";
    }

    public void show() {
        System.out.printf("Name : %s\n", this.name);
    }

}