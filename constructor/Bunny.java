public class Bunny {
    
    private String color;

    public Bunny(String color) {
        this.color = color;
    }

    public Bunny() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        Bunny b = new Bunny("Соросинкяво");
    }
}
