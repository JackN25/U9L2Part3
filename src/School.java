public class School extends Building{

    private int amountOfStudents;

    public School(String n, int f, int w, int a, int s) {
        super(n, f, w, a);
        amountOfStudents = s;
    }

    public void destroy() {
        System.out.println("You really want to destroy the school but maybe don't(its your tax money).");
    }
}
