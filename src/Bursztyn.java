public class Bursztyn {
    char[] color;
    double hardness;
    double density;
    int meltingPoint;

    //let's create our own constructor
    Bursztyn(char[] color, double hardness, double density, int meltingPoint){
        this.color = color;
        this.hardness = hardness;
        this.density = density;
        this.meltingPoint = meltingPoint;
    }

    //stworzymy metodę do wyświetlania info o bursztynie
    void display(){
        System.out.println("-----------------");
        System.out.print("Barwa: ");
        for (char c : color){
            System.out.print(c);
        }
        System.out.println();
        System.out.println("Twardość: " + hardness);
        System.out.println("Gęstość: " + density);
        System.out.println("Temperatura topnienia: " + meltingPoint);
    }

    //let's create a method which makes a convertion
    //from Celsius -> Fahrenheit melting point of an amber
    double Zamiana(){
        int celsius = meltingPoint;
        double fahrenheit = 2 * (celsius - (0.1*celsius)) + 32;
        return fahrenheit;
    }

    //let's create another method which increses a density of an amber
    //by a number passed on to our method
    double powiekszGestosc(double increase){
        density = density + increase;
        return density;
    }
}
