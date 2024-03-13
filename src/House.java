public class House extends Building{
    private int amountOfResidents;

    public House(String n, int f, int w, int a, int r) {
        super(n, f, w, a);
        amountOfResidents = r;
    }

    public void returnHome() {
        System.out.println("After a long day you finally came back home.\nYour day has officially went from bad to terrible because you couldn't find your keys.");
    }
}
