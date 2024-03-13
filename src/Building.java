public class Building {
    private int floors;
    private int windows;
    private int area;
    private String name;
    public Building(String n, int f, int w, int a) {
        name = n;
        floors = f;
        windows = w;
        area = a;
    }

    public void enter() {
        System.out.println("You have entered the building called: " + name);
        System.out.println("You aren't sure if you should be here or not...");
    }
}
