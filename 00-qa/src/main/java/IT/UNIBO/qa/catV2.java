package IT.UNIBO.qa;

public class catV2 {
    private static int nine = 9;
    static public int numberOfLives = nine;

    public String Name;
    public String Breed;
    public String Color;
    public int Age;

    public catV2(String meow, final String color, final int age, final String korat) {
        this.Name = meow;
        this.Color = color;
        this.Age = age;
        this.Breed = korat;
    }

    public String Meow() {
        return "Meow, meow, I am " + Name + ", hear me purr, In this feline world, I'm the star, that's for sure. With whiskers long and fur so sleek, I'm here to share my story, so take a peek!"; 
    }
    
    void setColor(String color) {
        this.Color = color;
    }

    public final String getColor() {
        return this.Color;
    }

    public final int hasSameColor(catV2 cat) {
        if (this.Color == cat.Color) {
            return 1;
        } else {
            return 0;
        }
    }

    public final String getName() {
        return this.Name;
    }

    public final String getBreed() {
        return this.Breed;
    }

    public static void main(final String[] args) {
        catV2 cat1 = new catV2("Kiri", "Gray", 4, "korat");

        System.out.println(cat1.Meow());
    }
}
